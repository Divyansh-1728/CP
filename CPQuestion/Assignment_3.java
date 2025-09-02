import java.util.Scanner;
public class Assignment_2 {
    public class DivisibleByFive {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int number;
            System.out.print("Enter a number: ");
            number = input.nextInt();

            boolean isDivisible = (number % 5 == 0);
            System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

            input.close();
        }
    }
    public class SmallestOfThree {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int number1, number2, number3;
            System.out.print("Enter first number: ");
            number1 = input.nextInt();
            System.out.print("Enter second number: ");
            number2 = input.nextInt();
            System.out.print("Enter third number: ");
            number3 = input.nextInt();

            boolean isFirstSmallest = (number1 <= number2 && number1 <= number3);
            System.out.println("Is the first number the smallest? " + isFirstSmallest);

            input.close();
        }
    }
    public class LargestOfThree {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int number1, number2, number3;
            System.out.print("Enter first number: ");
            number1 = input.nextInt();
            System.out.print("Enter second number: ");
            number2 = input.nextInt();
            System.out.print("Enter third number: ");
            number3 = input.nextInt();

            System.out.println("Is the first number the largest? " + (number1 >= number2 && number1 >= number3));
            System.out.println("Is the second number the largest? " + (number2 >= number1 && number2 >= number3));
            System.out.println("Is the third number the largest? " + (number3 >= number1 && number3 >= number2));

            input.close();
        }
    }


    public class SumNaturalNumbers {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int number;
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (number >= 1) {
                int sum = number * (number + 1) / 2;
                System.out.println("The sum of " + number + " natural numbers is " + sum);
            } else {
                System.out.println("The number " + number + " is not a natural number");
            }

            input.close();
        }
    }



    public class VotingEligibility {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int age;
            System.out.print("Enter age: ");
            age = input.nextInt();

            if (age >= 18) {
                System.out.println("The person's age is " + age + " and can vote.");
            } else {
                System.out.println("The person's age is " + age + " and cannot vote.");
            }

            input.close();
        }
    }


    public class NumberCheck {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int number;
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (number > 0) {
                System.out.println("Positive");
            } else if (number < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }

            input.close();
        }
    }


    public class SpringSeason {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int month, day;
            System.out.print("Enter month (1-12): ");
            month = input.nextInt();
            System.out.print("Enter day: ");
            day = input.nextInt();

            boolean isSpring = (month == 3 && day >= 20) ||
                    (month == 4) ||
                    (month == 5) ||
                    (month == 6 && day <= 20);

            if (isSpring) {
                System.out.println("It's a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }

            input.close();
        }
    }


    public class CountdownWhile {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int counter;
            System.out.print("Enter countdown start: ");
            counter = input.nextInt();

            while (counter >= 1) {
                System.out.println(counter);
                counter--;
            }

            System.out.println("Rocket Launched!");
            input.close();
        }
    }

    public class SumUntilZero {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            double total = 0.0;
            double value;

            System.out.print("Enter a number (0 to stop): ");
            value = input.nextDouble();

            while (value != 0) {
                total += value;
                System.out.print("Enter a number (0 to stop): ");
                value = input.nextDouble();
            }

            System.out.println("Total sum = " + total);
            input.close();
        }
    }

    public class SumUntilBreak {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            double total = 0.0;

            while (true) {
                System.out.print("Enter a number (0 or negative to stop): ");
                double value = input.nextDouble();

                if (value <= 0) {
                    break;
                }
                total += value;
            }

            System.out.println("Total sum = " + total);
            input.close();
        }
    }

    public class SumUntilBreaks {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            double total = 0.0;

            while (true) {
                System.out.print("Enter a number (0 or negative to stop): ");
                double value = input.nextDouble();

                if (value <= 0) {
                    break;
                }
                total += value;
            }

            System.out.println("Total sum = " + total);
            input.close();
        }
    }

    public class SumNaturalWhile {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int number;
            System.out.print("Enter a natural number: ");
            number = input.nextInt();

            if (number >= 1) {
                int sumFormula = number * (number + 1) / 2;

                int sumLoop = 0;
                int i = 1;
                while (i <= number) {
                    sumLoop += i;
                    i++;
                }

                System.out.println("Sum using formula = " + sumFormula);
                System.out.println("Sum using while loop = " + sumLoop);
            } else {
                System.out.println("Not a natural number!");
            }

            input.close();
        }
    }


    public class SumNaturalFor {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int number;
            System.out.print("Enter a natural number: ");
            number = input.nextInt();

            if (number >= 1) {
                int sumFormula = number * (number + 1) / 2;

                int sumLoop = 0;
                for (int i = 1; i <= number; i++) {
                    sumLoop += i;
                }

                System.out.println("Sum using formula = " + sumFormula);
                System.out.println("Sum using for loop = " + sumLoop);
            } else {
                System.out.println("Not a natural number!");
            }

            input.close();
        }
    }

    public class FactorialWhile {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int number;
            System.out.print("Enter a positive integer: ");
            number = input.nextInt();

            if (number >= 0) {
                long factorial = 1;
                int i = 1;
                while (i <= number) {
                    factorial *= i;
                    i++;
                }
                System.out.println("Factorial of " + number + " = " + factorial);
            } else {
                System.out.println("Not a natural number!");
            }

            input.close();
        }
    }
    public class FactorialFor {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int number;
            System.out.print("Enter a positive integer: ");
            number = input.nextInt();

            if (number >= 0) {
                long factorial = 1;
                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }
                System.out.println("Factorial of " + number + " = " + factorial);
            } else {
                System.out.println("Not a natural number!");
            }

            input.close();
        }
    }
    public class OddEvenNumbers {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int number;
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (number >= 1) {
                for (int i = 1; i <= number; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i + " is Even");
                    } else {
                        System.out.println(i + " is Odd");
                    }
                }
            } else {
                System.out.println("Not a natural number!");
            }

            input.close();
        }
    }
    public class EmployeeBonus {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            double salary;
            int years;

            System.out.print("Enter salary: ");
            salary = input.nextDouble();
            System.out.print("Enter years of service: ");
            years = input.nextInt();

            if (years > 5) {
                double bonus = salary * 0.05;
                System.out.println("Bonus = " + bonus);
            } else {
                System.out.println("No bonus awarded.");
            }

            input.close();
        }
    }
    public class MultiplicationTable {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int number;
            System.out.print("Enter a number: ");
            number = input.nextInt();

            for (int i = 6; i <= 9; i++) {
                System.out.println(number + " * " + i + " = " + (number * i));
            }

            input.close();
        }
    }












}
