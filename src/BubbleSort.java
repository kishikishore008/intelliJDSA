import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4};
        System.out.println("Original Array: " + Arrays.toString(arr));

        sort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
    }
}
