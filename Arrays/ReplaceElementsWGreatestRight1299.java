public class ReplaceElementsWGreatestRight1299 {
    public static int[] replaceElements(int[] arr) {
        int max = -1, hold;
        for (int i=arr.length-1; i>=0; i--) {
            hold = arr[i];
            arr[i] = max;
            if (hold > max) {
                max = hold;
            }
        }
        return arr;
    }

    public static void main(String[]args) {
        int[] arr = {18, 34, 56, 35, 87, 56, 27, 64, 32};
        replaceElements(arr);
        System.out.print("[");
        for(int i: arr){
            System.out.print(i + ",");
        }
        System.out.println("]");
    }
}
