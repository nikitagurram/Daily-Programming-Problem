/**
 * convert_temperature
 * Kelvin = Celsius + 273.15
 * Fahrenheit = Celsius * 1.80 + 32.00
 * Input: celsius = 36.50
 * Output: [309.65000,97.70000]
 * Explanation: Temperature at 36.50 Celsius converted in Kelvin is 309.65 and
 * converted in Fahrenheit is 97.70.
 */
public class convert_temperature {
    public static void main(String[] args) {
        double celsius = 36.50;
        double[] temp = new double[2];
        temp[0] = celsius + 273.15;
        temp[1] = celsius * 1.8 + 32;
        System.out.println(temp[0] + " " + temp[1]);
    }

}