import java.util.*;
import java.util.ArrayList;

public class Pascel_triangle {
    public static void main(String args[])
    {
        int n =12;

        List<List<Integer>> list = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
               row.add(1);
                }
                else {
                    List<Integer> prev = list.get(i-1);
                    row.add(prev.get(j)+prev.get(j-1));
                }
            }

            list.add(row);
        }

        for(List<Integer> li :list)
        {
            for(int a :li)
            {
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
