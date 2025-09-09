public class Remove_Element {
    // 2. Remove Element
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {

        int[] arr2 = {3, 2, 2, 3};
        System.out.println("Remove Element: " + removeElement(arr2, 3));
    }
}

