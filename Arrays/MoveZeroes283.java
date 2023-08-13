public class MoveZeroes283 {
    public static int[] moveZeroes(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (n != 0) {
                nums[i++] = n;
            }
        }
        while (i < nums.length) {
            nums[i++] = 0;
        }
        return nums;
    }

    public static void main(String[]args) {
        int[] nums = {1, 2, 0, 3, 0, 4, 5, 0};
        int[] numss = moveZeroes(nums);
        for (int i : nums) {
            System.out.println(i);
        }
    }
}

// Reminder: 2 pointer technique