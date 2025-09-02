import java.util.Scanner;
public class Assignment_2 {
    public class HarryAge {
        public static void main(String[] args) {
            int birthYear = 2000;
            int currentYear = 2024;
            int age = currentYear - birthYear;

            System.out.println("Harry's age in " + currentYear + " is " + age);
        }
    }
    public class SamAverage {
        public static void main(String[] args) {
            int maths = 94, physics = 95, chemistry = 96;
            double avg = (maths + physics + chemistry) / 3.0;

            System.out.println("Sam’s average mark in PCM is " + avg);
        }
    }
    public class KmToMiles {
        public static void main(String[] args) {
            double km = 10.8;
            double miles = km / 1.6;

            System.out.println("The distance " + km + " km in miles is " + miles);
        }
    }
    public class ProfitCalculation {
        public static void main(String[] args) {
            int costPrice = 129;
            int sellingPrice = 191;
            int profit = sellingPrice - costPrice;
            double profitPercent = (profit * 100.0) / costPrice;

            System.out.println(
                    "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
                            "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercent
            );
        }
    }
    public class PensDistribution {
        public static void main(String[] args) {
            int pens = 14, students = 3;
            int perStudent = pens / students;
            int remaining = pens % students;

            System.out.println("The Pen Per Student is " + perStudent + " and the remaining pen not distributed is " + remaining);
        }
    }
    public class UniversityDiscount {
        public static void main(String[] args) {
            double fee = 125000;
            double discountPercent = 10;
            double discount = (fee * discountPercent) / 100;
            double finalFee = fee - discount;

            System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
        }
    }
    public class VolumeOfEarth {
        public static void main(String[] args) {
            double radiusKm = 6378;
            double pi = Math.PI;
            double volumeKm3 = (4.0/3) * pi * Math.pow(radiusKm, 3);
            double volumeMiles3 = volumeKm3 / Math.pow(1.6, 3);

            System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
        }
    }
    // Program 1: Find Harry's age
    class HarryAge {
        public static void main(String[] args) {
            int birthYear = 2000;
            int currentYear = 2024;
            int age = currentYear - birthYear;
            System.out.println("Harry's age in " + currentYear + " is " + age);
        }
    }

    // Program 2: Average marks in PCM
    class SamAverage {
        public static void main(String[] args) {
            int maths = 94, physics = 95, chemistry = 96;
            double avg = (maths + physics + chemistry) / 3.0;
            System.out.println("Sam’s average mark in PCM is " + avg);
        }
    }

    // Program 3: Convert km to miles
    class KmToMiles {
        public static void main(String[] args) {
            double km = 10.8;
            double miles = km / 1.6;
            System.out.println("The distance " + km + " km in miles is " + miles);
        }
    }

    // Program 4: Profit and Profit Percentage
    class ProfitCalc {
        public static void main(String[] args) {
            int costPrice = 129, sellingPrice = 191;
            int profit = sellingPrice - costPrice;
            double profitPercent = (profit * 100.0) / costPrice;

            System.out.println(
                    "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
                            "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercent
            );
        }
    }

    // Program 5: Divide pens
    class DividePens {
        public static void main(String[] args) {
            int pens = 14, students = 3;
            int perStudent = pens / students;
            int remaining = pens % students;
            System.out.println("The Pen Per Student is " + perStudent + " and the remaining pen not distributed is " + remaining);
        }
    }

    // Program 6: Discounted fee
    class DiscountFee {
        public static void main(String[] args) {
            double fee = 125000;
            double discountPercent = 10;
            double discount = fee * discountPercent / 100;
            double finalFee = fee - discount;

            System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
        }
    }

    // Program 7: Volume of Earth
    class EarthVolume {
        public static void main(String[] args) {
            double radiusKm = 6378;
            double pi = Math.PI;
            double volumeKm = (4.0/3) * pi * Math.pow(radiusKm, 3);
            double radiusMiles = radiusKm / 1.6;
            double volumeMiles = (4.0/3) * pi * Math.pow(radiusMiles, 3);

            System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
        }
    }

// Program 8: Convert km to miles with user input
    class KmToMilesInput {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter distance in km: ");
            double km = input.nextDouble();
            double miles = km / 1.6;
            System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        }
    }

// Program 9: Discount fee with user input
    class DiscountFeeInput {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Fee: ");
            double fee = input.nextDouble();
            System.out.print("Enter Discount Percentage: ");
            double discountPercent = input.nextDouble();

            double discount = fee * discountPercent / 100;
            double finalFee = fee - discount;

            System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
        }
    }

// Program 10: Height conversion
    class HeightConversion {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter height in cm: ");
            double cm = input.nextDouble();

            double inches = cm / 2.54;
            int feet = (int) (inches / 12);
            double remainingInches = inches % 12;

            System.out.println("Your Height in cm is " + cm + " while in feet is " + feet + " and inches is " + remainingInches);
        }
    }

