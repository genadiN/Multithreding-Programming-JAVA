package GradeBook;

public class GradeBookTest {
    public static void main(String[] args) {
        //array of student grades
        int gradesArray[] = {87, 94, 68, 100, 83, 78, 85, 91, 76,87};

        GradeBook gradebook = new GradeBook("JAVA programming" , gradesArray);
        gradebook.displayMessage();
        gradebook.processGrades();
    }//end main
}//end class GradeBookTest

