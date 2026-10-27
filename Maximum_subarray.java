import java.util.*;
public class Maximum_subarray {
    public static void main(String args[]) {
        int nums[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        //using the kadane algorithm for the maximum subarray
        int currsum= nums[0];
        int max =nums[0];
        for (int i = 1; i < nums.length; i++) {

            currsum = Math.max(nums[i],nums[i]+currsum);
            max = Math.max(currsum,max);


        }
        System.out.print(max);
    }
}
