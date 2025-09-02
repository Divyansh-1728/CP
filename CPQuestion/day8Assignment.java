//import java.time.ZoneId;
//import java.time.ZonedDateTime;
//    public class day8Assignment {
//        public static void main(String[] args) {
//            ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
//            ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
//            ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
//            System.out.println("GMT Time: " + gmt);
//            System.out.println("IST Time: " + ist);
//            System.out.println("PST Time: " + pst);
//        }
//}


//import java.time.LocalDate;
//import java.util.Scanner;
//public class day8Assignment {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter date (yyyy-MM-dd): ");
//        String input = sc.next();
//
//        LocalDate date = LocalDate.parse(input);
//
//        LocalDate result = date.plusDays(7)
//                .plusMonths(1)
//                .plusYears(2)
//                .minusWeeks(3);
//
//        System.out.println("Final Date: " + result);
//        sc.close();
//    }
//}

//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//public class day8Assignment {
//    public static void main(String[] args) {
//        LocalDate today = LocalDate.now();
//        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
//        System.out.println("Format 1: " + today.format(format1));
//        System.out.println("Format 2: " + today.format(format2));
//        System.out.println("Format 3: " + today.format(format3));
//    }
//}

//import java.time.LocalDate;
//import java.util.Scanner;
//public class day8Assignment {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter first date (yyyy-MM-dd): ");
//        LocalDate date1 = LocalDate.parse(sc.next());
//        System.out.print("Enter second date (yyyy-MM-dd): ");
//        LocalDate date2 = LocalDate.parse(sc.next());
//        if (date1.isBefore(date2)) {
//            System.out.println(date1 + " is before " + date2);
//        } else if (date1.isAfter(date2)) {
//            System.out.println(date1 + " is after " + date2);
//        } else {
//            System.out.println(date1 + " is equal to " + date2);
//        }
//        sc.close();
//    }
//}

//import java.util.Random;
//import java.util.Scanner;
//public class day8Assignment{
//    static Random rand = new Random();
//    static Scanner sc = new Scanner(System.in);
//    static int generateGuess(int low, int high) {
//        return rand.nextInt(high - low + 1) + low;
//    }
//    public static void main(String[] args) {
//        int low = 1, high = 100;
//        String feedback = "";
//        System.out.println("Think of a number between 1 and 100!");
//        while (true) {
//            int guess = generateGuess(low, high);
//            System.out.println("Computer guesses: " + guess);
//            System.out.print("Is it High (H), Low (L), or Correct (C)? ");
//            feedback = sc.next().toUpperCase();
//            if (feedback.equals("C")) {
//                System.out.println("Yay! Computer guessed your number!");
//                break;
//            } else if (feedback.equals("H")) {
//                high = guess - 1;
//            } else if (feedback.equals("L")) {
//                low = guess + 1;
//            }
//            if (low > high) {
//                System.out.println("Seems like wrong feedback was given!");
//                break;
//            }
//        }
//    }
//}

//import java.util.Scanner;
//public class day8Assignment{
//    static int findMax(int a, int b, int c) {
//        return Math.max(a, Math.max(b, c));
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter three numbers: ");
//        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
//        System.out.println("Maximum = " + findMax(a, b, c));
//        sc.close();
//    }
//}

//import java.util.Scanner;
//public class day8Assignment {
//    static boolean isPrime(int n) {
//        if (n <= 1) return false;
//        for (int i = 2; i * i <= n; i++) {
//            if (n % i == 0) return false;
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();
//        System.out.println(n + (isPrime(n) ? " is Prime" : " is Not Prime"));
//        sc.close();
//    }
//}
//
//
//import java.util.Scanner;
//public class day8Assignment {
//    static void generateFibonacci(int terms) {
//        int a = 0, b = 1;
//        System.out.print("Fibonacci Sequence: ");
//        for (int i = 1; i <= terms; i++) {
//            System.out.print(a + " ");
//            int next = a + b;
//            a = b;
//            b = next;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number of terms: ");
//        int terms = sc.nextInt();
//        generateFibonacci(terms);
//        sc.close();
//    }
//}
//
//
//import java.util.Scanner;
//public class day8Assignment {
//    static boolean isPalindrome(String str) {
//        str = str.toLowerCase();
//        int i = 0, j = str.length() - 1;
//        while (i < j) {
//            if (str.charAt(i) != str.charAt(j)) return false;
//            i++; j--;
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a string: ");
//        String str = sc.nextLine();
//
//        System.out.println(str + (isPalindrome(str) ? " is Palindrome" : " is Not Palindrome"));
//        sc.close();
//    }
//}
//
//
//import java.util.Scanner;
//public class day8Assignment {
//    static long factorial(int n) {
//        if (n == 0) return 1;
//        return n * factorial(n - 1);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();
//        System.out.println("Factorial of " + n + " = " + factorial(n));
//        sc.close();
//    }
//}
//
//
//import java.util.Scanner;
//public class day8Assignment {
//    static int gcd(int a, int b) {
//        if (b == 0) return a;
//        return gcd(b, a % b);
//    }
//    static int lcm(int a, int b) {
//        return (a * b) / gcd(a, b);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter two numbers: ");
//        int a = sc.nextInt(), b = sc.nextInt();
//        System.out.println("GCD = " + gcd(a, b));
//        System.out.println("LCM = " + lcm(a, b));
//        sc.close();
//    }
//}
//
//
import java.util.Scanner;
public class day8Assignment {
    static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    static double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        System.out.print("Convert to (C/F): ");
        char choice = sc.next().toUpperCase().charAt(0);
        if (choice == 'C')
            System.out.println("Celsius = " + toCelsius(temp));
        else
            System.out.println("Fahrenheit = " + toFahrenheit(temp));
        sc.close();
    }
}
