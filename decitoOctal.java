import java.util.*;

public class decitoOctal {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        String sum="";
        while(n!=0)
        {
            int digit = n%8;
            sum=digit+sum;
            n=n/8;

        }
        System.out.print(sum);

    }
}
