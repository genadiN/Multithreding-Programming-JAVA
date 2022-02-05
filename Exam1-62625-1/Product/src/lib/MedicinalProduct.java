package lib;

import java.util.Objects;

public class MedicinalProduct implements Comparable<MedicinalProduct>{
    private ProductSupplier supplier;
    private ProductCategory category;
    private int quantity;
    private double price;
    private static long counter = 1;
    private final String INV_NUMBER;

    // default constructor
    public MedicinalProduct() {
        this(null, null, 0, 0);
    } // end default constructor

    //All-purpose constructor
    public MedicinalProduct(ProductSupplier supplier,
                            ProductCategory category,
                            int quantity,
                            double price) {
        setSupplier(supplier);
        setCategory(category);
        setQuantity(quantity);
        setPrice(price);
        INV_NUMBER = String.format("%07d", counter);
        counter++;
    } // end constructor

    // copy constructor
    public MedicinalProduct(MedicinalProduct medicinalProduct) {
        this(medicinalProduct.getSupplier(),
                medicinalProduct.getCategory(),
                medicinalProduct.getQuantity(),
                medicinalProduct.getPrice());
    } // end copy constructor

    public ProductSupplier getSupplier() {
        return supplier;
    }

    private void setSupplier(ProductSupplier supplier) {
        if (supplier != null)
            this.supplier = supplier;
        else
            this.supplier = ProductSupplier.D;
    }

    public ProductCategory getCategory() {
        return category;
    }

    private void setCategory(ProductCategory category) {
        if (category != null)
            this.category = category;
        else
            this.category = ProductCategory.E;
    }

    public int getQuantity() {
        return quantity;
    }

    private void setQuantity(int quantity) {
        if (quantity > 0)
            this.quantity = quantity;
        else
            this.quantity = 0;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        if (price > 0)
            this.price = price;
        else
            this.price = 0;
    }

    public String getINV_NUMBER() {
        return INV_NUMBER;
    }

    @Override
    public String toString() {
        return String.format("Number : %s\n" +
                        "Supplier: %s\n" +
                        "Category: %s\n" +
                        "Quantity: %d\n" +
                        "Price: %.2f\n",
                getINV_NUMBER(), getSupplier(),
                getCategory(), getQuantity(), getPrice());
    }

    @Override
    public int compareTo(MedicinalProduct o) {
        int otherInv = Integer.parseInt(o.INV_NUMBER);
        int thisInv = Integer.parseInt(this.INV_NUMBER);

        if(thisInv>otherInv)
            return 1;

        if(thisInv<otherInv)
            return -1;

        else
            return 0;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MedicinalProduct)) return false;
        MedicinalProduct that = (MedicinalProduct) o;
        return getSupplier() == that.getSupplier() && getCategory() == that.getCategory();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSupplier(), getCategory());
    }
} // end class MedicinalProduct
