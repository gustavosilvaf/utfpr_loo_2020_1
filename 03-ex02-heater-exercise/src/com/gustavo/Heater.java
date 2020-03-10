package com.gustavo;

public class Heater {
    private int temperature, min, max, increment;

    /**
     *
     * @param minTemperature is the minimum temperature
     * @param maxTemperature is the maximum temperature
     */
    public Heater(int minTemperature, int maxTemperature) {
        temperature = 15;
        min = minTemperature;
        max = maxTemperature;
        increment = 5;
    }


    /**
     * when called, increases the temperature by the increment value if it does not exceed the maximum
     */
    public void warmUp(){
        if ((temperature + increment) > max)
            System.err.println("Value exceeds the maximum");

        else
            temperature += increment;
    }

    /**
     * when called, decreases the temperature by the increment value if it does not exceed the minimum
     */
    public void cool(){
        if ((temperature - increment) < min)
            System.err.println("Value exceeds the minimum");
        else
            temperature -= increment;
    }

    /**
     *
     * @return the temperature
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     *
     * @param value is the new increment value
     */

    public void setIncrement(int value){
        increment = value;
    }
}
