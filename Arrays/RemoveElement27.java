public class RemoveElement27 {
    public static int removeElement(int[] nums, int val) {
        int c = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != val) {
                int temp = nums[c];
                nums[c] = nums[i];
                nums[i] = temp;
                c++;
            }
        }
        return c;
    }

    public static void main(String[]args) {
        int[] a = {1, 2, 3, 3, 4, 3, 5};
        System.out.println(removeElement(a, 3));
    }
}