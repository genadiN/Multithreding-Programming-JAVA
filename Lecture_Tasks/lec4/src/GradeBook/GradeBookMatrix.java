package GradeBook;

public class GradeBookMatrix {
    private String courseName; // name of course this GradeBook represents
    private int grades[][];// two-dimensional array of students grades

    //two argument constructor initializes courseName and grades array
    public GradeBookMatrix(String name , int gradesArray[][]){
        setCourseName(name);// initialize courseName
        grades = gradesArray;//initialize grades array
    }//end two argument constructor

    //method to set the course name
    public void setCourseName(String name){
        if (name != null){
            courseName = name;
        }else{
            courseName = "No nmae";
        }
    }//end method setCourseName

    public String getCourseName(){
        return courseName;
    }//end method getCourseName

    //display a welcome message to the GradeBook user
    public void displayMessage(){
        //getCourseName gets the name of the course
        System.out.printf("Welcome to the grade book for\n%s!\n\n",
                getCourseName());
    }//end method displayMessage

    //perform various operations on the data
    public void processGrades(){
        //output grades array
        outputGrades();

        //call method getMinimum and getMaximum
        System.out.printf("Lowest grade is 5d\nHighest grade is %d\n",
                getMinimum() , getMaximum());

        //call outputBarchart to print grade distribution chart
        outputBarChart();
    }//end method processGrades

    //find minimum grade
    public int getMinimum() {
        int lowGrade = grades[0][0];// assume grades[0] is smallest
        // loop through grades array
        for (int studentGrades[] : grades) {
            //loop through columns of current row
            for(int grade : studentGrades) {
                //if grade lower than lowGrade, assign it to lowGrade
                if (grade < lowGrade) {
                    lowGrade = grade;// new lowest grade
                }//end if
            }//end inner for
        }//end outer for
        return lowGrade;//return lowest grade
    }//end method getMinimum

    public int getMaximum(){
        int highGrade = grades[0][0];

        //loop through grades array
        for(int studentGrades[] : grades){
            //loop through columns of current row
            for(int grade : studentGrades) {
                //if grade greater than highGrade, assign it to highCrade
                if (highGrade < grade) {
                    highGrade = grade;//new highest grade
                }//end if
            }//end inner for
        }//end outer for
        return highGrade;//return highest grades
    }//end method getMaximum

    //determine average grade for test
    public double getAverage(int setOfGrades[]){
        int total = 0; // initialize total

        //sum grades for one student
        for(int grade : setOfGrades){
            total += grade;
        }
        //return average of grades
        return (double)total / setOfGrades.length;
    }//end method getAverage

    //output bar chart displaying grade distribution
    public void outputBarChart(){
        System.out.println("Overall in each range of 10 grades");

        //stores frequency of grades in each range of 10 grades
        int frequency[] = new int[ 11 ];

        //for each grade , increment the appropriate frequency
        for(int studentGrades[]: grades){
            for(int grade: studentGrades){
                ++frequency[ grade / 10 ];
            }//end inner for
        }//end outer for

        //for each grade frequency, print bar in chart
        for(int counter = 0; counter < frequency.length; counter++){
            //output bar label
            if(counter == 10){
                System.out.printf("%5d" , 100);
            }else{
                System.out.printf("%02d-%02d: ",
                        counter * 10, counter * 10 + 9);
            }

            //print bar of asteriks
            for(int stars = 0; stars< frequency[counter] ; stars++){
                System.out.printf("*");
            }
            System.out.println(); // start a new line of output
        }//end outer for
    }//end method outputBarChart

    //output the contents of the grades array
    public void outputGrades() {
        System.out.println("The grades are:\n");
        System.out.print("              ");//align column heads

        //create a column heading for each of the tests
        for (int test = 0; test < grades[0].length; test++) {
            System.out.printf("Test %d ", test + 1);
        }
        System.out.println("Average"); // student average column heading

        //create rows/columns of text representing array grades
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d", student + 1);
            for (int test : grades[student]) { // output student's grades
                System.out.printf("%8d", test);
            }
            //call method getAverage to calculate student's average grade;
            //pass row of grades as the argument to getAverage
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f\n", average);
        }//end outer for
    }//end method outputGrades
}//end class GradeBookMatrix
