import java.util.*;
import java.util.HashSet;


public class HashSeting {

    public static void main(String args[])
    {
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        Iterator it= set.iterator();
        System.out.print(set.contains(100));


        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        set.clear();
        System.out.print(set.isEmpty());
        System.out.print(set.size());

    }
}
