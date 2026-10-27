import java.util.*;
public class fact_recursion {
    static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String args[])
    {
        int n=12;
        System.out.print(factorial(n));
    }
}
