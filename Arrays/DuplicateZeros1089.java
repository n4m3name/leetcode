import java.util.*;

public class DuplicateZeros1089 {
    public static int[] duplicateZeros(int[] arr) {
        int i = 0;
        while (i<arr.length) {
            if (arr[i] == 0) {
                int c = arr.length-1;
                while (c > i) {
                    arr[c] = arr[c-1];
                    c--;
                }
                arr[c] = 0;
                i++;
            }
            i++;
        }
        return arr;
    }
    
    public static void main(String[]args) {
        int[] arr = {1, 2, 3, 0, 5, 0, 6};
        int[] arrr = duplicateZeros(arr);
        System.out.println(Arrays.toString(arrr));
    }
}
