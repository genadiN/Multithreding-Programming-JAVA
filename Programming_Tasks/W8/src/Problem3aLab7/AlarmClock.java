package Problem3aLab7;

import java.rmi.AlreadyBoundException;
import java.time.LocalDateTime;

// Callback in the lecture
// 3. Describes the event source i.e. the callback
public class AlarmClock {
    // reference to service provider (the subscriber)
    private AlarmListener alarm ;
    private final int INTERVAL = 2;
    private int nrings; // number of rings
    private long currentTime;
    private long ringAfter;

    public AlarmClock(int nrings , long currentTime , long ringAfter){
       setNrings(nrings);
       this.currentTime = currentTime;
       this.ringAfter = ringAfter;
    }
    // Used by the subscriber to subscribe for the alarm event
    public void addAlarmListener(AlarmListener alarm){
        this.alarm = alarm;
    }

    public long getRingAfter(){
        return ringAfter;
    }
    // Used to fire (execute) the method for handling the event
    // Handle the event
    public void onAlarm(AlarmEvent e ){
        if( alarm != null){ // Obligatory!
            // Someone subscribed for the Alarm event
            // Invoke the event handler;
            alarm.alarmActionPerformed(e);
        }
    }

    //event handling method
    public void start(){
        LocalDateTime dt = LocalDateTime.now();
        int newTime;
        int passedSecond = 0;
        var seconds = dt.getSecond();
        System.out.printf("Wait to ring &d%n" , ringAfter);
        while(System.currentTimeMillis() - currentTime < ringAfter);
        System.out.printf("Ringings...%n");
        var num2Ring = nrings;
        for(;;){
            newTime = LocalDateTime.now().getSecond()/INTERVAL;
            if( newTime > passedSecond){
                num2Ring--;
                if(num2Ring< 0){
                    break;
                }else{
                    AlarmEvent e = new AlarmEvent(num2Ring);
                    onAlarm(e);
                }
            }
            passedSecond = newTime;

        }
    }

    public int getNrings(){
        return nrings;
    }

    public void setNrings(int nrings){
        this.nrings = nrings > 0 ? nrings : 1;
    }

}
