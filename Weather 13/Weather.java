package com.company;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Weather {
    public float temperature;
    public float humidity;
    public boolean isCloudy;
    public float chanceOfRain;

    public void changeChanceOfRain(float newchanceOfRain){
        if (chanceOfRain >= 0 && chanceOfRain <= 100 &&
                newchanceOfRain >=0 && newchanceOfRain <= 100){
            chanceOfRain = newchanceOfRain;
        }
    }

    public void printTempFahrenheit(){
        System.out.println(String.format("Temperature: %.1f F", temperature*1.8+32));
    }
}
