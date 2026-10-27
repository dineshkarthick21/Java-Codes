import java.util.*;

public class distinct_elements {

    public static void main(String args[])
    {
        int arr[] = {1,2,1,3,4,2,3};
        int n=arr.length;
        int k=4;
        int snt=0;
        int fin[] =new int[k];
        int tp = 0;

        for(int i=0;i<n-k+1;i++)
        {
            Set<Integer> set = new HashSet<>();
            for(int j=i;j<i+k;j++) {

                   set.add(arr[j]);
            }

            int sze = set.size();
            fin[snt++] = sze;



        }
        for(int a:fin)
        {
            System.out.print(a+" ");
        }



    }
}
