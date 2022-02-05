package lab9azad1a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaDemo {
    public static void main(String[] args) {
        Predicate<Salesperson> predicate1;
        Predicate<Salesperson> predicate2;
        Predicate<Salesperson> predicate;
        Consumer<Salesperson> consumer1;
        Consumer<Salesperson> consumer2;
        Comparator<Salesperson> comparator1;
        Comparator<Salesperson> comparator2;

        predicate1 = s -> s.getNumSales() < 1200;
        // ako getNumSales < 1200 -> predicate = true;
        // prediacte = (Salesperson s) -> s.getNumSales() < 1200;
        predicate2 = salesperson -> salesperson.getNumSales() > 900;
        //predicate2 = salesperson ->{
        //     if( salesperson.getNumSales() > 900){
        //     return true;
        //     }else return false;
        //  }
        //
        predicate = predicate1.and(predicate2);
        //predicate = predicate.or(predicate2);

        consumer1 = salesperson -> {
            salesperson.setSalary(salesperson.getSalary() * 1.05);
            System.out.println("Salary up by 5% : " +
                    salesperson.getSalary());

        };

        consumer2 = salesperson -> {
            if (predicate1.test(salesperson)) {
                salesperson.getSalary(salesperson.getSalary() * 1.02);
            } else {
                salesperson.setSalary(salesperson.getSalary() * 0.98);
            }
            System.out.println(salesperson.toString());
        };

        comparator1 = (s1, s2) -> (int) (s2.getSalary() - s1.getSalary());
        // multiply by 100 for accuracy

        comparator2 = (s1, s2) -> s1.getSalary() == s2.getSalary() ?
                s1.getNumSales() - s2.getNumSales() :
                comparator1.compare(s1, s2);

        Random random = new Random();

        Salesperson[] salespersons = {
                new Salesperson("John Doe", 2000, 949);
        new Salesperson("Jane Doe ", 3900, 1500);
        new Salesperson("Carl Doe", 2000 + random.nextInt(501)
                , 500 + random.nextInt(1500));
        new Salesperson("Betty Doe ", 3900 + random.nextInt(501),
                500 + random.nextInt(1500));
        new Salesperson("Ned Doe", 2000 + random.nextInt(501),
                500 + random.nextInt(1500));
        new Salesperson("Ann Doe ", 3900 + random.nextInt(501),
                500 + random.nextInt(1500));
        new Salesperson("Derek Doe", 2000 + random.nextInt(501),
                500 + random.nextInt(1500));
        new Salesperson("Ben Doe ", 3900 + random.nextInt(501),
                500 + random.nextInt(1500));
        new Salesperson("Eve Doe", 2000 + random.nextInt(501),
                500 + random.nextInt(1500));
        new Salesperson("Adam Doe ", 3900 + random.nextInt(501),
                500 + random.nextInt(1500));
        new Salesperson("Jake Doe", 2000 + random.nextInt(501),
                500 + random.nextInt(1500));
        new Salesperson("Ken Doe ", 3900 + random.nextInt(501),
                500 + random.nextInt(1500));
        };
        List<Salesperson> listOfSalespersons = new ArrayList<>()
    }

    public static void applybonus(Salesperson salesperson,
                                  Prediate<Salesperson> predicate,
                                  Consumer<Salesperson> consumer) {
        if (salesperson == null || predicate == null || consumer == null) {
            return;
        }
        if (predicate.test(salesperson)) {
            consumer.accept(salesperson);
        }
    }

    public static void applybonus(List<Salesperson> salespersons,
                                  Prediate<Salesperson> predicate,
                                  Consumer<Salesperson> consumer) {
        if (salespersons == null || predicate == null || consumer == null) {
            return;
        }
        for (Salesperson s : salespersons) {
            if (predicate.test(s)) {
                consumer.accept(s);
            }
        }
    }

    public static void sort(List<Salesperson> salespersons,
                            Comparator<Salesperson> comparator) {
        if (salespersons == null || comparator == null) {
            return;
        }
        salespersons.sort(comparator);
    }

    public static void group(List<Salesperson> salespersoons) {
        salespersoons.stream()
                .collect(Collectors.groupingBy(salespersoons -> salespersoons.getName().charAt(0) , Collectors.toList()));
        .forEach((character , salespeople) -> System.out.printf("\"%c\"\t\t%s\n" , character , salespeople));
    }
}



