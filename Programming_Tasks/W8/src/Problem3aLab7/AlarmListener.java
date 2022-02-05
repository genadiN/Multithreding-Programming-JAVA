package Problem3aLab7;
// 2. Interface with abstract methods
// Each method describes a service to
// implemented by the subscriber.
//Note : all such methods must be void
public interface AlarmListener {
    void alarmActionPerformed(AlarmEvent args);
}
