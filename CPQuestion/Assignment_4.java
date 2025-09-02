import java.util.Scanner;
//public class Assignment_4 {
//    public class Level1Programs {
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//
//            // 1. Voting eligibility for 10 students
//            System.out.println("Program 1: Voting Eligibility");
//            int[] ages = new int[10];
//            for (int i = 0; i < ages.length; i++) {
//                System.out.print("Enter age of student " + (i + 1) + ": ");
//                ages[i] = sc.nextInt();
//            }
//            for (int age : ages) {
//                if (age < 0) {
//                    System.out.println("Invalid age: " + age);
//                } else if (age >= 18) {
//                    System.out.println("The student with age " + age + " can vote.");
//                } else {
//                    System.out.println("The student with age " + age + " cannot vote.");
//                }
//            }
//
//            // ---------------------------------------------------------
//            // 2. Positive/Negative/Zero & even/odd + compare first & last
//            System.out.println("\nProgram 2: Number Analysis");
//            int[] numbers = new int[5];
//            for (int i = 0; i < numbers.length; i++) {
//                System.out.print("Enter number " + (i + 1) + ": ");
//                numbers[i] = sc.nextInt();
//            }
//            for (int num : numbers) {
//                if (num > 0) {
//                    System.out.print(num + " is Positive ");
//                    if (num % 2 == 0)
//                        System.out.println("and Even");
//                    else
//                        System.out.println("and Odd");
//                } else if (num < 0) {
//                    System.out.println(num + " is Negative");
//                } else {
//                    System.out.println(num + " is Zero");
//                }
//            }
//            if (numbers[0] == numbers[4])
//                System.out.println("First and last elements are Equal");
//            else if (numbers[0] > numbers[4])
//                System.out.println("First element is Greater than last");
//            else
//                System.out.println("First element is Less than last");
//
//            // ---------------------------------------------------------
//            // 3. Multiplication table of a number
//            System.out.println("\nProgram 3: Multiplication Table");
//            System.out.print("Enter a number: ");
//            int n = sc.nextInt();
//            int[] table = new int[10];
//            for (int i = 1; i <= 10; i++) {
//                table[i - 1] = n * i;
//            }
//            for (int i = 1; i <= 10; i++) {
//                System.out.println(n + " * " + i + " = " + table[i - 1]);
//            }
//
//            // ---------------------------------------------------------
//            // 4. Store up to 10 values until user enters 0 or negative
//            System.out.println("\nProgram 4: Store Numbers and Sum");
//            double[] arr = new double[10];
//            double total = 0.0;
//            int index = 0;
//            while (true) {
//                System.out.print("Enter a number (0 or negative to stop): ");
//                double val = sc.nextDouble();
//                if (val <= 0 || index == 10) break;
//                arr[index++] = val;
//            }
//            for (int i = 0; i < index; i++) {
//                total += arr[i];
//            }
//            System.out.println("Sum of entered numbers = " + total);
//
//            // ---------------------------------------------------------
//            // 5. Multiplication tables of numbers from 6 to 9
//            System.out.println("\nProgram 5: Multiplication Tables from 6 to 9");
//            for (int num = 6; num <= 9; num++) {
//                System.out.println("Table of " + num);
//                for (int i = 1; i <= 10; i++) {
//                    System.out.println(num + " * " + i + " = " + (num * i));
//                }
//                System.out.println();
//            }
//
//            // ---------------------------------------------------------
//            // 6. Mean height of 11 players
//            System.out.println("\nProgram 6: Mean Height of Players");
//            double[] heights = new double[11];
//            double sum = 0;
//            for (int i = 0; i < heights.length; i++) {
//                System.out.print("Enter height of player " + (i + 1) + ": ");
//                heights[i] = sc.nextDouble();
//                sum += heights[i];
//            }
//            double mean = sum / heights.length;
//            System.out.println("Mean height = " + mean);
//
//            // ---------------------------------------------------------
//            // 7. Save odd and even numbers in arrays
//            System.out.println("\nProgram 7: Odd and Even Numbers");
//            System.out.print("Enter a natural number: ");
//            int num = sc.nextInt();
//            if (num <= 0) {
//                System.out.println("Not a natural number!");
//            } else {
//                int[] evens = new int[num / 2 + 1];
//                int[] odds = new int[num / 2 + 1];
//                int evenIndex = 0, oddIndex = 0;
//                for (int i = 1; i <= num; i++) {
//                    if (i % 2 == 0) {
//                        evens[evenIndex++] = i;
//                    } else {
//                        odds[oddIndex++] = i;
//                    }
//                }
//                System.out.print("Even numbers: ");
//                for (int i = 0; i < evenIndex; i++) {
//                    System.out.print(evens[i] + " ");
//                }
//                System.out.print("\nOdd numbers: ");
//                for (int i = 0; i < oddIndex; i++) {
//                    System.out.print(odds[i] + " ");
//                }
//                System.out.println();
//            }
//
//            // ---------------------------------------------------------
//            // 8. Factors of a number
//            System.out.println("\nProgram 8: Factors of a Number");
//            System.out.print("Enter a number: ");
//            int facNum = sc.nextInt();
//            int[] factors = new int[10];
//            int facIndex = 0, maxFactor = 10;
//            for (int i = 1; i <= facNum; i++) {
//                if (facNum % i == 0) {
//                    if (facIndex == maxFactor) {
//                        maxFactor *= 2;
//                        int[] temp = new int[maxFactor];
//                        System.arraycopy(factors, 0, temp, 0, facIndex);
//                        factors = temp;
//                    }
//                    factors[facIndex++] = i;
//                }
//            }
//            System.out.print("Factors of " + facNum + ": ");
//            for (int i = 0; i < facIndex; i++) {
//                System.out.print(factors[i] + " ");
//            }
//            System.out.println();
//
//            // ---------------------------------------------------------
//            // 9. Copy 2D array into 1D array
//            System.out.println("\nProgram 9: 2D to 1D Array");
//            System.out.print("Enter rows: ");
//            int rows = sc.nextInt();
//            System.out.print("Enter cols: ");
//            int cols = sc.nextInt();
//            int[][] matrix = new int[rows][cols];
//            int[] flat = new int[rows * cols];
//            int idx = 0;
//            for (int i = 0; i < rows; i++) {
//                for (int j = 0; j < cols; j++) {
//                    System.out.print("Enter element [" + i + "][" + j + "]: ");
//                    matrix[i][j] = sc.nextInt();
//                    flat[idx++] = matrix[i][j];
//                }
//            }
//            System.out.print("1D array: ");
//            for (int val : flat) {
//                System.out.print(val + " ");
//            }
//            System.out.println();
//
//            // ---------------------------------------------------------
//            // 10. FizzBuzz
//            System.out.println("\nProgram 10: FizzBuzz");
//            System.out.print("Enter a positive number: ");
//            int fb = sc.nextInt();
//            if (fb <= 0) {
//                System.out.println("Not a positive number!");
//            } else {
//                String[] fbArr = new String[fb + 1];
//                for (int i = 1; i <= fb; i++) {
//                    if (i % 3 == 0 && i % 5 == 0)
//                        fbArr[i] = "FizzBuzz";
//                    else if (i % 3 == 0)
//                        fbArr[i] = "Fizz";
//                    else if (i % 5 == 0)
//                        fbArr[i] = "Buzz";
//                    else
//                        fbArr[i] = String.valueOf(i);
//                }
//                for (int i = 1; i <= fb; i++) {
//                    System.out.println("Position " + i + " = " + fbArr[i]);
//                }
//            }
//
//            sc.close();
//        }
//    }
//}


