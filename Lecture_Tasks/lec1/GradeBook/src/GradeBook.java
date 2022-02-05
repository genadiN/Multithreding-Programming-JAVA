import java.util.Scanner;

public class GradeBook {
    private String courseName; // course name for this GradeBook
    private int total; // sum o grades
    private int gradeCounter; // number of grades entered
    private int aCount; // count of A grades
    private int bCount; // count of B grades
    private int cCount; // count of C grades
    private int dCount; // count of D grades
    private int eCount; // count of E grades
    private int fCount; // count of F grades

    public GradeBook(String courseName){
        setCourseName(courseName); // initialize courseName
    } // end constructor

    // method to set the courseName
    public void setCourseName(String name){
        /*if(name != null){
            courseName = name;
        }else{
            courseName = "No name";
        }*/
        courseName = name != null? name: "No name";
    }

    // method to retrieve the courseName
    public String getCourseName(){
        return courseName;
    }

    // method for displaying a message
   public void displayMessage(){
       System.out.printf("Wlcome to the Grade Book " +
               "for%n%s!%n",getCourseName());
   }

   //input arbitrary number of grades from user
    public void inputGrades(){
        Scanner input = new Scanner ( System.in );
        int grade ; // grade entered by user

        System.out.printf("%s%n%s%n   %s%n   %s%n",
                "Enter the integer grades in the range 0-100.",
                "type the end-of-File indicator to terminate input: ",
                "On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
                "On Windows type <ctrl> z the press Enter" );
        while(input.hasNextInt()){
            grade = input.nextInt();
            total += grade;
            ++gradeCounter;

            //cal method to increment appropriate countet
            incrementLetterGradeCounter( grade );
        }
    }

    //add 1 to appropriate counter for specified grade
    public void incrementLetterGradeCounter(int grade){
        //determine which grade was entered
        switch(grade / 10){
            case 9: // grade was between 90
            case 10: // add 100
                ++aCount;
                break;
            case 8:
                ++bCount;
                break;
            case 7:
                ++cCount;
                break;
            case 6:
                ++dCount;
                break;
            default:
                ++fCount;
                break;

        }//end of switch
    }//end of method incrementLetterGradeCounter

    public void displayGradeReport(){
        System.out.printf("%nGrade Report: ");
        //if user entered at least one grade....
        if(gradeCounter != 0){
            //calculate average of all grades entered
            double average = (double) total / gradeCounter;
            System.out.printf("Totall of the %d grades entered is %d %n" , gradeCounter , total);
            System.out.printf("Class average is %.2f%n" , average);
            System.out.printf("%s %n%s%d %n%s%d %n%s%d %n%s%d %n%s%d %n" ,
                    "Number of students who received each grade: ",
                    "A: " , aCount , // display number of A grades
                    "B: " , bCount,
                    "C: " , cCount,
                    "D: " , dCount,
                    "F: " , fCount);
        }// end if
        else{
            System.out.println("No grades were entered!");
        }
    }

   // deterine class average based on 10 grades entered by user
    public void determineClassAverage(){
        Scanner input = new Scanner(System.in);
        int total; // sum of grades entered by user
        int gradeCounter; // numberof the grade to be entereed next
        int grade; // grade value entered by user
        int average; // average pf grades;

        total = 0;
        gradeCounter = 1;
        while(gradeCounter <= 10){
            System.out.print("Enter grade: ");
            grade = input.nextInt();
            total = total + grade;
            gradeCounter += 1;
        }
        average = total / 10;

        System.out.printf("%ntotal of all 10 grades is %d%n" , total);
        System.out.printf("Class average is %d%n" , average);
    }//end method determineClassAverage
}//end class GradeBook
