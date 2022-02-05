package GradeBook;

public class GradeBook {
    private String courseName; // name of course this GradeBook represents
    private int grades[];// array of student grades

    //two argument constructor initializes courseName and grades array
    public GradeBook(String name , int gradesArray[]){
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

        // call method getAverage to calculate the average grade
        System.out.printf("\nClass average is %.2f\n" ,
                getAverage());

        //call method getMinimum and getMaximum
        System.out.printf("Lowest grade is 5d\nHighest grade is %d\n",
                getMinimum() , getMaximum());

        //call outputBarchart to print grade distribution chart
        outputBarChart();
    }//end method processGrades

    //find minimum grade
    public int getMinimum() {
        int lowGrade = grades[0];// assume grades[0] is smallest
        // loop through grades array
        for (int value : grades) {
            //if grade lower than lowGrade, assign it to lowGrade
            if (value < lowGrade) {
                lowGrade = value;// new lowest grade
            }//end if
        }//end for
        return lowGrade;//return lowest grade
    }//end method getMinimum

    public int getMaximum(){
        int highGrade = grades[0];

        //loop through grades array
        for(int value : grades){
            //if grade greater than highGrade, assign it to highCrade
            if(highGrade < value){
                highGrade = value;//new highest grade
            }//end if
        }//end for
        return highGrade;//return highest grades
    }//end method getMaximum

    //determine average grade for test
    public double getAverage(){
        int total = 0; // initialize total

        //sum grades for one student
        for(int grade : grades){
            total += grade;
        }
        //return average of grades
        return (double)total / grades.length;
    }//end method getAverage

    //output bar chart displaying grade distribution
    public void outputBarChart(){
        System.out.println("Grade distribution");

        //stores frequency of grades in each range of 10 grades
        int frequency[] = new int[ 11 ];

        //for each grade , increment the appropriate frequency
        for(int grade: grades){
            ++frequency[ grade / 10 ];
        }

        //for each grade frequency, print bar in chart
        for(int counter = 0; counter < grades.length; counter++){
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
    public void outputGrades(){
        System.out.println("The grades are:\n");

        //output each student's grade
        for(int student = 0; student < grades.length; student++){
            System.out.printf("Student %2d: %3d\n" , student + 1, grades[student]);
        }//end method outputGrades
    }//end class GradeBook

}
