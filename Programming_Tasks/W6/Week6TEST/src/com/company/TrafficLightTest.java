package com.company;

public class TrafficLightTest {
    public static void main(String[] args) {
        final long worktime = 12000;
        long start = System.currentTimeMillis();
        long testTime = start;
        while (testTime - start < worktime){
            long currentTime = System.currentTimeMillis();
            for(var trafficColor: TrafficLight.values() ){
                System.out.println(trafficColor);
                long colorCurrentTime = System.currentTimeMillis();
                while(colorCurrentTime - currentTime < trafficColor.getDuration()){
                    colorCurrentTime = System.currentTimeMillis();
                }
                currentTime = System.currentTimeMillis();
            }
            testTime = System.currentTimeMillis();
        }
    }
}
