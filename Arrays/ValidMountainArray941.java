public class ValidMountainArray941 {
    public static boolean validMountainArray(int[] arr) {
        int n = arr.length, i = 0, j = n-1;
        while (i + 1 < n && arr[i] < arr[i+1]) i++;
        while (j > 0 && arr[j-1] > arr[j]) j--;
        return i > 0 && i == j && j < n - 1;
    }

    public static void main(String[]args) {
        int[] arr = {0, 2, 4, 5, 6, 4, 3, 2};
        int[] arrr = {0, 2, 4, 6, 5, 6, 4, 3};
        System.out.println(validMountainArray(arr));
        System.out.println(validMountainArray(arrr));
    }
}

// Two people climb mountain from either side. If climbing the same mountain, will meet at peak

