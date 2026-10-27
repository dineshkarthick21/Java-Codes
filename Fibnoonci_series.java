import java.util.*;
public class Fibnoonci_series {
    public static void main(String args[])
    {
        int n=15;

        int newItem =0;
        int a=0;
        int b=1;
        for(int i=2;i<n;i++)
        {
            newItem=a+b;
            a=b;
            b=newItem;
            System.out.print(newItem+" ");
        }
    }
}
