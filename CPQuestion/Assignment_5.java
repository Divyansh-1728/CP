import java.util.*;
//public class Assignment_5 {
//
//        // 1. Compare two strings using charAt()
//        static boolean compareStrings(String s1, String s2) {
//            if (s1.length() != s2.length()) return false;
//            for (int i = 0; i < s1.length(); i++) {
//                if (s1.charAt(i) != s2.charAt(i)) return false;
//            }
//            return true;
//        }
//
//        // 2. Create substring using charAt()
//        static String createSubstring(String text, int start, int end) {
//            String result = "";
//            for (int i = start; i < end; i++) {
//                result += text.charAt(i);
//            }
//            return result;
//        }
//
//        // 3. Return all characters in string (manual toCharArray)
//        static char[] customToCharArray(String text) {
//            char[] arr = new char[text.length()];
//            for (int i = 0; i < text.length(); i++) {
//                arr[i] = text.charAt(i);
//            }
//            return arr;
//        }
//
//        static boolean compareArrays(char[] a1, char[] a2) {
//            if (a1.length != a2.length) return false;
//            for (int i = 0; i < a1.length; i++) {
//                if (a1[i] != a2[i]) return false;
//            }
//            return true;
//        }
//
//        // 4. NullPointerException
//        static void generateNPE() {
//            String text = null;
//            System.out.println(text.length()); // generates exception
//        }
//
//        static void handleNPE() {
//            try {
//                String text = null;
//                System.out.println(text.length());
//            } catch (NullPointerException e) {
//                System.out.println("Handled NullPointerException!");
//            }
//        }
//
//        // 5. StringIndexOutOfBoundsException
//        static void generateSIOOBE(String text) {
//            System.out.println(text.charAt(text.length() + 1));
//        }
//
//        static void handleSIOOBE(String text) {
//            try {
//                System.out.println(text.charAt(text.length() + 1));
//            } catch (StringIndexOutOfBoundsException e) {
//                System.out.println("Handled StringIndexOutOfBoundsException!");
//            }
//        }
//
//        // 6. IllegalArgumentException
//        static void generateIAE(String text) {
//            System.out.println(text.substring(5, 2));
//        }
//
//        static void handleIAE(String text) {
//            try {
//                System.out.println(text.substring(5, 2));
//            } catch (IllegalArgumentException e) {
//                System.out.println("Handled IllegalArgumentException!");
//            }
//        }
//
//        // 7. NumberFormatException
//        static void generateNFE(String text) {
//            int num = Integer.parseInt(text);
//            System.out.println(num);
//        }
//
//        static void handleNFE(String text) {
//            try {
//                int num = Integer.parseInt(text);
//                System.out.println(num);
//            } catch (NumberFormatException e) {
//                System.out.println("Handled NumberFormatException!");
//            }
//        }
//
//        // 8. ArrayIndexOutOfBoundsException
//        static void generateAIOOBE(String[] arr) {
//            System.out.println(arr[arr.length]);
//        }
//
//        static void handleAIOOBE(String[] arr) {
//            try {
//                System.out.println(arr[arr.length]);
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("Handled ArrayIndexOutOfBoundsException!");
//            }
//        }
//
//        // 9. Convert to uppercase manually
//        static String toUpperCaseManual(String text) {
//            String result = "";
//            for (int i = 0; i < text.length(); i++) {
//                char c = text.charAt(i);
//                if (c >= 'a' && c <= 'z') {
//                    result += (char)(c - 32);
//                } else {
//                    result += c;
//                }
//            }
//            return result;
//        }
//
//        // 10. Convert to lowercase manually
//        static String toLowerCaseManual(String text) {
//            String result = "";
//            for (int i = 0; i < text.length(); i++) {
//                char c = text.charAt(i);
//                if (c >= 'A' && c <= 'Z') {
//                    result += (char)(c + 32);
//                } else {
//                    result += c;
//                }
//            }
//            return result;
//        }
//
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//
//            // 1. Compare two strings
//            System.out.print("Enter first string: ");
//            String s1 = sc.next();
//            System.out.print("Enter second string: ");
//            String s2 = sc.next();
//            boolean manualCompare = compareStrings(s1, s2);
//            boolean builtinCompare = s1.equals(s2);
//            System.out.println("Manual compare: " + manualCompare + ", Built-in compare: " + builtinCompare);
//
//            // 2. Substring
//            System.out.print("Enter text: ");
//            String text = sc.next();
//            System.out.print("Enter start index: ");
//            int start = sc.nextInt();
//            System.out.print("Enter end index: ");
//            int end = sc.nextInt();
//            String manualSub = createSubstring(text, start, end);
//            String builtinSub = text.substring(start, end);
//            System.out.println("Manual substring: " + manualSub + ", Built-in substring: " + builtinSub);
//
//            // 3. toCharArray()
//            System.out.print("Enter string for toCharArray: ");
//            String str = sc.next();
//            char[] manualArr = customToCharArray(str);
//            char[] builtinArr = str.toCharArray();
//            System.out.println("Arrays same? " + compareArrays(manualArr, builtinArr));
//
//            // 4. NullPointerException
//            // generateNPE(); // will crash
//            handleNPE();
//
//            // 5. StringIndexOutOfBoundsException
//            // generateSIOOBE("hello");
//            handleSIOOBE("hello");
//
//            // 6. IllegalArgumentException
//            // generateIAE("abcdef");
//            handleIAE("abcdef");
//
//            // 7. NumberFormatException
//            // generateNFE("abc");
//            handleNFE("abc");
//
//            // 8. ArrayIndexOutOfBoundsException
//            String[] arr = {"A", "B", "C"};
//            // generateAIOOBE(arr);
//            handleAIOOBE(arr);
//
//            // 9. To uppercase
//            sc.nextLine(); // clear buffer
//            System.out.print("Enter text to convert to uppercase: ");
//            String upperText = sc.nextLine();
//            String manualUpper = toUpperCaseManual(upperText);
//            String builtinUpper = upperText.toUpperCase();
//            System.out.println("Manual uppercase: " + manualUpper + ", Built-in: " + builtinUpper);
//            System.out.println("Compare: " + compareStrings(manualUpper, builtinUpper));
//
//            // 10. To lowercase
//            System.out.print("Enter text to convert to lowercase: ");
//            String lowerText = sc.nextLine();
//            String manualLower = toLowerCaseManual(lowerText);
//            String builtinLower = lowerText.toLowerCase();
//            System.out.println("Manual lowercase: " + manualLower + ", Built-in: " + builtinLower);
//            System.out.println("Compare: " + compareStrings(manualLower, builtinLower));
//        }
//    }

