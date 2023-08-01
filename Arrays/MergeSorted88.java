import java.util.*;

public class MergeSorted88 {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
        return nums1;
    }

    public static void main(String[]args) {
        int[] nums1 = {1, 2, 3, 4, 5, 0, 0, 0};
        int[] nums2 = {4, 5, 6};
        int[] nums = merge(nums1, 5, nums2, 3);

        System.out.println(Arrays.toString(nums));
    }
}

// to do: