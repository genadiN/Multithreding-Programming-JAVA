package app;

import lib.MedicinalProduct;
import lib.ProductCategory;
import lib.ProductSupplier;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StatisticData {

    private static List<MedicinalProduct> data;

    // data setter
    public static void setData() {
        StatisticData.data = supplyProducts();
    } // end data setter

    // data getter
    public static List<MedicinalProduct> getData() {
        return data;
    } // end data getter

    private static List<MedicinalProduct> supplyProducts() {
        List<MedicinalProduct> list = new ArrayList<>();

        List<ProductCategory> categoriesValues = Arrays.asList(ProductCategory.values());
        List<ProductSupplier> suppliersValues = Arrays.asList(ProductSupplier.values());
        final int CATEGORIES = categoriesValues.size();
        final int SUPPLIERS = suppliersValues.size();

        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            ProductCategory cat = categoriesValues.get(random.nextInt(CATEGORIES));
            ProductSupplier sup = suppliersValues.get(random.nextInt(SUPPLIERS));
            int quantity = 10 + random.nextInt(90);
            double price = random.nextDouble(100.01);

            MedicinalProduct product = new MedicinalProduct(sup, cat, quantity, price);
            list.add(product);
        }

        return list;
    } // end method supplyProducts

    public static boolean tooManyUndefined(){
        long size = data.size();;
        double tenPercent = size*0.1;
        long countCatD = data.stream()
                .filter(x->x.getCategory()==ProductCategory.E)
                .count();
        if(countCatD>tenPercent)
            return true;

        return false;
    } // end method tooManyUndefined

    public static void totalCostUndefined()
    {
        double sum = data.stream()
                .filter(x->x.getCategory()==ProductCategory.E)
                .mapToDouble(x-> x.getPrice()*x.getQuantity())
                .sum();
        System.out.printf("The total cost of Undefined products is $%.2f\n", sum);
    } // end method totalCostUndefined

    public static void groupSupplierProductsSorted(){

        Map<ProductSupplier, List<MedicinalProduct>> bySupplier = data.stream()
                .collect(Collectors.groupingBy(MedicinalProduct::getSupplier));

        bySupplier.forEach(
                (sup, products) ->
                {
                    System.out.printf("Supplier %s supplies: ", sup);

                    List<String> categories = products.stream()
                            .map(MedicinalProduct::getCategory)
                            .distinct()
                            .sorted()
                            .map(ProductCategory::getDescription)
                            .collect(Collectors.toList());

                    System.out.printf("%s\n", categories);
                }
        ); // end forEach bySupplier

    } // end method groupSupplierProductsSorted

    public static void groupByCategoryCounting()
    {
        Map<ProductCategory, Long> byCat = data.stream()
                .collect(Collectors.groupingBy(MedicinalProduct::getCategory,
                        TreeMap<ProductCategory, Long>::new, Collectors.counting()));
        byCat.forEach(
                (cat, count) -> System.out.printf("Category %s contains %d products\n",
                        cat.toString(), count)
        );// end forEach

    } // end method groupByCategoryCounting

    public static void main(String[] args) {

        setData();

        System.out.println("Executing tooManyUndefined()");
        System.out.printf("Has too many undefined: %b\n", tooManyUndefined());
        System.out.println();

        System.out.println("Executing totalCostUndefined()");
        totalCostUndefined();
        System.out.println();

        System.out.println("Executing groupSupplierProductsSorted ()");
        groupSupplierProductsSorted();
        System.out.println();

        System.out.println("Executing groupByCategoryCounting()");
        groupByCategoryCounting();

    } // end method main

} // end class StatisticData