// LEVEL_2

//public class Assignment_5{
//
//    // ----------- Utility: custom length() without using length() ----------
//    static int customLength(String text) {
//        int count = 0;
//        try {
//            while (true) {
//                text.charAt(count);
//                count++;
//            }
//        } catch (StringIndexOutOfBoundsException e) {
//            return count;
//        }
//    }
//
//    // ----------- 1. Split text into words manually ----------
//    static String[] customSplit(String text) {
//        List<String> words = new ArrayList<>();
//        String current = "";
//        for (int i = 0; i < customLength(text); i++) {
//            char c = text.charAt(i);
//            if (c == ' ') {
//                if (!current.isEmpty()) {
//                    words.add(current);
//                    current = "";
//                }
//            } else {
//                current += c;
//            }
//        }
//        if (!current.isEmpty()) words.add(current);
//        return words.toArray(new String[0]);
//    }
//
//    static boolean compareStringArrays(String[] a, String[] b) {
//        if (a.length != b.length) return false;
//        for (int i = 0; i < a.length; i++) {
//            if (!a[i].equals(b[i])) return false;
//        }
//        return true;
//    }
//
//    // ----------- 2. Words with lengths (2D array) ----------
//    static String[][] wordsWithLength(String text) {
//        String[] words = customSplit(text);
//        String[][] result = new String[words.length][2];
//        for (int i = 0; i < words.length; i++) {
//            result[i][0] = words[i];
//            result[i][1] = String.valueOf(customLength(words[i]));
//        }
//        return result;
//    }
//
//    // ----------- 3. Find shortest & longest words ----------
//    static String[] findShortestLongest(String text) {
//        String[][] table = wordsWithLength(text);
//        String shortest = table[0][0], longest = table[0][0];
//        int minLen = Integer.parseInt(table[0][1]);
//        int maxLen = minLen;
//        for (int i = 1; i < table.length; i++) {
//            int len = Integer.parseInt(table[i][1]);
//            if (len < minLen) {
//                minLen = len;
//                shortest = table[i][0];
//            }
//            if (len > maxLen) {
//                maxLen = len;
//                longest = table[i][0];
//            }
//        }
//        return new String[]{shortest, longest};
//    }
//
//    // ----------- 4. Vowels & Consonants count ----------
//    static boolean isLetter(char c) {
//        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
//    }
//
//    static boolean isVowel(char c) {
//        char lower = (c >= 'A' && c <= 'Z') ? (char)(c + 32) : c;
//        return lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u';
//    }
//
//    static int[] vowelConsonantCount(String text) {
//        int vowels = 0, consonants = 0;
//        for (int i = 0; i < customLength(text); i++) {
//            char c = text.charAt(i);
//            if (isLetter(c)) {
//                if (isVowel(c)) vowels++;
//                else consonants++;
//            }
//        }
//        return new int[]{vowels, consonants};
//    }
//
//    // ----------- 5. Vowels/Consonants per character ----------
//    static String[][] vowelConsonantDetails(String text) {
//        String[][] result = new String[customLength(text)][2];
//        for (int i = 0; i < customLength(text); i++) {
//            char c = text.charAt(i);
//            result[i][0] = String.valueOf(c);
//            if (!isLetter(c)) result[i][1] = "Not a Letter";
//            else if (isVowel(c)) result[i][1] = "Vowel";
//            else result[i][1] = "Consonant";
//        }
//        return result;
//    }
//
//    // ----------- 6. Trim spaces manually ----------
//    static int[] trimIndexes(String text) {
//        int start = 0, end = customLength(text) - 1;
//        while (start <= end && text.charAt(start) == ' ') start++;
//        while (end >= start && text.charAt(end) == ' ') end--;
//        return new int[]{start, end + 1};
//    }
//
//    static String customSubstring(String text, int start, int end) {
//        String result = "";
//        for (int i = start; i < end; i++) {
//            result += text.charAt(i);
//        }
//        return result;
//    }
//
//    static boolean customCompare(String s1, String s2) {
//        if (customLength(s1) != customLength(s2)) return false;
//        for (int i = 0; i < customLength(s1); i++) {
//            if (s1.charAt(i) != s2.charAt(i)) return false;
//        }
//        return true;
//    }
//
//    // ----------- 7. Age voting check ----------
//    static int[] generateAges(int n) {
//        Random rand = new Random();
//        int[] ages = new int[n];
//        for (int i = 0; i < n; i++) ages[i] = rand.nextInt(90) + 10; // 10-99
//        return ages;
//    }
//
//    static String[][] canVote(int[] ages) {
//        String[][] result = new String[ages.length][2];
//        for (int i = 0; i < ages.length; i++) {
//            result[i][0] = String.valueOf(ages[i]);
//            if (ages[i] >= 18) result[i][1] = "true";
//            else result[i][1] = "false";
//        }
//        return result;
//    }
//
//    // ----------- 8. Rock Paper Scissors ----------
//    static String computerChoice() {
//        String[] choices = {"rock", "paper", "scissors"};
//        return choices[(int)(Math.random() * 3)];
//    }
//
//    static String findWinner(String user, String comp) {
//        if (user.equals(comp)) return "draw";
//        if ((user.equals("rock") && comp.equals("scissors")) ||
//                (user.equals("paper") && comp.equals("rock")) ||
//                (user.equals("scissors") && comp.equals("paper"))) return "user";
//        return "computer";
//    }
//
//    // ----------- 9. Student Marks ----------
//    static int[][] generateScores(int students) {
//        Random rand = new Random();
//        int[][] scores = new int[students][3]; // PCM
//        for (int i = 0; i < students; i++) {
//            scores[i][0] = rand.nextInt(41) + 60; // 60-100
//            scores[i][1] = rand.nextInt(41) + 60;
//            scores[i][2] = rand.nextInt(41) + 60;
//        }
//        return scores;
//    }
//
//    static String grade(double percent) {
//        if (percent >= 90) return "A+";
//        else if (percent >= 80) return "A";
//        else if (percent >= 70) return "B";
//        else if (percent >= 60) return "C";
//        else return "F";
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Example runs (uncomment one by one to test)
//        System.out.println("=== String Length without length() ===");
//        System.out.print("Enter string: ");
//        String str = sc.nextLine();
//        System.out.println("Custom length: " + customLength(str) + ", Built-in: " + str.length());
//
//        System.out.println("\n=== Split text into words ===");
//        System.out.print("Enter text: ");
//        String text = sc.nextLine();
//        String[] manualSplit = customSplit(text);
//        String[] builtinSplit = text.split(" ");
//        System.out.println("Manual: " + Arrays.toString(manualSplit));
//        System.out.println("Built-in: " + Arrays.toString(builtinSplit));
//        System.out.println("Arrays same? " + compareStringArrays(manualSplit, builtinSplit));
//
//        System.out.println("\n=== Words with Lengths ===");
//        String[][] table = wordsWithLength(text);
//        for (String[] row : table) {
//            System.out.println(row[0] + " -> " + row[1]);
//        }
//
//        System.out.println("\n=== Shortest & Longest Words ===");
//        String[] extremes = findShortestLongest(text);
//        System.out.println("Shortest: " + extremes[0] + ", Longest: " + extremes[1]);
//
//        System.out.println("\n=== Vowel & Consonant Count ===");
//        int[] counts = vowelConsonantCount(text);
//        System.out.println("Vowels: " + counts[0] + ", Consonants: " + counts[1]);
//
//        System.out.println("\n=== Vowel/Consonant Details ===");
//        String[][] details = vowelConsonantDetails(text);
//        for (String[] row : details) {
//            System.out.println(row[0] + " -> " + row[1]);
//        }
//
//        System.out.println("\n=== Trim Spaces ===");
//        String spaced = "   hello world   ";
//        int[] idx = trimIndexes(spaced);
//        String trimmedManual = customSubstring(spaced, idx[0], idx[1]);
//        String trimmedBuiltin = spaced.trim();
//        System.out.println("Manual trim: '" + trimmedManual + "', Built-in trim: '" + trimmedBuiltin + "'");
//        System.out.println("Same? " + customCompare(trimmedManual, trimmedBuiltin));
//
//        System.out.println("\n=== Voting Eligibility ===");
//        int[] ages = generateAges(10);
//        String[][] voting = canVote(ages);
//        System.out.println("Age | Can Vote");
//        for (String[] row : voting) {
//            System.out.println(row[0] + " | " + row[1]);
//        }
//
//        System.out.println("\n=== Rock Paper Scissors ===");
//        System.out.print("Enter your choice (rock/paper/scissors): ");
//        String user = sc.next().toLowerCase();
//        String comp = computerChoice();
//        String winner = findWinner(user, comp);
//        System.out.println("You: " + user + ", Computer: " + comp + " -> Winner: " + winner);
//
//        System.out.println("\n=== Student Marks ===");
//        int[][] scores = generateScores(5);
//        for (int i = 0; i < scores.length; i++) {
//            int total = scores[i][0] + scores[i][1] + scores[i][2];
//            double percent = Math.round((total / 3.0) * 100.0) / 100.0;
//            System.out.println("Student " + (i+1) + ": " + Arrays.toString(scores[i]) +
//                    " | Total: " + total + " | %: " + percent + " | Grade: " + grade(percent));
//        }
//    }
//}

