import java.util.*;
public class fruit_basket {
    public static void main(String args[])
    {
        int fruit[] = {3,6,1};
        int baskets[] = {6,4,7};

        int snt=0;

        for(int i=0;i<fruit.length;i++)
        {
           boolean valid= false;
            for(int j=0;j<baskets.length;j++)
            {
                if(fruit[i]<=baskets[j])
                {
                    baskets[j]=0;
                    valid =true;
                    break;
                }
            }
            if(valid==false)
            {
                snt++;
            }
        }
        System.out.print(snt);
    }
}
