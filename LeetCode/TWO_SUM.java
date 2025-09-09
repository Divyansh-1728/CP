public class TWO_SUM { // 7. Two Sum
    public static int[] twoSum(int[] nums, int target) {
        java.util.Map<Integer, Integer> map = new java.util.HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr5 = {2, 7, 11, 15};
        int[] res = twoSum(arr5, 9);
        System.out.println("Two Sum: [" + res[0] + ", " + res[1] + "]");
    }
}
