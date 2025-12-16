package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        double Celsius = 32;
        double Fahrenheit = 41;
        TemperatureConverter.CelsiusToFahrenheit(Celsius);
        TemperatureConverter.FahrenheitToCelsius(Fahrenheit);
    }
}