//Check if two strings are equal (case-sensitive and case-insensitive).
//
//Convert a string to uppercase without using toUpperCase() (ASCII based).
//
//Count the number of vowels in a string.
//
//Find the length of a string without using .length().
//
//Check if a string is a palindrome.
//
//Find the first non-repeating character in a string.
//
//Count the number of words in a string (use StringTokenizer).
//
//Replace all spaces with hyphens in a string.
//
//Find the ASCII value of each character in a string.
//
//        => Next
//
//Reverse each word in a sentence (e.g., "Hello World" → "olleH dlroW").
//
//Remove duplicate characters from a string.
//
//Check if two strings are anagrams.
//
//Remove all digits from a string.
//
//Capitalize the first letter of each word in a sentence.
//
//Check if a string contains only digits.
//
//Compress a string like "aaabbcc" → "a3b2c2" using StringBuilder.
//
//Toggle the case of each character in a string.
//
//Find the longest word in a sentence.
//
//Count frequency of each character in a string.
//
//        => Next
//
//Implement your own split() method (without using built-in split() or StringTokenizer).
//
//Check if a string contains a substring without using contains() or indexOf().
//
//Write a custom method to compare two strings without using .equals().
//
//Group words with the same set of characters (e.g., "listen" and "silent").
//
//Find the longest common prefix in an array of strings.
//
//Find all permutations of a string.
//
//Check if a string is a valid shuffle of two other strings.
//
//Implement your own replace() function.
//
//Detect and remove consecutive duplicate characters (e.g., "aabbcc" → "abc").
//
//Implement a simple regex matcher for patterns like a*b, a?b, etc. (basic only).

//import java.util.*;
//public class CPlab {
//    public static void main(String[]args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter first string: ");
//        String s1 = sc.nextLine();
//        System.out.print("Enter second string: ");
//        String s2 = sc.nextLine();
//
//        System.out.println("Case-sensitive: " + s1.equals(s2));
//        System.out.println("Case-insensitive: " + s1.equalsIgnoreCase(s2));
//    }

//    public static void main(String[]args){
//    Scanner sc=new Scanner(System.in);
//    System.out.print("Enter you string - ");
//    String str=sc.nextLine();
//    StringBuilder sb = new StringBuilder();
//        for (char c : str.toCharArray()) {
//        if (c >= 'a' && c <= 'z')
//            sb.append((char) (c - 32));
//        else
//            sb.append(c);
//    }
//        System.out.println("Uppercase: " + sb);
//    }        String str = sc.nextLine().toLowerCase();
//        int count = 0;
//        for (char c : str.toCharArray()) {
//            if ("aeiou".indexOf(c) != -1) count++;
//        }
//        System.out.println("Number of vowels: " + count);
//    }

//    public static void main(String[]args) {
//        Scanner sc =new Scanner(System.in);
//        String str = sc.nextLine().toLowerCase();
//        int count = 0;
//        for (char c : str.toCharArray()) {
//            if ("aeiou".indexOf(c) != -1) count++;
//        }
//        System.out.println("Number of vowels: " + count);
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter string: ");
//        String str = sc.nextLine();
//        int length = 0;
//        for (char c : str.toCharArray()) length++;
//        System.out.println("Length: " + length);


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter string: ");
//        String str = sc.nextLine();
//        String rev = new StringBuilder(str).reverse().toString();
//        System.out.println("Palindrome: " + str.equals(rev));
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter string: ");
//        String str = sc.nextLine();
//        for (char c : str.toCharArray()) {
//            if (str.indexOf(c) == str.lastIndexOf(c)) {
//                System.out.println("First non-repeating char: " + c);
//                return;
//            }
//        }
//        System.out.println("No non-repeating character found.");

//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter sentence: ");
//        String str = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(str);
//        System.out.println("Word count: " + st.countTokens());
//    }

//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter string: ");
//        String str = sc.nextLine();
//        System.out.println("Result: " + str.replace(" ", "-"));
//    }
//        System.out.println("Enter a sentence:");
//        String sentence = sc.nextLine();
//
//        String result = reverseEachWord(sentence);
//        System.out.println("Reversed Words: " + result);
//        }
//    static String reverseEachWord(String s) {
//        String[] words = s.split(" ");
//        StringBuilder result = new StringBuilder();
//        for (String w : words) {
//            result.append(new StringBuilder(w).reverse()).append(" ");
//        }
//        return result.toString();
//    }
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string (for removing duplicates):");
//        String str1 = sc.nextLine();
//        System.out.println("After Removing Duplicates: " + removeDuplicates(str1));
//        static String removeDuplicates (String s){
//            StringBuilder sb = new StringBuilder();
//            HashSet<Character> set = new HashSet<>();
//            for (char c : s.toCharArray()) {
//                if (!set.contains(c)) {
//                    set.add(c);
//                    sb.append(c);
//                }
//            }
//            return sb.toString();
//        }
//}
