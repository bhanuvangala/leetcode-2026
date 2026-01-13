// LeetCode 2469 - Convert the Temperature
// Given a temperature in Celsius, convert it to Kelvin and Fahrenheit
// Formula:
// Kelvin = Celsius + 273.15
// Fahrenheit = Celsius * 1.80 + 32.00

class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;

        // Return result as an array
        return new double[]{kelvin, fahrenheit};
    }
}
