public class NandDouble1346 {
    public static boolean checkIfExist(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length; j++) {
                if (i!=j && arr[i] == 2*arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[]args) {
        int[] arr = {2, 3};
        System.out.println(checkIfExist(arr));
    }
}
