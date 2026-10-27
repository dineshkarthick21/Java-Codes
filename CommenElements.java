import java.util.*;

public class CommenElements {

    public static void main(String args[])
    {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        int arr[] = {1,2,4,5,6};

        for(int a:arr)
        {
            set.add(a);
        }

        int arr2[] = {2,3,5,7};

        for(int b:arr2)
        {
            if(set.contains(b))
            {
                set1.add(b);
            }
        }

        Iterator it =set1.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }

    }
}
