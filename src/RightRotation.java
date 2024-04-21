import java.util.Arrays;

public class RightRotation {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7};
        int d=3;
        int n = arr.length;

        reverse(arr,0, n -d-1);
        System.out.println(Arrays.toString(arr));
        reverse(arr, n -d, n -1 );
        System.out.println(Arrays.toString(arr));
        reverse(arr,0, n -1);
        System.out.println(Arrays.toString(arr));
    }
    public  static void reverse(int []arr,int start ,int end ) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
