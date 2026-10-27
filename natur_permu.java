import java.util.*;
public class natur_permu {

    public static void natNum(int n)
    {
        //Base case
        if(n==1)
        {
            System.out.print(n);
        }
        //recursive case
        else {
            System.out.print(n+" ");
            natNum(n-1);
        }
    }
    public static void main(String args[])
    {
        int n=10;
        natNum(n);
    }
}
