package javacore.chapter01.variable.exercise;

public class FahrenheitCelsiusConverter {
    public static void main(String[] args){
        double temperatureF = 25;
        double temperatureCelsius = (temperatureF  - 32) * 5/9;
        System.out.println("Voici la convertion de " + temperatureF + " degrés Fahrenheit en degrés Celsius " + temperatureCelsius);
    }
}