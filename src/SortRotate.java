public class SortRotate {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2,3};
    int  pivot=searchPivot(arr);
        System.out.println(pivot);
    }

    static int searchPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return arr[mid]+1;
            }
            if (arr[mid] < arr[mid - 1]) {
                return arr[mid - 1]+1;
            }
            else {
                return arr[mid+1];
            }
        }
        return -1;
    }
}