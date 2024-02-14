import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int [][] nums ={
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        int target = 10;
        int[] output = search(nums, target);
        System.out.println(Arrays.toString(output));
            }
    static int [] search(int[][]nums , int target){
        for(int r=0;r<nums.length;r++){
            for(int c=0;c < nums[r].length;c++){
                if (nums[r][c] == target){
                    return new int[]{r,c};
                }
            }
        }
        return  new int[]{-1,-1};

    }

    }
