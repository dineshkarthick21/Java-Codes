import java.util.*;

public class LinkedHashSet {
    public static void main(String args[])
    {
        Set<String> set = new java.util.LinkedHashSet<>();

        set.add("dinesh");
        set.add("elhil");
        set.add("dinesh");
        set.remove("elhil");

        System.out.println(set.isEmpty());
        System.out.println(set.size());

        Iterator it = set.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }

        set.clear();
        System.out.println(set.isEmpty());
    }
}
