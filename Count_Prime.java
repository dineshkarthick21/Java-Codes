import java.util.*;

public class Count_Prime {

    public static boolean isPrime(int a)
    {
        if(a<2)
        {
            return true;
        }
        else {
            for(int i=2;i<=Math.sqrt(a);i++)
            {
                if(a%i==0)
                {
                    return true;
                }
            }
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner scan  = new Scanner(System.in);
        int n=scan.nextInt();
        int i=0;
        int cnt =0;
        while(i<=n)
        {
            if(!isPrime(i))
            {
                cnt++;
            }
            i++;
        }



        System.out.print(cnt);
    }
}
