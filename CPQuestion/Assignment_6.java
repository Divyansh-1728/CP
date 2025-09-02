//import java.util.Scanner;
//public class Assignment_6 {
//    public class Level1Programs {
//
//        // 1. Simple Interest
//        public static double calculateSimpleInterest(double principal, double rate, double time) {
//            return (principal * rate * time) / 100;
//        }
//
//        // 2. Maximum Handshakes
//        public static int calculateHandshakes(int numberOfStudents) {
//            return (numberOfStudents * (numberOfStudents - 1)) / 2;
//        }
//
//        // 3. Athlete Rounds in Triangular Park
//        public static double calculateRounds(double side1, double side2, double side3, double distanceKm) {
//            double perimeter = side1 + side2 + side3;
//            double distanceMeters = distanceKm * 1000;
//            return distanceMeters / perimeter;
//        }
//
//        // 4. Positive, Negative, Zero
//        public static int checkNumber(int number) {
//            if (number > 0) return 1;
//            else if (number < 0) return -1;
//            else return 0;
//        }
//
//        // 5. Spring Season Checker
//        public static boolean isSpringSeason(int month, int day) {
//            if ((month == 3 && day >= 20) || (month == 6 && day <= 20) || (month > 3 && month < 6)) {
//                return true;
//            }
//            return false;
//        }
//
//        // 6. Sum of n Natural Numbers
//        public static int sumNaturalNumbers(int n) {
//            int sum = 0;
//            for (int i = 1; i <= n; i++) sum += i;
//            return sum;
//        }
//
//        // 7. Smallest and Largest of 3 Numbers
//        public static int[] findSmallestAndLargest(int n1, int n2, int n3) {
//            int smallest = Math.min(n1, Math.min(n2, n3));
//            int largest = Math.max(n1, Math.max(n2, n3));
//            return new int[]{smallest, largest};
//        }
//
//        // 8. Quotient and Remainder
//        public static int[] findRemainderAndQuotient(int number, int divisor) {
//            int quotient = number / divisor;
//            int remainder = number % divisor;
//            return new int[]{quotient, remainder};
//        }
//
//        // 9. Divide Chocolates among Children
//        public static int[] divideChocolates(int chocolates, int children) {
//            int perChild = chocolates / children;
//            int remaining = chocolates % children;
//            return new int[]{perChild, remaining};
//        }
//
//        // 10. Wind Chill Calculator
//        public static double calculateWindChill(double temp, double windSpeed) {
//            return 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
//        }
//
//        // 11. Trigonometric Functions
//        public static double[] calculateTrigonometricFunctions(double angleDegrees) {
//            double radians = Math.toRadians(angleDegrees);
//            return new double[]{Math.sin(radians), Math.cos(radians), Math.tan(radians)};
//        }
//
//        // ---------------- MAIN METHOD ----------------
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//
//            System.out.println("Choose Program (1-11):");
//            int choice = sc.nextInt();
//
//            switch (choice) {
//                case 1: // Simple Interest
//                    System.out.print("Enter Principal, Rate, Time: ");
//                    double p = sc.nextDouble(), r = sc.nextDouble(), t = sc.nextDouble();
//                    double si = calculateSimpleInterest(p, r, t);
//                    System.out.println("The Simple Interest is " + si);
//                    break;
//
//                case 2: // Handshakes
//                    System.out.print("Enter number of students: ");
//                    int students = sc.nextInt();
//                    System.out.println("Max Handshakes: " + calculateHandshakes(students));
//                    break;
//
//                case 3: // Athlete Rounds
//                    System.out.print("Enter 3 sides of triangle (m): ");
//                    double s1 = sc.nextDouble(), s2 = sc.nextDouble(), s3 = sc.nextDouble();
//                    System.out.println("Rounds to complete 5 km: " + calculateRounds(s1, s2, s3, 5));
//                    break;
//
//                case 4: // Positive/Negative/Zero
//                    System.out.print("Enter a number: ");
//                    int num = sc.nextInt();
//                    int res = checkNumber(num);
//                    System.out.println("Result: " + res);
//                    break;
//
//                case 5: // Spring Season
//                    System.out.print("Enter month and day: ");
//                    int m = sc.nextInt(), d = sc.nextInt();
//                    System.out.println(isSpringSeason(m, d) ? "Its a Spring Season" : "Not a Spring Season");
//                    break;
//
//                case 6: // Sum of Natural Numbers
//                    System.out.print("Enter n: ");
//                    int n = sc.nextInt();
//                    System.out.println("Sum = " + sumNaturalNumbers(n));
//                    break;
//
//                case 7: // Smallest and Largest
//                    System.out.print("Enter 3 numbers: ");
//                    int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
//                    int[] sl = findSmallestAndLargest(n1, n2, n3);
//                    System.out.println("Smallest = " + sl[0] + ", Largest = " + sl[1]);
//                    break;
//
//                case 8: // Quotient and Remainder
//                    System.out.print("Enter number and divisor: ");
//                    int num1 = sc.nextInt(), div = sc.nextInt();
//                    int[] qr = findRemainderAndQuotient(num1, div);
//                    System.out.println("Quotient = " + qr[0] + ", Remainder = " + qr[1]);
//                    break;
//
//                case 9: // Divide Chocolates
//                    System.out.print("Enter chocolates and children: ");
//                    int ch = sc.nextInt(), child = sc.nextInt();
//                    int[] choc = divideChocolates(ch, child);
//                    System.out.println("Each child gets " + choc[0] + ", Remaining = " + choc[1]);
//                    break;
//
//                case 10: // Wind Chill
//                    System.out.print("Enter temperature and wind speed: ");
//                    double temp = sc.nextDouble(), ws = sc.nextDouble();
//                    System.out.println("Wind Chill = " + calculateWindChill(temp, ws));
//                    break;
//
//                case 11: // Trigonometric Functions
//                    System.out.print("Enter angle in degrees: ");
//                    double angle = sc.nextDouble();
//                    double[] trig = calculateTrigonometricFunctions(angle);
//                    System.out.println("sin = " + trig[0] + ", cos = " + trig[1] + ", tan = " + trig[2]);
//                    break;
//
//                default:
//                    System.out.println("Invalid choice!");
//            }
//
//            sc.close();
//        }
//    }
//
//    // LEVEL_2
//
//        // 1. Factors of a number
//        public static int[] findFactors(int number) {
//            int count = 0;
//            for (int i = 1; i <= number; i++) if (number % i == 0) count++;
//            int[] factors = new int[count];
//            int index = 0;
//            for (int i = 1; i <= number; i++) if (number % i == 0) factors[index++] = i;
//            return factors;
//        }
//        public static int sumOfFactors(int[] factors) {
//            int sum = 0;
//            for (int f : factors) sum += f;
//            return sum;
//        }
//        public static int productOfFactors(int[] factors) {
//            int product = 1;
//            for (int f : factors) product *= f;
//            return product;
//        }
//        public static int sumOfSquaresOfFactors(int[] factors) {
//            int sum = 0;
//            for (int f : factors) sum += Math.pow(f, 2);
//            return sum;
//        }
//
//        // 2. Sum of n natural numbers using recursion
//        public static int sumRecursive(int n) {
//            if (n == 0) return 0;
//            return n + sumRecursive(n - 1);
//        }
//        public static int sumFormula(int n) {
//            return n * (n + 1) / 2;
//        }
//
//        // 3. Leap year check
//        public static boolean isLeapYear(int year) {
//            if (year < 1582) return false;
//            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
//        }
//
//        // 5. Voting eligibility
//        public static boolean canStudentVote(int age) {
//            if (age < 0) return false;
//            return age >= 18;
//        }
//
//        // 6. Youngest and tallest among 3
//        public static int findYoungest(int[] ages) {
//            int minIndex = 0;
//            for (int i = 1; i < ages.length; i++) if (ages[i] < ages[minIndex]) minIndex = i;
//            return minIndex;
//        }
//        public static int findTallest(int[] heights) {
//            int maxIndex = 0;
//            for (int i = 1; i < heights.length; i++) if (heights[i] > heights[maxIndex]) maxIndex = i;
//            return maxIndex;
//        }
//
//        // 7. Positive/Negative and Even/Odd
//        public static boolean isPositive(int num) { return num >= 0; }
//        public static boolean isEven(int num) { return num % 2 == 0; }
//        public static int compare(int a, int b) {
//            if (a > b) return 1;
//            if (a == b) return 0;
//            return -1;
//        }
//
//        // 8. BMI Calculator
//        public static double calculateBMI(double weight, double heightCm) {
//            double heightM = heightCm / 100.0;
//            return weight / (heightM * heightM);
//        }
//        public static String getBMIStatus(double bmi) {
//            if (bmi < 18.5) return "Underweight";
//            else if (bmi < 24.9) return "Normal";
//            else if (bmi < 29.9) return "Overweight";
//            else return "Obese";
//        }
//
//        // 9. Quadratic roots
//        public static double[] quadraticRoots(double a, double b, double c) {
//            double delta = b * b - 4 * a * c;
//            if (delta < 0) return new double[0];
//            if (delta == 0) return new double[]{ -b / (2 * a) };
//            double sqrtDelta = Math.sqrt(delta);
//            return new double[]{ (-b + sqrtDelta) / (2 * a), (-b - sqrtDelta) / (2 * a) };
//        }
//
//        // 10. Random numbers average, min, max
//        public static int[] generate4DigitRandomArray(int size) {
//            int[] arr = new int[size];
//            for (int i = 0; i < size; i++) arr[i] = 1000 ;
//            return arr;
//        }
//        public static double[] findAverageMinMax(int[] numbers) {
//            int min = numbers[0], max = numbers[0], sum = 0;
//            for (int n : numbers) {
//                if (n < min) min = n;
//                if (n > max) max = n;
//                sum += n;
//            }
//            double avg = sum / (double) numbers.length;
//            return new double[]{ avg, min, max };
//        }
//
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//
//            // Example run: Factors
//            System.out.print("Enter a number for factors: ");
//            int num = sc.nextInt();
//            int[] factors = findFactors(num);
//            System.out.println("Sum: " + sumOfFactors(factors));
//            System.out.println("Product: " + productOfFactors(factors));
//            System.out.println("Sum of squares: " + sumOfSquaresOfFactors(factors));
//
//            // Example run: Sum recursion vs formula
//            System.out.print("\nEnter n for sum of natural numbers: ");
//            int n = sc.nextInt();
//            System.out.println("Recursive sum: " + sumRecursive(n));
//            System.out.println("Formula sum: " + sumFormula(n));
//
//            // Example run: Leap year
//            System.out.print("\nEnter year: ");
//            int year = sc.nextInt();
//            System.out.println("Leap year? " + isLeapYear(year));
//
//            // Example run: Vote check
//            System.out.print("\nEnter age: ");
//            int age = sc.nextInt();
//            System.out.println("Can vote? " + canStudentVote(age));
//
//            // Example run: Quadratic
//            System.out.print("\nEnter coefficients a, b, c: ");
//            double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
//            double[] roots = quadraticRoots(a, b, c);
//
//            // Example run: Random 5 numbers
//            int[] randArr = generate4DigitRandomArray(5);
//            double[] stats = findAverageMinMax(randArr);
//            System.out.println("Average: " + stats[0] + " Min: " + stats[1] + " Max: " + stats[2]);
//
//            sc.close();
//        }
//        //LEVEL_3
//
//        public static int[] generateHeights(int size) {
//            int[] heights = new int[size];
//            Random r = new Random();
//            for (int i = 0; i < size; i++) {
//                heights[i] = 150 + r.nextInt(101); // 150–250
//            }
//            return heights;
//        }
//
//        public static int findShortest(int[] arr) {
//            return Arrays.stream(arr).min().getAsInt();
//        }
//
//        public static int findTallest(int[] arr) {
//            return Arrays.stream(arr).max().getAsInt();
//        }
//
//        public static double findMean(int[] arr) {
//            return Arrays.stream(arr).average().orElse(0);
//        }
//
//        /* ---------- NumberChecker Utility ---------- */
//        public static int countDigits(int n) {
//            return String.valueOf(Math.abs(n)).length();
//        }
//
//        public static int[] getDigits(int n) {
//            String s = String.valueOf(Math.abs(n));
//            int[] digits = new int[s.length()];
//            for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
//            return digits;
//        }
//
//        public static boolean isArmstrong(int n) {
//            int[] d = getDigits(n);
//            int sum = 0;
//            for (int x : d) sum += Math.pow(x, d.length);
//            return sum == n;
//        }
//
//        public static boolean isDuck(int n) {
//            return String.valueOf(n).contains("0");
//        }
//
//        public static boolean isPalindrome(int n) {
//            String s = String.valueOf(n);
//            return new StringBuilder(s).reverse().toString().equals(s);
//        }
//
//        public static boolean isPrime(int n) {
//            if (n <= 1) return false;
//            for (int i = 2; i <= Math.sqrt(n); i++)
//                if (n % i == 0) return false;
//            return true;
//        }
//
//        public static boolean isNeon(int n) {
//            int sq = n * n;
//            int sum = 0;
//            while (sq > 0) {
//                sum += sq % 10;
//                sq /= 10;
//            }
//            return sum == n;
//        }
//
//        public static boolean isSpy(int n) {
//            int sum = 0, prod = 1;
//            while (n > 0) {
//                int d = n % 10;
//                sum += d;
//                prod *= d;
//                n /= 10;
//            }
//            return sum == prod;
//        }
//
//        public static boolean isBuzz(int n) {
//            return (n % 7 == 0) || (n % 10 == 7);
//        }
//
//        public static boolean isPerfect(int n) {
//            int sum = 1;
//            for (int i = 2; i <= n / 2; i++)
//                if (n % i == 0) sum += i;
//            return sum == n;
//        }
//
//
//        public static int productFactors(int[] factors) {
//            int prod = 1;
//            for (int f : factors) prod *= f;
//            return prod;
//        }
//
//        /* ---------- OTP Generator ---------- */
//        public static String generateOTP() {
//            Random r = new Random();
//            int otp = 100000 + r.nextInt(900000); // 6-digit
//            return String.valueOf(otp);
//        }
//
//        /* ---------- Calendar Generator ---------- */
//        public static void displayCalendar(int month, int year) {
//            String[] months = {"", "January","February","March","April","May","June",
//                    "July","August","September","October","November","December"};
//            int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
//            if (month == 2 && isLeapYear(year)) days[2] = 29;
//
//            System.out.println("   " + months[month] + " " + year);
//            System.out.println("Su Mo Tu We Th Fr Sa");
//
//            Calendar cal = new GregorianCalendar(year, month - 1, 1);
//            int firstDay = cal.get(Calendar.DAY_OF_WEEK);
//
//            for (int i = 1; i < firstDay; i++) System.out.print("   ");
//            for (int day = 1; day <= days[month]; day++) {
//                System.out.printf("%2d ", day);
//                if ((day + firstDay - 1) % 7 == 0) System.out.println();
//            }
//            System.out.println();
//        }
//
//        public static boolean isLeapYears(int year) {
//            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
//        }
//
//        /* ---------- Main ---------- */
//        public static void main(String[] args) {
//            // Example run:
//            int[] heights = generateHeights(11);
//            System.out.println("Heights: " + Arrays.toString(heights));
//            System.out.println("Shortest: " + findShortest(heights));
//            System.out.println("Tallest: " + findTallest(heights));
//            System.out.println("Mean: " + findMean(heights));
//
//            int num = 153;
//            System.out.println(num + " Armstrong? " + isArmstrong(num));
//            System.out.println(num + " Prime? " + isPrime(num));
//            System.out.println("OTP: " + generateOTP());
//
//            displayCalendar(7, 2005); // Example July 2005
//        }
//}
