import java.util.*;
public class Doub_prgm {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int d=scan.nextInt();
        int n=scan.nextInt();

        double dob[] = new double[n];

        for(int i=0;i<n;i++)
        {
            double gok =(double)1/(a+(i)*d);
            dob[i]=gok;

        }

        for(int j=0;j<n;j++)
        {
            if(j==n-1)
            {
                System.out.printf("%.2f",dob[j]);
                return;
            }
            System.out.printf("%.2f, ",dob[j]);
        }

    }
}
