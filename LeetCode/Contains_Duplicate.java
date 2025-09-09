public class Contains_Duplicate {// 1. Contains Duplicate
    public static boolean containsDuplicate(int[] nums) {
        java.util.Set<Integer> set = new java.util.HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        System.out.println("Contains Duplicate: " + containsDuplicate(nums1));
    }
}
