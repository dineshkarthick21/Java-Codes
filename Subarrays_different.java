import java.util.*;

public class Subarrays_different {

    public static void main(String args[])
    {
        int fst =0;
        int lst=0;
        int arr[] = {10,13,15,17,19};
        int n=arr.length;
        int tgt =38;
        emc:
        for(int i=0;i<n-1;i++)
        {

            for(int j=0;j<n;j++)
            {
                int count=0;
                for(int k=i;k<=j;k++)
                {
                    count+=arr[k];
                }

                if(count==tgt)
                {
                    fst =i;
                    lst=j;
                    break emc;
                }
            }
        }

        for(int f=fst;f<=lst;f++)
        {
            System.out.print(arr[f]+" ");
        }
    }
}
