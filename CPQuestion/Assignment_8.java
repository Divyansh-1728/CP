import java.util.*;
public class Assignment_8 {

    public class StringProblems {

        // 1. Count Vowels and Consonants
        public static void countVowelsAndConsonants(String str) {
            str = str.toLowerCase();
            int vowels = 0, consonants = 0;
            for (char ch : str.toCharArray()) {
                if (Character.isLetter(ch)) {
                    if ("aeiou".indexOf(ch) != -1)
                        vowels++;
                    else
                        consonants++;
                }
            }
            System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
        }

        // 2. Reverse a String
        public static String reverseString(String str) {
            char[] arr = str.toCharArray();
            String rev = "";
            for (int i = arr.length - 1; i >= 0; i--) {
                rev += arr[i];
            }
            return rev;
        }

        // 3. Palindrome String Check
        public static boolean isPalindrome(String str) {
            String rev = reverseString(str);
            return str.equalsIgnoreCase(rev);
        }

        // 4. Remove Duplicates from a String
        public static String removeDuplicates(String str) {
            StringBuilder sb = new StringBuilder();
            HashSet<Character> seen = new HashSet<>();
            for (char ch : str.toCharArray()) {
                if (!seen.contains(ch)) {
                    sb.append(ch);
                    seen.add(ch);
                }
            }
            return sb.toString();
        }

        // 5. Find the Longest Word in a Sentence
        public static String longestWord(String sentence) {
            String[] words = sentence.split(" ");
            String longest = "";
            for (String word : words) {
                if (word.length() > longest.length())
                    longest = word;
            }
            return longest;
        }

        // 6. Find Substring Occurrences
        public static int countSubstring(String str, String sub) {
            int count = 0;
            int idx = str.indexOf(sub);
            while (idx != -1) {
                count++;
                idx = str.indexOf(sub, idx + 1);
            }
            return count;
        }

        // 7. Toggle Case of Characters
        public static String toggleCase(String str) {
            StringBuilder sb = new StringBuilder();
            for (char ch : str.toCharArray()) {
                if (Character.isUpperCase(ch))
                    sb.append(Character.toLowerCase(ch));
                else if (Character.isLowerCase(ch))
                    sb.append(Character.toUpperCase(ch));
                else
                    sb.append(ch);
            }
            return sb.toString();
        }

        // 8. Compare Two Strings (lexicographically)
        public static void compareStrings(String s1, String s2) {
            int len = Math.min(s1.length(), s2.length());
            for (int i = 0; i < len; i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    if (s1.charAt(i) < s2.charAt(i))
                        System.out.println(s1 + " comes before " + s2);
                    else
                        System.out.println(s2 + " comes before " + s1);
                    return;
                }
            }
            if (s1.length() == s2.length())
                System.out.println("Both strings are equal.");
            else if (s1.length() < s2.length())
                System.out.println(s1 + " comes before " + s2);
            else
                System.out.println(s2 + " comes before " + s1);
        }

        // 9. Find the Most Frequent Character
        public static char mostFrequentChar(String str) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (char ch : str.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            char mostFrequent = ' ';
            int max = 0;
            for (char ch : map.keySet()) {
                if (map.get(ch) > max) {
                    max = map.get(ch);
                    mostFrequent = ch;
                }
            }
            return mostFrequent;
        }

        // 10. Remove a Specific Character from a String
        public static String removeChar(String str, char ch) {
            return str.replace(Character.toString(ch), "");
        }

        // 11. Check if two strings are anagrams
        public static boolean areAnagrams(String s1, String s2) {
            char[] arr1 = s1.replaceAll("\\s", "").toLowerCase().toCharArray();
            char[] arr2 = s2.replaceAll("\\s", "").toLowerCase().toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        }

        // 12. Replace word in sentence
        public static String replaceWord(String sentence, String oldWord, String newWord) {
            return sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
        }

        // MAIN to test
        public static void main(String[] args) {

            System.out.println("1. Count Vowels and Consonants in 'Hello World'");
            countVowelsAndConsonants("Hello World");

            System.out.println("\n2. Reverse of 'Java' = " + reverseString("Java"));

            System.out.println("\n3. Is 'madam' Palindrome? " + isPalindrome("madam"));

            System.out.println("\n4. Remove duplicates from 'programming' = " + removeDuplicates("programming"));

            System.out.println("\n5. Longest word in 'Java is powerful language' = " + longestWord("Java is powerful language"));

            System.out.println("\n6. Substring 'is' in 'This is island' = " + countSubstring("This is island", "is"));

            System.out.println("\n7. Toggle case of 'Hello World' = " + toggleCase("Hello World"));

            System.out.println("\n8. Compare 'apple' and 'banana':");
            compareStrings("apple", "banana");

            System.out.println("\n9. Most frequent char in 'success' = " + mostFrequentChar("success"));

            System.out.println("\n10. Remove 'l' from 'Hello World' = " + removeChar("Hello World", 'l'));

            System.out.println("\n11. Are 'listen' and 'silent' anagrams? " + areAnagrams("listen", "silent"));

            System.out.println("\n12. Replace 'world' with 'Java' in 'Hello world' = " + replaceWord("Hello world", "world", "Java"));
        }
    }
}
