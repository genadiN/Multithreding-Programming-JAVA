package problem6;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeTest {
    List<Employee> employees;
    @Before
    public void setup() {
        employees = new ArrayList<>();
        employees.add(new Employee(123, "Jack", "Johnson", LocalDate.of(1988,
                Month.APRIL, 12)));
        employees.add(new Employee(345, "Cindy", "Bower", LocalDate.of(2011,
                Month.DECEMBER, 15)));
        employees.add(new Employee(567, "Perry", "Node", LocalDate.of(2005,
                Month.JUNE, 07)));
        employees.add(new Employee(467, "Pam", "Krauss", LocalDate.of(2005,
                Month.JUNE, 07)));
        employees.add(new Employee(435, "Fred", "Shak", LocalDate.of(1988,
                Month.APRIL, 17)));
        employees.add(new Employee(678, "Ann", "Lee", LocalDate.of(2007,
                Month.APRIL, 12)));
    }
    public void sortAscendingOrder(){
        employees.stream()
                .sorted(Comparator.comparing(Employee::getEmployeeNumber))
                .forEach(System.out::println);

    }

    public void sortDescendingOrder(){
        employees.stream()
                .sorted((e1 , e2) -> e2.getHireDate().compareTo(e1.getHireDate()))
                .forEach(System.out::println);
    }

    public void tenure(){
        employees.stream()
                .reduce((e1 , e2) -> e2.getHireDate().compareTo(e1.getHireDate()) > 0
                ? e1 : e2 )
        .ifPresent(System.out :: println);


    }

    @Test
    public void sortNames(){
        employees.stream()
                .sorted(Comparator.comparing(Employee::getEmployeeFirstName)
                            .thenComparing((e1 , e2) -> e2.getEmployeeLastName().compareTo(e1.getEmployeeLastName())))
                .forEach(System.out::println);
    }

    // Unit testing
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(EmployeeTest.class);
        for(Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
    /*
    public static void main(String[] args) {
        EmployeeTest test = new EmployeeTest();
        test.setup();

        System.out.println("By number: ");
        test.sortAscendingOrder();

        System.out.println("By hire date: ");
        test.sortDescendingOrder();

        System.out.println("Tenure: ");
        test.tenure();

        System.out.println("Sort names: ");
        test.sortNames();
    }*/
}
