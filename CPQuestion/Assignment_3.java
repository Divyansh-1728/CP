//import java.util.Scanner;
//public class Assignment_3 {
//    public class DivisibleByFive {
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//
//            int number;
//            System.out.print("Enter a number: ");
//            number = input.nextInt();
//
//            boolean isDivisible = (number % 5 == 0);
//            System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
//
//            input.close();
//        }
//    }
//    public class SmallestOfThree {
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//
//            int number1, number2, number3;
//            System.out.print("Enter first number: ");
//            number1 = input.nextInt();
//            System.out.print("Enter second number: ");
//            number2 = input.nextInt();
//            System.out.print("Enter third number: ");
//            number3 = input.nextInt();
//
//            boolean isFirstSmallest = (number1 <= number2 && number1 <= number3);
//            System.out.println("Is the first number the smallest? " + isFirstSmallest);
//
//            input.close();
//        }
//    }
//    public class LargestOfThree {
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//
//            int number1, number2, number3;
//            System.out.print("Enter first number: ");
//            number1 = input.nextInt();
//            System.out.print("Enter second number: ");
//            number2 = input.nextInt();
//            System.out.print("Enter third number: ");
//            number3 = input.nextInt();
//
//            System.out.println("Is the first number the largest? " + (number1 >= number2 && number1 >= number3));
//            System.out.println("Is the second number the largest? " + (number2 >= number1 && number2 >= number3));
//            System.out.println("Is the third number the largest? " + (number3 >= number1 && number3 >= number2));
//
//            input.close();
//        }
//    }
//
//
//    public class SumNaturalNumbers {
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//
//            int number;
//            System.out.print("Enter a number: ");
//            number = input.nextInt();
//
//            if (number >= 1) {
//                int sum = number * (number + 1) / 2;
//                System.out.println("The sum of " + number + " natural numbers is " + sum);
//            } else {
//                System.out.println("The number " + number + " is not a natural number");
//            }
//
//            input.close();
//        }
//    }
//
//
//
//    public class VotingEligibility {
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//
//            int age;
//            System.out.print("Enter age: ");
//            age = input.nextInt();
//
//            if (age >= 18) {
//                System.out.println("The person's age is " + age + " and can vote.");
//            } else {
//                System.out.println("The person's age is " + age + " and cannot vote.");
//            }
//
//            input.close();
//        }
//    }
//
//
//    public class NumberCheck {
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//
//            int number;
//            System.out.print("Enter a number: ");
//            number = input.nextInt();
//
//            if (number > 0) {
//                System.out.println("Positive");
//            } else if (number < 0) {
//                System.out.println("Negative");
//            } else {
//                System.out.println("Zero");
//            }
//
//            input.close();
//        }
//    }
//
//
//    public class SpringSeason {
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//
//            int month, day;
//            System.out.print("Enter month (1-12): ");
//            month = input.nextInt();
//            System.out.print("Enter day: ");
//            day = input.nextInt();
//
//            boolean isSpring = (month == 3 && day >= 20) ||
//                    (month == 4) ||
//                    (month == 5) ||
//                    (month == 6 && day <= 20);
//
//            if (isSpring) {
//                System.out.println("It's a Spring Season");
//            } else {
//                System.out.println("Not a Spring Season");
//            }
//
//            input.close();
//        }
//    }
//
//
//    public class CountdownWhile {
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//
//            int counter;
//            System.out.print("Enter countdown start: ");
//            counter = input.nextInt();
//
//            while (counter >= 1) {
//                System.out.println(counter);
//                counter--;
//            }
//
//            System.out.println("Rocket Launched!");
//            input.close();
//        }
//    }
//
//    public class SumUntilZero {
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//
//            double total = 0.0;
//            double value;
//
//            System.out.print("Enter a number (0 to stop): ");
//            value = input.nextDouble();
//
//            while (value != 0) {
//                total += value;
//                System.out.print("Enter a number (0 to stop): ");
//                value = input.nextDouble();
//            }
//
//            System.out.println("Total sum = " + total);
//            input.close();
//        }
//    }
//
//    public class SumUntilBreak {
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//
//            double total = 0.0;
//
//            while (true) {
//                System.out.print("Enter a number (0 or negative to stop): ");
//                double value = input.nextDouble();
//
//                if (value <= 0) {
//                    break;
//                }
//                total += value;
//            }
//
//            System.out.println("Total sum = " + total);
//            input.close();
//        }
//    }
//
//    public class SumUntilBreaks {
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//
//            double total = 0.0;
//
//            while (true) {
//                System.out.print("Enter a number (0 or negative to stop): ");
//                double value = input.nextDouble();
//
//                if (value <= 0) {
//                    break;
//                }
//                total += value;
//            }
//
//            System.out.println("Total sum = " + total);
//            input.close();
//        }
//    }
//
//    public class SumNaturalWhile {
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//
//            int number;
//            System.out.print("Enter a natural number: ");
//            number = input.nextInt();
//
//            if (number >= 1) {
//                int sumFormula = number * (number + 1) / 2;
//
//                int sumLoop = 0;
//                int i = 1;
//                while (i <= number) {
//                    sumLoop += i;
//                    i++;
//                }
//
//                System.out.println("Sum using formula = " + sumFormula);
//                System.out.println("Sum using while loop = " + sumLoop);
//            } else {
//                System.out.println("Not a natural number!");
//            }
//
//            input.close();
//        }
//    }
//
//
//    public class SumNaturalFor {
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//
//            int number;
//            System.out.print("Enter a natural number: ");
//            number = input.nextInt();
//
//            if (number >= 1) {
//                int sumFormula = number * (number + 1) / 2;
//
//                int sumLoop = 0;
//                for (int i = 1; i <= number; i++) {
//                    sumLoop += i;
//                }
//
//                System.out.println("Sum using formula = " + sumFormula);
//                System.out.println("Sum using for loop = " + sumLoop);
//            } else {
//                System.out.println("Not a natural number!");
//            }
//
//            input.close();
//        }
//    }
//
//    public class FactorialWhile {
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//
//            int number;
//            System.out.print("Enter a positive integer: ");
//            number = input.nextInt();
//
//            if (number >= 0) {
//                long factorial = 1;
//                int i = 1;
//                while (i <= number) {
//                    factorial *= i;
//                    i++;
//                }
//                System.out.println("Factorial of " + number + " = " + factorial);
//            } else {
//                System.out.println("Not a natural number!");
//            }
//
//            input.close();
//        }
//    }
//    public class FactorialFor {
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//
//            int number;
//            System.out.print("Enter a positive integer: ");
//            number = input.nextInt();
//
//            if (number >= 0) {
//                long factorial = 1;
//                for (int i = 1; i <= number; i++) {
//                    factorial *= i;
//                }
//                System.out.println("Factorial of " + number + " = " + factorial);
//            } else {
//                System.out.println("Not a natural number!");
//            }
//
//            input.close();
//        }
//    }
//    public class OddEvenNumbers {
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//
//            int number;
//            System.out.print("Enter a number: ");
//            number = input.nextInt();
//
//            if (number >= 1) {
//                for (int i = 1; i <= number; i++) {
//                    if (i % 2 == 0) {
//                        System.out.println(i + " is Even");
//                    } else {
//                        System.out.println(i + " is Odd");
//                    }
//                }
//            } else {
//                System.out.println("Not a natural number!");
//            }
//
//            input.close();
//        }
//    }
//    public class EmployeeBonus {
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//
//            double salary;
//            int years;
//
//            System.out.print("Enter salary: ");
//            salary = input.nextDouble();
//            System.out.print("Enter years of service: ");
//            years = input.nextInt();
//
//            if (years > 5) {
//                double bonus = salary * 0.05;
//                System.out.println("Bonus = " + bonus);
//            } else {
//                System.out.println("No bonus awarded.");
//            }
//
//            input.close();
//        }
//    }
//    public class MultiplicationTable {
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//
//            int number;
//            System.out.print("Enter a number: ");
//            number = input.nextInt();
//
//            for (int i = 6; i <= 9; i++) {
//                System.out.println(number + " * " + i + " = " + (number * i));
//            }
//
//            input.close();
//        }
//    }
//}

