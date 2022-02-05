package lab8aZad1;

public class Car implements Comparable<Car> {
    private String model;
    private int year;

    public Car(String model , int year){
        this.model = model;
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    @Override
    public int compareTo(Car o) {
        if(this.getYear() > o.getYear()){
            return 1; // > 0
        }
        if(this.getYear() < o.getYear()){
            return -1; // < 0
        }
        return 0;
        //return this.getYear() - o.getYear()
    }

    public  String toString(){
        return "Model: " + model + "; year: "
               + year;
    }

    // PriorityQueueTest ->
    // PriorityQueue<> queue = new PriorityQueue<>(); -> ascending order
    // PriorityQueue<> queue = new PriorityQueue<>(Collections.reverseOrder())
    // ->descending order
}
