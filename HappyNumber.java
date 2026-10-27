import java.util.*;

public class HappyNumber {

    public static int meth(int n)
    {
   int sum=0;
        while(n!=0)
        {
             int digit = n%10;
            sum += digit * digit;
            n=n/10;

        }
        return sum;
        
    }

    public static void main(String args[])
    {
        Scanner scan  = new Scanner(System.in);
        int n=scan.nextInt();
        if(n==0)
        {
            System.out.print(" Not a Happy Number!!");
            return;
        }
        Set<Integer> set = new HashSet<>();
        while(n!=1  && !set.contains(n))
        {
            set.add(n);
            n=meth(n);
        }
        if(n==1)
        {
            System.out.print("Happy Number!!");
        }
        else {
            System.out.print("Not a Happy Number!!");

        }
    }
}
