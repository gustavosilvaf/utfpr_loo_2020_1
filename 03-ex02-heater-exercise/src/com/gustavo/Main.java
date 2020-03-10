package com.gustavo;

public class Main {

    public static void main(String[] args) {
        Heater h = new Heater(3, 18);
        h.setIncrement(3);
        h.cool();
        System.out.println("Temperature:"+h.getTemperature());
        h.cool();
        System.out.println("Temperature:"+h.getTemperature());
        h.cool();
        System.out.println("Temperature:"+h.getTemperature());
        h.cool();
        System.out.println("Temperature:"+h.getTemperature());
        h.cool();//no effect
        System.out.println("Temperature:"+h.getTemperature());
        h.cool();//no effect
        System.out.println("Temperature:"+h.getTemperature());
        h.warmUp();
        System.out.println("Temperature:"+h.getTemperature());
        h.warmUp();
        System.out.println("Temperature:"+h.getTemperature());
        h.warmUp();
        System.out.println("Temperature:"+h.getTemperature());
        h.warmUp();
        System.out.println("Temperature:"+h.getTemperature());
        h.warmUp();
        System.out.println("Temperature:"+h.getTemperature());
        h.warmUp();//no effect
        System.out.println("Temperature:"+h.getTemperature());
        h.warmUp();//no effect
        System.out.println("Temperature:"+h.getTemperature());
    }
}
