public class SortingArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        boolean sorted = isSorted(arr);
        System.out.println(sorted);

    }

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i - 1]) {

            } else {
                return false;
            }
        }
        return true;
    }
}
