public enum TrafficLight {
    RED(3000) , YELLOW(1000) , GREEN(3000);
    private long duration;

    private TrafficLight(long duration){
        this.duration = duration;
    }

    public long getDuration() {
        return duration;
    }

}
