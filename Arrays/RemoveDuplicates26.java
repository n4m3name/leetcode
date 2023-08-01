import java.util.*;


public class RemoveDuplicates26 {
    public static int[] removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i == 0 || n > nums[i-1]) //Updates if next number bigger else leaves the same
                nums[i++] = n; //evaluates i THEN increments
        return nums;
    }

    public static void main(String[]args) {
        int[] arr = {1, 2, 3, 3, 4, 5, 5, 5, 6};
        //System.out.println(removeDuplicates(arr));
        int[] a = removeDuplicates(arr);
        System.out.println(Arrays.toString(a));
    }
}
    
