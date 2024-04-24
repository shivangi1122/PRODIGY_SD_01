import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter original unit of measurement (Celsius, Fahrenheit, Kelvin): ");
        String originalUnit = scanner.nextLine().toLowerCase();
        double celsius = 0, fahrenheit = 0, kelvin = 0;
        if (originalUnit.equals("celsius")) {
            celsius = temperature;
            fahrenheit = celsius * 9/5 + 32;
            kelvin = celsius + 273.15;
        } else if (originalUnit.equals("fahrenheit")) {
            fahrenheit = temperature;
            celsius = (fahrenheit - 32) * 5/9;
            kelvin = (fahrenheit + 459.67) * 5/9;
        } else if (originalUnit.equals("kelvin")) {
            kelvin = temperature;
            celsius = kelvin - 273.15;
            fahrenheit = kelvin * 9/5 - 459.67;
        } else {
            System.out.println("Invalid unit of measurement entered.");
            System.exit(1);
        }
        System.out.println("Converted temperatures:");
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);

        scanner.close();
    }
}