// Program 11: Basic Calculator
    class BasicCalculator {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter first number: ");
            double number1 = input.nextDouble();
            System.out.print("Enter second number: ");
            double number2 = input.nextDouble();

            System.out.println("Addition: " + (number1 + number2));
            System.out.println("Subtraction: " + (number1 - number2));
            System.out.println("Multiplication: " + (number1 * number2));
            System.out.println("Division: " + (number1 / number2));
        }
    }

// Program 12: Area of Triangle
    class TriangleArea {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter base: ");
            double base = input.nextDouble();
            System.out.print("Enter height: ");
            double height = input.nextDouble();

            double area = 0.5 * base * height;
            System.out.println("The area of triangle is " + area + " square units");
        }
    }

// Program 13: Square side from perimeter
    class SquareSide {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter perimeter: ");
            double perimeter = input.nextDouble();
            double side = perimeter / 4;
            System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        }
    }

// Program 14: Distance conversion from feet
    class FeetConversion {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter distance in feet: ");
            double feet = input.nextDouble();

            double yards = feet / 3;
            double miles = yards / 1760;

            System.out.println("The distance in yards is " + yards + " and in miles is " + miles);
        }
    }

// Program 15: Total purchase price
    class PurchasePrice {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter unit price: ");
            double unitPrice = input.nextDouble();
            System.out.print("Enter quantity: ");
            int quantity = input.nextInt();

            double totalPrice = unitPrice * quantity;
            System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
        }
    }

// Program 16: Maximum handshakes
    class Handshakes {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter number of students: ");
            int n = input.nextInt();

            int handshakes = (n * (n - 1)) / 2;
            System.out.println("The maximum number of handshakes possible is " + handshakes);
        }
    }


    // LEVEL2

    import java.util.Scanner;

    public class BasicCalculator {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Taking two floating-point inputs
            System.out.print("Enter first number: ");
            double number1 = input.nextDouble();

            System.out.print("Enter second number: ");
            double number2 = input.nextDouble();

            // Performing arithmetic operations
            double addition = number1 + number2;
            double subtraction = number1 - number2;
            double multiplication = number1 * number2;
            double division = number1 / number2;

            // Printing results
            System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "
                    + number1 + " and " + number2 + " is "
                    + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
        }
    }
    import java.util.Scanner;

    public class TriangleArea {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Taking base and height
            System.out.print("Enter base (cm): ");
            double base = input.nextDouble();

            System.out.print("Enter height (cm): ");
            double height = input.nextDouble();

            // Calculating area in cm²
            double areaCm = 0.5 * base * height;

            // Convert cm² to inches² (1 inch = 2.54 cm, so 1 in² = 2.54² cm²)
            double areaInch = areaCm / (2.54 * 2.54);

            // Printing results
            System.out.println("The Area of the triangle in sq in is " + areaInch + " and sq cm is " + areaCm);
        }
    }
    import java.util.Scanner;

    public class SquareSide {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter perimeter of square: ");
            double perimeter = input.nextDouble();

            double side = perimeter / 4;

            System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        }
    }
    import java.util.Scanner;

    public class DistanceConverter {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter distance in feet: ");
            double distanceInFeet = input.nextDouble();

            double distanceInYards = distanceInFeet / 3;
            double distanceInMiles = distanceInYards / 1760;

            System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);
        }
    }
    import java.util.Scanner;

    public class PurchaseCalculator {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter unit price (INR): ");
            double unitPrice = input.nextDouble();

            System.out.print("Enter quantity: ");
            int quantity = input.nextInt();

            double totalPrice = unitPrice * quantity;

            System.out.println("The total purchase price is INR " + totalPrice
                    + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
        }
    }
    import java.util.Scanner;

    public class QuotientRemainder {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int number1 = input.nextInt();

            System.out.print("Enter second number: ");
            int number2 = input.nextInt();

            int quotient = number1 / number2;
            int remainder = number1 % number2;

            System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder
                    + " of two numbers " + number1 + " and " + number2);
        }
    }
    import java.util.Scanner;

    public class IntOperation {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Taking integer inputs
            System.out.print("Enter value of a: ");
            int a = input.nextInt();

            System.out.print("Enter value of b: ");
            int b = input.nextInt();

            System.out.print("Enter value of c: ");
            int c = input.nextInt();

            // Performing integer operations
            int result1 = a + b * c;
            int result2 = a * b + c;
            int result3 = c + a / b;
            int result4 = a % b + c;

            // Printing results
            System.out.println("The results of Int Operations are: " + result1 + ", " + result2 + ", " + result3 + ", " + result4);
        }
    }
    import java.util.Scanner;

    public class DoubleOpt {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Taking double inputs
            System.out.print("Enter value of a: ");
            double a = input.nextDouble();

            System.out.print("Enter value of b: ");
            double b = input.nextDouble();

            System.out.print("Enter value of c: ");
            double c = input.nextDouble();

            // Performing operations
            double result1 = a + b * c;
            double result2 = a * b + c;
            double result3 = c + a / b;
            double result4 = a % b + c;

            // Printing results
            System.out.println("The results of Double Operations are: " + result1 + ", " + result2 + ", " + result3 + ", " + result4);
        }
    }














}
