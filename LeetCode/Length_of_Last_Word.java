public class Length_of_Last_Word {
    // 4. Length of Last Word
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int lastSpace = s.lastIndexOf(" ");
        return s.length() - lastSpace - 1;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println("Length of Last Word: " + lengthOfLastWord(s));
    }
}
