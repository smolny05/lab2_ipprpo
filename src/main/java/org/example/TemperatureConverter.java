package org.example;

public class TemperatureConverter {
    public static double CelsiusToFahrenheit(double C) {
        double fahrenheit;

        fahrenheit = (C * 1.8) + 32;
        System.out.println(" value of temperature in fahrenheit:" + fahrenheit);
        return fahrenheit;
    }
    public static double FahrenheitToCelsius(double F) {
        double celsius;

        celsius = (F - 32) / 1.8;
        System.out.println(" value of temperature in Celsius:" + celsius);
        return celsius;
    }
}
