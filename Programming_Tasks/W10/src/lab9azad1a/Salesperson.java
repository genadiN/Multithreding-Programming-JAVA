package lab9azad1a;
package lambdasamples;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * @author echrk
 */
@FunctionalInterface
interface Adder<T extends Salesperson>{
    T add (T op1, T op2);
    default String printNumSales (T obj){
        return "Adder " + obj.getNumSales() ;
    }
    static void printSales(Salesperson s)
    {
        System.out.println(s.getNumSales());
    }
}
public class Salesperson implements Adder<Salesperson>
{
    private String name;
    private double salary;
    private int numsales;

    public   Salesperson(String name, double salary, int numsales)
    {
        this.name = name;
        this.salary = salary;
        this.numsales = numsales;
    }

    public   void addBonus(double amount)
    {
        salary += amount;
    }

    public   int getNumSales()
    {
        return numsales;
    }
    public   double getSalary()
    {
        return salary;
    }
    public  String printNumSales (Salesperson obj){

        return String.format("%s Sales: %d",Adder.super.printNumSales(obj),
                obj.getNumSales());
    }

    public static List<Salesperson> distinct (List<Salesperson> list) {
        //
        return new ArrayList<Salesperson>();
    }
    @Override
    public String toString()
    {
        return String.format("name: %s, salary: %.2f numsales: %d ",
                name, salary, numsales);
    }

    @Override
    public Salesperson add(Salesperson op1, Salesperson op2) {
        return new Salesperson(op1.name, op1.salary, op1.numsales+ op2.numsales); //To change body of generated methods, choose Tools | Templates.
    }
}
class LambdaDemo
{
    public static void main(String[] args)
    {
        Predicate<Salesperson> predicate1; // да се инициализира
        Predicate<Salesperson> predicate2; // да се инициализира
        Predicate<Salesperson> predicate ; // да се инициализира

        Consumer<Salesperson> consumer1; // да се инициализира
        Consumer<Salesperson> consumer2; // да се инициализира

        Comparator<Salesperson> comparator1; // да се инициализира
        Comparator<Salesperson> comparator2; // да се инициализира

        Salesperson[] salespersons =
                {
                        new Salesperson("John Doe", 2000, 949),
                        new Salesperson("Jane Doe", 3900, 1500)
                        // да се добавят  още 10 обекти от тип Salesperson
                        // или да се инициализират с Random стойности

                };
        System.out.println(salespersons[0].printNumSales(salespersons[1]));

//      List<Salesperson> listOfSalespersons = new ArrayList<>();
//      // обектите на salespersons да се запишат в listOfSalespersons
//      for (Salesperson salesperson: salespersons)
//      {
//         applyBonus(salesperson, predicate1,   consumer1);
//         System.out.println(salesperson);
//         salesperson.printNumSales(salesperson);
//
//      }
//      for (Salesperson salesperson: salespersons)
//      {
//         applyBonus(salesperson, predicate2,  consumer2);
//         System.out.println(salesperson);
//      }
//      sort(listOfSalespersons, comparator1);
//      System.out.println(listOfSalespersons);
//
//      sort(listOfSalespersons, comparator2);
//      System.out.println(listOfSalespersons);

    }

    public static void applyBonus(Salesperson salesperson,
                                  Predicate<Salesperson> predicate,
                                  Consumer<Salesperson> consumer)
    {
        // Напишете if  команда, където използвайте predicate
        //    за да определите дали да изпълните consumer
        // Изпълнете consumer, когато условието на if  командата е изпълнено
    }

    public static void applyBonus(List<Salesperson> salespersons,
                                  Predicate<Salesperson> predicate,
                                  Consumer<Salesperson> consumer)
    {
        // Напишете if  команда, където използвайте predicate
        //    за да определите дали да изпълните consumer
        // Изпълнете consumer, когато условието на if  командата е изпълнено
    }

    public static void sort(List<Salesperson> salespersons,
                            Comparator<Salesperson> comparator)
    {
        // Сортирайте  salespersons като използвате  comparator
    }

}
