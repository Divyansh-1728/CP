public class Implement_strStr {
    // 3. Implement strStr()
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
            String haystack = "hello", needle = "ll";
            System.out.println("strStr('hello','ll'): " + strStr(haystack, needle));
    }
}
