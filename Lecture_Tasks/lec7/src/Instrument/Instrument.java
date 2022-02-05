package Instrument;

public interface Instrument {
    //compile - time constant;
    int i = 5; // static and final
    //Cannot have method definitions
    void play(); // Automatically public
    String what();
    void adjust();
}
