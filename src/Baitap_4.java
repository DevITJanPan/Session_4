import java.util.Scanner;

public class Baitap_4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.print("4.Nhap lua chon cua ban: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhap do Fahrenheit: ");
                    double fahrenheit = scanner.nextDouble();
                    double celsiusResult = fahrenheitToCelsius(fahrenheit);
                    System.out.println(fahrenheit + " do Fahrenheit = " + celsiusResult + " do Celsius");
                    break;
                case 2:
                    System.out.print("Nhap do Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheitResult = celsiusToFahrenheit(celsius);
                    System.out.println(celsius + " do Celsius = " + fahrenheitResult + " do Fahrenheit");
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai!");
                    break;
            }

        } while (true);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
