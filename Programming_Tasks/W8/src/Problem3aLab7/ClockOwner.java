package Problem3aLab7;
//4. The subscriber
public class ClockOwner //implements AlarmListener

{
    // the subscriber MUST know about his AlarmClock
    private AlarmClock clock;

    public ClockOwner() {
        this.clock = new AlarmClock(10, System.currentTimeMillis(), 3000);
// 2. Subscribe for the event Alarm
//clock.addAlarmListener(this);
// Version with anonymous
        clock.addAlarmListener(new AlarmListener() {
            @Override
            public void alarmActionPerformed(AlarmEvent args) {
                System.out.printf("Clock rings remaining: %d%n", args.getNrings());
            }
        });
    }

// 1. Define Method for Alarm event handling

    public void alarmActionPerformed(AlarmEvent args) {
        System.out.printf("Clock rings remaining: %d%n", args.getNrings());
    }

    public AlarmClock getClock() {
        return clock;
    }
}
