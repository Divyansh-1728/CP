public class power_of_two {
    // 9. Power of Two
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println("Is Power of Two (16): " + isPowerOfTwo(16));
    }
}