// LEVEL _2
//import java.util.Scanner;
//
//public class Assignment_3 {
//
//    // 1. Odd and Even numbers
//    public static void oddEven() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = sc.nextInt();
//        for (int i = 1; i <= number; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i + " is Even");
//            } else {
//                System.out.println(i + " is Odd");
//            }
//        }
//    }
//
//    // 2. Employee Bonus
//    public static void employeeBonus() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Salary: ");
//        double salary = sc.nextDouble();
//        System.out.print("Enter Years of Service: ");
//        int years = sc.nextInt();
//
//        if (years > 5) {
//            double bonus = salary * 0.05;
//            System.out.println("Bonus = " + bonus);
//        } else {
//            System.out.println("No Bonus");
//        }
//    }
//
//    // 3. Multiplication table from 6 to 9
//    public static void multiplicationTable() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = sc.nextInt();
//        for (int i = 6; i <= 9; i++) {
//            System.out.println(number + " * " + i + " = " + (number * i));
//        }
//    }
//
//    // 4. FizzBuzz using for loop
//    public static void fizzBuzzFor() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a positive integer: ");
//        int number = sc.nextInt();
//
//        for (int i = 1; i <= number; i++) {
//            if (i % 3 == 0 && i % 5 == 0)
//                System.out.println("FizzBuzz");
//            else if (i % 3 == 0)
//                System.out.println("Fizz");
//            else if (i % 5 == 0)
//                System.out.println("Buzz");
//            else
//                System.out.println(i);
//        }
//    }
//
//    // 5. FizzBuzz using while loop
//    public static void fizzBuzzWhile() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a positive integer: ");
//        int number = sc.nextInt();
//        int i = 1;
//        while (i <= number) {
//            if (i % 3 == 0 && i % 5 == 0)
//                System.out.println("FizzBuzz");
//            else if (i % 3 == 0)
//                System.out.println("Fizz");
//            else if (i % 5 == 0)
//                System.out.println("Buzz");
//            else
//                System.out.println(i);
//            i++;
//        }
//    }
//
//    // 6. Youngest and Tallest friend
//    public static void youngestTallest() {
//        Scanner sc = new Scanner(System.in);
//        int[] ages = new int[3];
//        int[] heights = new int[3];
//        String[] names = {"Amar", "Akbar", "Anthony"};
//
//        for (int i = 0; i < 3; i++) {
//            System.out.print("Enter age of " + names[i] + ": ");
//            ages[i] = sc.nextInt();
//            System.out.print("Enter height of " + names[i] + ": ");
//            heights[i] = sc.nextInt();
//        }
//
//        int youngestIndex = 0, tallestIndex = 0;
//        for (int i = 1; i < 3; i++) {
//            if (ages[i] < ages[youngestIndex]) youngestIndex = i;
//            if (heights[i] > heights[tallestIndex]) tallestIndex = i;
//        }
//
//        System.out.println("Youngest: " + names[youngestIndex]);
//        System.out.println("Tallest: " + names[tallestIndex]);
//    }
//
//    // 7. Factors using for loop
//    public static void factorsFor() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a positive integer: ");
//        int number = sc.nextInt();
//        for (int i = 1; i < number; i++) {
//            if (number % i == 0) {
//                System.out.println(i);
//            }
//        }
//    }
//
//    // 8. Factors using while loop
//    public static void factorsWhile() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a positive integer: ");
//        int number = sc.nextInt();
//        int i = 1;
//        while (i < number) {
//            if (number % i == 0) {
//                System.out.println(i);
//            }
//            i++;
//        }
//    }
//
//    // 9. Greatest Factor using for loop
//    public static void greatestFactorFor() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = sc.nextInt();
//        int greatestFactor = 1;
//        for (int i = number - 1; i >= 1; i--) {
//            if (number % i == 0) {
//                greatestFactor = i;
//                break;
//            }
//        }
//        System.out.println("Greatest Factor: " + greatestFactor);
//    }
//
//    // 10. Greatest Factor using while loop
//    public static void greatestFactorWhile() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = sc.nextInt();
//        int greatestFactor = 1;
//        int counter = number - 1;
//        while (counter >= 1) {
//            if (number % counter == 0) {
//                greatestFactor = counter;
//                break;
//            }
//            counter--;
//        }
//        System.out.println("Greatest Factor: " + greatestFactor);
//    }
//
//    // 11. Multiples below 100 using for loop
//    public static void multiplesFor() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a positive integer (<100): ");
//        int number = sc.nextInt();
//        for (int i = 100; i >= 1; i--) {
//            if (i % number == 0) {
//                System.out.println(i);
//            }
//        }
//    }
//
//    // 12. Power using for loop
//    public static void powerFor() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int number = sc.nextInt();
//        System.out.print("Enter power: ");
//        int power = sc.nextInt();
//        int result = 1;
//        for (int i = 1; i <= power; i++) {
//            result *= number;
//        }
//        System.out.println("Result = " + result);
//    }
//
//    // 13. Multiples below 100 using while loop
//    public static void multiplesWhile() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a positive integer (<100): ");
//        int number = sc.nextInt();
//        int counter = 100;
//        while (counter >= 1) {
//            if (counter % number == 0) {
//                System.out.println(counter);
//            }
//            counter--;
//        }
//    }
//
//    // 14. Power using while loop
//    public static void powerWhile() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int number = sc.nextInt();
//        System.out.print("Enter power: ");
//        int power = sc.nextInt();
//        int result = 1, counter = 0;
//        while (counter < power) {
//            result *= number;
//            counter++;
//        }
//        System.out.println("Result = " + result);
//    }
//}

