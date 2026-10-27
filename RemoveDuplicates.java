import java.util.*;
import java.util.LinkedHashSet;
public class RemoveDuplicates {
    public static void main(String args[])
    {
        Set<String> set = new LinkedHashSet<>();
        String[] str ={"apple","banana","apple","orange","banana"};

        for(String s:str)
        {
            set.add(s);
        }

        Iterator it = set.iterator();

        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
    }
}
