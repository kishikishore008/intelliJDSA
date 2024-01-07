public class FindMinNumber {
    public static void main(String[] args) {
     int [] arr = {18,19,28,1,25,47,69};
        System.out.println(minimum(arr));
    }
    static int minimum(int[] arr  ){
        int ans =arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
