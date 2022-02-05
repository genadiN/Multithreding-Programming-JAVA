package Date;

public class EmployeeTest {
    public static void main(String[] args) {
        System.out.printf("Employees before instantiaton: %d\n",
                Employee.getCount());



        Date birth = new Date(7, 24, 1949);
        Date hire = new Date(3,12,1968);
        Employee employee = new Employee("John" , "Smith", birth, hire);
        System.out.println(employee);

        //create two Employees; count should be 2
        Employee e1 = new Employee("Susane" , "Baker" , birth , hire);
        Employee e2 = new Employee("Bob" , "Wilson", birth, hire);

        System.out.println("\nEmployees after instantiation: ");
        System.out.printf("vie e1.getCount(): %d\n" , e1.getCount());
        System.out.printf("vie e2.getCount(): %d\n", e2.getCount());
        System.out.printf("vie Employee.getCount(): %d\n", Employee.getCount());

        //get names of Employees
        System.out.printf("\nEmployee 1: %s %s\nEmployee 2: %s %s \n",
                e1.getFirstName(), e1.getLastName(),
                e2.getFirstName(), e2.getLastName()) ;

        //in this example, there is only one reference to each Emplyee,
        //so the following two statements cause JVM to mark each
        //Employee object for garbage collection
        e1 = null;
        e2 = null;
        System.gc(); // ask for garbage collection to occur now
        Runtime.getRuntime().runFinalization();

        //show Employee count after calling garbage collector; count
        //displayed may be 0, 1 or 2 baesd on whether garbage collector
        //executes immediately and number of Employee objects collected
        System.out.printf("\nEmployees after System.gc(): %d\n",
                Employee.getCount() );
    }//end main
}//end class EmployeeTest
