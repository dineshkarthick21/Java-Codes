import java.util.*;
public class SumOfMaxSubArray {
    public static void main(String[] args) {
        int arr[]= {-2,1,-3,4,-1,2,1,-5,7};	//max=-2,1,1,4

        int dp[] = new int[arr.length];
        int max=dp[0]=arr[0];

        for(int i=1;i< arr.length;i++)
        {
            int option1 = arr[i];
            int option2 = arr[i]+dp[i-1];

            dp[i] = Math.max(option1,option2);
            max = Math.max(max,dp[i]);
        }

        System.out.println(max);
        System.out.println(Arrays.toString(dp));
    }
}
