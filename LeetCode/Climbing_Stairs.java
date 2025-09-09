public class Climbing_Stairs {
    // 5. Climbing Stairs
    public static int climbStairs(int n) {
        if (n <= 2) return n;
        int first = 1, second = 2, result = 0;
        for (int i = 3; i <= n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println("Climb Stairs (5): " + climbStairs(5));
    }
}
