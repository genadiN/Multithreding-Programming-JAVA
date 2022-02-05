import java.util.Scanner;

public class GradeBookTest{
    public static void main(String[] args) {
       GradeBook gradeBook1 = new GradeBook("Math");
        GradeBook gradeBook2 = new GradeBook("Chemistry");
        Scanner input = new Scanner(System.in);

      /*  System.out.printf("Initial course name is: %s%n%n",
                gradeBook1.getCourseName());
        System.out.printf("Initial course name is: %s%n%n",
                gradeBook2.getCourseName());
*/

        System.out.printf("gradeBook1 course name is: %s%n",
                gradeBook1.getCourseName());

        System.out.printf("gradeBook2 course name is: %s%n",
                gradeBook2.getCourseName());
        // prompt for and read course name
      /*  System.out.println("Please enter the course name: ");
        String nameOfCourse = input.nextLine();
        gradeBook.setCourseName(nameOfCourse);
        System.out.println();*/
        GradeBook gradeBook = new GradeBook("Biology");
        // display welcomme message after specifying course name
        gradeBook.displayMessage();
       // gradeBook.determineClassAverage(); // find average of 10 grades
        gradeBook.inputGrades();
        gradeBook.displayGradeReport();
    }
}