//LEVEL_2

import java.util.*;

public class Assignment_4 {

    // 1. Bonus of 10 employees
    public static void employeeBonus() {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary of employee " + (i + 1) + ": ");
            double s = sc.nextDouble();
            System.out.println("Enter years of service: ");
            double y = sc.nextDouble();

            if (s <= 0 || y < 0) {
                System.out.println("Invalid input, try again!");
                i--;
                continue;
            }

            salary[i] = s;
            years[i] = y;

            if (y > 5) bonus[i] = 0.05 * s;
            else bonus[i] = 0.02 * s;

            newSalary[i] = s + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += s;
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }

    // 2. Youngest and Tallest among 3 friends
    public static void youngestTallest() {
        Scanner sc = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        int[] height = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + friends[i] + ": ");
            age[i] = sc.nextInt();
            System.out.println("Enter height of " + friends[i] + ": ");
            height[i] = sc.nextInt();
        }

        int minAgeIndex = 0, maxHeightIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[minAgeIndex]) minAgeIndex = i;
            if (height[i] > height[maxHeightIndex]) maxHeightIndex = i;
        }

        System.out.println("Youngest: " + friends[minAgeIndex]);
        System.out.println("Tallest: " + friends[maxHeightIndex]);
    }

    // 3. Largest and second largest digit from number
    public static void largestDigits() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (num != 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
            digits[index++] = num % 10;
            num /= 10;
        }

        int largest = -1, secondLargest = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second Largest digit: " + secondLargest);
    }

    // 4. Reverse number using array
    public static void reverseNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        String str = Integer.toString(num);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }

        System.out.print("Reversed: ");
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
        System.out.println();
    }

    // 5. BMI Calculation
    public static void bmiCalculation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of persons: ");
        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter weight(kg) of person " + (i + 1) + ": ");
            weight[i] = sc.nextDouble();
            System.out.println("Enter height(m) of person " + (i + 1) + ": ");
            height[i] = sc.nextDouble();

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) status[i] = "Underweight";
            else if (bmi[i] < 24.9) status[i] = "Normal";
            else if (bmi[i] < 29.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + " -> Height: " + height[i] +
                    " Weight: " + weight[i] + " BMI: " + bmi[i] + " Status: " + status[i]);
        }
    }

    // 6. BMI using 2D array
    public static void bmi2D() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3]; // weight, height, bmi
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter weight(kg) of person " + (i + 1) + ": ");
            personData[i][0] = sc.nextDouble();
            System.out.println("Enter height(m) of person " + (i + 1) + ": ");
            personData[i][1] = sc.nextDouble();

            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            if (personData[i][2] < 18.5) status[i] = "Underweight";
            else if (personData[i][2] < 24.9) status[i] = "Normal";
            else if (personData[i][2] < 29.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + " -> Height: " + personData[i][1] +
                    " Weight: " + personData[i][0] + " BMI: " + personData[i][2] +
                    " Status: " + status[i]);
        }
    }

    // 7. Student marks percentage and grade
    public static void studentGrades() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n = sc.nextInt();

        double[][] marks = new double[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks in Physics, Chemistry, Maths for student " + (i + 1) + ": ");
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextDouble();
                if (marks[i][j] < 0) {
                    System.out.println("Invalid marks, try again!");
                    j--;
                }
            }
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentage[i] >= 90) grade[i] = 'A';
            else if (percentage[i] >= 75) grade[i] = 'B';
            else if (percentage[i] >= 50) grade[i] = 'C';
            else grade[i] = 'F';
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " -> %: " + percentage[i] + " Grade: " + grade[i]);
        }
    }

    // 8. Frequency of digits in a number
    public static void digitFrequency() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int[] freq = new int[10];
        while (num != 0) {
            freq[num % 10]++;
            num /= 10;
        }

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0)
                System.out.println("Digit " + i + " -> " + freq[i] + " times");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose Program:");
            System.out.println("1. Employee Bonus");
            System.out.println("2. Youngest & Tallest");
            System.out.println("3. Largest & Second Largest Digit");
            System.out.println("4. Reverse Number");
            System.out.println("5. BMI Calculation");
            System.out.println("6. BMI using 2D Array");
            System.out.println("7. Student Grades");
            System.out.println("8. Digit Frequency");
            System.out.println("0. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> employeeBonus();
                case 2 -> youngestTallest();
                case 3 -> largestDigits();
                case 4 -> reverseNumber();
                case 5 -> bmiCalculation();
                case 6 -> bmi2D();
                case 7 -> studentGrades();
                case 8 -> digitFrequency();
                case 0 -> System.exit(0);
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}

