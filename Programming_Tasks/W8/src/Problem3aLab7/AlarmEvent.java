package Problem3aLab7;
//1. Create a class for the event object
public class AlarmEvent {
    private int nrings; // remaining number of rings;

    public AlarmEvent(int nrings){
        this.nrings = nrings;
    }

    public int getNrings(){
        return nrings;
    }

}
