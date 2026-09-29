package javacore.chapter01.variable.exercise;

public class CelsiusFahrenheitConverter {
    public static void main(String[] args){
        short temperatureCelsius = 30;
        int temperatureF = temperatureCelsius * 9/5 + 32;
        System.out.println("Voici la convertion de " + temperatureCelsius + " degrés Celsius en degrés Fahrenheit " +temperatureF);
    }
}
