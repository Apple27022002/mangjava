import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

public class BaiTap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double FaRa;
        double DoC;
        int LuaChon;

        do {
            System.out.println("Menu.");
            System.out.println("1. Fara ra doC");
            System.out.println("2. doC ra Fara");
            System.out.println("0. Exit");
            System.out.println("Enter your LuaChon: ");
            LuaChon = input.nextInt();

            switch (LuaChon) {
                case 1: {
                    System.out.println("Enter FaRa: ");
                    FaRa = input.nextDouble();
                    System.out.println("Fara to doC: " + fahrenheitToCelsius(FaRa));
                    break;
                }
                case 2:{
                    System.out.println("doC: ");
                    DoC = input.nextDouble();
                    System.out.println("doC to Fara: " + celsiusToFahrenheit(DoC));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (LuaChon != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}