public class Fizz_Wuzz {
    // 8. Fizz Buzz
    public static java.util.List<String> fizzBuzz(int n) {
        java.util.List<String> result = new java.util.ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) result.add("FizzBuzz");
            else if (i % 3 == 0) result.add("Fizz");
            else if (i % 5 == 0) result.add("Buzz");
            else result.add(String.valueOf(i));
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("FizzBuzz (15): " + fizzBuzz(15));
    }
}
