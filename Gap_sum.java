import java.util.*;

public class Gap_sum {
    public static void main(String args[])
    {
        int gap = 3;
        int arr[] = {1,2,3,4,5,6,7,8,9};

        for(int i=0;i<gap;i++)
        {
            int sum =0;
            for(int j=i;j<arr.length;j=j+(gap))
            {
                sum+=arr[j];
            }
            System.out.print(sum+" ");
        }


    }
}
