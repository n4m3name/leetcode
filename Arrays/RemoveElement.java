import java.util.*;

public class RemoveElement {
    public static Object[] removeElement(int[] nums, int val) {
        ArrayList<Integer> nms = new ArrayList<Integer>();
        for(Integer i=0; i<nums.length; i++) {
            if(nums[i] != val) {
                nms.add(nums[i]);
            }
        }
        return nms.toArray();
    }

    public static void main(String[]args) {
        int[] a = {1, 2, 3, 2, 3, 4};
        Object[] arr = removeElement(a, 3);
        System.out.println(Arrays.toString(arr));
    }
}