// Level _3

import java.util.Scanner;

public class Assignment_3 {

    // 1. Leap Year Program (Multiple if-else)
    static void leapYearMultipleIfElse() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year >= 1582) {
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            } else if (year % 100 == 0) {
                System.out.println(year + " is NOT a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is NOT a Leap Year");
            }
        } else {
            System.out.println("Leap Year calculation valid only after 1582");
        }
    }

    // 1(b). Leap Year with single if using logical operators
    static void leapYearSingleIf() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is NOT a Leap Year");
        }
    }

    // 2. Marks, Percentage & Grade
    static void gradeCalculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in Physics: ");
        int phy = sc.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int chem = sc.nextInt();
        System.out.print("Enter marks in Maths: ");
        int math = sc.nextInt();

        double avg = (phy + chem + math) / 3.0;
        System.out.println("Average Marks: " + avg);

        if (avg >= 90) System.out.println("Grade: A+ (Excellent)");
        else if (avg >= 75) System.out.println("Grade: A (Very Good)");
        else if (avg >= 60) System.out.println("Grade: B (Good)");
        else if (avg >= 50) System.out.println("Grade: C (Pass)");
        else System.out.println("Grade: F (Fail)");
    }

    // 3. Prime Number
    static void primeCheck() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num <= 1) isPrime = false;
        else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) System.out.println(num + " is Prime");
        else System.out.println(num + " is NOT Prime");
    }

    // 4. Armstrong Number
    static void armstrongCheck() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num, sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        if (sum == original) System.out.println(original + " is an Armstrong Number");
        else System.out.println(original + " is NOT an Armstrong Number");
    }

    // 5. Count Digits
    static void countDigits() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;

        while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }

    // 6. BMI Calculator
    static void bmiCalculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);

        System.out.println("BMI = " + bmi);
        if (bmi < 18.5) System.out.println("Underweight");
        else if (bmi < 25) System.out.println("Normal weight");
        else if (bmi < 30) System.out.println("Overweight");
        else System.out.println("Obese");
    }

    // 7. Harshad Number
    static void harshadNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num, sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        if (original % sum == 0) System.out.println(original + " is a Harshad Number");
        else System.out.println(original + " is NOT a Harshad Number");
    }

    // 8. Abundant Number
    static void abundantNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        if (sum > num) System.out.println(num + " is an Abundant Number");
        else System.out.println(num + " is NOT an Abundant Number");
    }

    // 9. Calculator using switch-case
    static void calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        switch (op) {
            case "+" -> System.out.println("Result: " + (first + second));
            case "-" -> System.out.println("Result: " + (first - second));
            case "*" -> System.out.println("Result: " + (first * second));
            case "/" -> {
                if (second != 0) System.out.println("Result: " + (first / second));
                else System.out.println("Error: Division by zero");
            }
            default -> System.out.println("Invalid Operator");
        }
    }

    // Main Menu to Run
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Choose Program:
                1. Leap Year (Multiple If-Else)
                2. Leap Year (Single If)
                3. Grade Calculator
                4. Prime Check
                5. Armstrong Check
                6. Count Digits
                7. BMI Calculator
                8. Harshad Number
                9. Abundant Number
                10. Calculator
                """);
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> leapYearMultipleIfElse();
            case 2 -> leapYearSingleIf();
            case 3 -> gradeCalculator();
            case 4 -> primeCheck();
            case 5 -> armstrongCheck();
            case 6 -> countDigits();
            case 7 -> bmiCalculator();
            case 8 -> harshadNumber();
            case 9 -> abundantNumber();
            case 10 -> calculator();
            default -> System.out.println("Invalid choice");
        }
    }
}