// LEVEL _3

import java.util.*;

public class Assignment_5 {

    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }

    public static String bmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static void bmiProgram() {
        Scanner sc = new Scanner(System.in);
        double[][] persons = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            persons[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            persons[i][1] = sc.nextDouble();
        }
        System.out.println("Height(cm)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            double bmi = calculateBMI(persons[i][0], persons[i][1]);
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t%s\n",
                    persons[i][1], persons[i][0], bmi, bmiStatus(bmi));
        }
    }


    public static char[] uniqueChars(String text) {
        int n = text.length();
        char[] result = new char[n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    unique = false;
                    break;
                }
            }
            if (unique) result[idx++] = c;
        }
        return Arrays.copyOf(result, idx);
    }


    public static char firstNonRepeating(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) return text.charAt(i);
        }
        return '_';
    }

    // ================= Frequency of Characters =================
    public static void charFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        System.out.println("Char\tFrequency");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + "\t" + freq[i]);
            }
        }
    }

    // ================= Palindrome Check =================
    public static boolean isPalindrome(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    public static boolean isPalindromeArray(String text) {
        char[] arr = text.toCharArray();
        char[] rev = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return Arrays.equals(arr, rev);
    }


    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] freq = new int[256];
        for (char c : s1.toCharArray()) freq[c]++;
        for (char c : s2.toCharArray()) freq[c]--;
        for (int f : freq) if (f != 0) return false;
        return true;
    }

    public static boolean isLeapYear(int y) {
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }

    public static void printCalendar(int m, int y) {
        String[] months = {"", "January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (m == 2 && isLeapYear(y)) days[2] = 29;

        int d = 1;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        System.out.println("   " + months[m] + " " + y);
        System.out.println("Su Mo Tu We Th Fr Sa");
        for (int i = 0; i < d0; i++) System.out.print("   ");
        for (int i = 1; i <= days[m]; i++) {
            System.out.printf("%2d ", i);
            if (((i + d0) % 7 == 0) || (i == days[m])) System.out.println();
        }
    }

    // ================= Deck of Cards =================
    public static String[] initDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int k = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[k++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int random = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
        }
    }

    public static void distributeCards(String[] deck, int players, int cards) {
        if (players * cards > deck.length) {
            System.out.println("Not enough cards!");
            return;
        }
        for (int i = 0; i < players; i++) {
            System.out.println("Player " + (i + 1) + ": ");
            for (int j = 0; j < cards; j++) {
                System.out.println("  " + deck[i * cards + j]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}

