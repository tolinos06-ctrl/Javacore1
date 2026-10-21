package javacore.chapter05.object.exercise;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsiusTemperature){
        double temperatureF = celsiusTemperature * 9/5 + 32;
        return temperatureF;
    }

    public static double fahrenheitToCelsius(double fahrenheitTemperature){
        double temperatureCelsius = (fahrenheitTemperature  - 32) * 5/9;
        return temperatureCelsius;
    }

    public static double celsiusToKelvin(double celsiusTemperature){
        double temperatureK = celsiusTemperature +273.15;
        return temperatureK;
    }

    public static double fahrenheitToKelvin(double fahreinheitTemperature){
        double temperatureK = fahreinheitTemperature +273.15;
        return temperatureK;
    }

    public static void main(String[] args){
        double temperatureC = 12;
        double temperatureF = 12;
        System.out.println("Voici la convertion de " + temperatureC + " degrés Celsius en degrés Fahrenheit " + TemperatureConverter.celsiusToFahrenheit(temperatureC) + TemperatureConverter.fahrenheitUnit());
        System.out.println("Voici la convertion de " + temperatureF + " degrés Fahrenheit en degrés Celsius " + TemperatureConverter.fahrenheitToCelsius(temperatureF)+ TemperatureConverter.celsiusUnit());
        System.out.println("Voici la convertion de " + temperatureF + " degrés Fahrenheit en degrés Kelvin " + TemperatureConverter.celsiusToKelvin(temperatureF)+ TemperatureConverter.kelvinUnit());
        System.out.println("Voici la convertion de " + temperatureC + " degrés Fahrenheit en degrés Kelvin " + TemperatureConverter.fahrenheitToKelvin(temperatureC)+ TemperatureConverter.kelvinUnit());

    }

    public static String celsiusUnit(){
        return "°C";
    }
    public static String fahrenheitUnit (){
        return "°F";
    }
    public static String kelvinUnit (){
        return "K";
    }

}
