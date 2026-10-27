import java.util.*;
public class DeciToBinary {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        String sum ="";
        while(n!=0)
        {
            int digi =n%2;
            sum = digi+sum;
            n=n/2;

        }
        System.out.print(sum);
    }
}
