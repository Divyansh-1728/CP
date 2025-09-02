import java.util.Scanner;
public class Assignment_1 {
    public class Welcome {
        public static void main(String[] args) {
            System.out.println("Welcome to Bridgelabz!");
        }
    }
    public class AddNumbers {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
            int sum = num1 + num2;
            System.out.println("Sum = " + sum);
            sc.close();
        }
    }
    public class CelsiusToFahrenheit {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter temperature in Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit = " + fahrenheit);
            sc.close();
        }
    }
    public class AreaOfCircle {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter radius: ");
            double radius = sc.nextDouble();
            double area = Math.PI * radius * radius;
            System.out.println("Area of Circle = " + area);
            sc.close();
        }
    }
    public class VolumeOfCylinder {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter radius: ");
            double radius = sc.nextDouble();
            System.out.print("Enter height: ");
            double height = sc.nextDouble();
            double volume = Math.PI * radius * radius * height;
            System.out.println("Volume of Cylinder = " + volume);
            sc.close();
        }
    }
    public class SimpleInterest {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Principal: ");
            double principal = sc.nextDouble();
            System.out.print("Enter Rate of Interest: ");
            double rate = sc.nextDouble();
            System.out.print("Enter Time (in years): ");
            double time = sc.nextDouble();
            double si = (principal * rate * time) / 100;
            System.out.println("Simple Interest = " + si);
            sc.close();
        }
    }
    public class PerimeterOfRectangle {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter length: ");
            double length = sc.nextDouble();
            System.out.print("Enter width: ");
            double width = sc.nextDouble();
            double perimeter = 2 * (length + width);
            System.out.println("Perimeter of Rectangle = " + perimeter);
            sc.close();
        }
    }
    public class PowerCalculation {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter base: ");
            double base = sc.nextDouble();
            System.out.print("Enter exponent: ");
            double exponent = sc.nextDouble();
            double result = Math.pow(base, exponent);
            System.out.println(base + " raised to " + exponent + " = " + result);
            sc.close();
        }
    }
    public class AverageOfThree {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            System.out.print("Enter third number: ");
            double num3 = sc.nextDouble();
            double average = (num1 + num2 + num3) / 3;
            System.out.println("Average = " + average);
            sc.close();
        }
    }
    public class KmToMiles {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter distance in kilometers: ");
            double kilometers = sc.nextDouble();
            double miles = kilometers * 0.621371;
            System.out.println("Distance in miles = " + miles);
            sc.close();
        }
    }


}
