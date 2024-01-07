public class SearchInRange {
    public static void main(String[] args) {
       int [] arr = { 18,12,-7,8,56,46,28,25};
       int target = 8;
        System.out.println(range(arr,target,2,6));
    }
    static int range(int[] arr, int target ,int start, int end ){
        if(arr.length == 0){
            return -1;
        }
        for(int i=start;start<=end;i++){
            int element = arr[i];
            if(element==target){
                return i;

            }
          return -1;
        }
        return -1;
    }
}
