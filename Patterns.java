import java.util.*;
public class Patterns {


        public static void main(String args[])
        {
            Scanner scan = new Scanner(System.in);
            int n=scan.nextInt();


            for(int i=n;i>0;i--)
            {
                for(int j=i;j<=n;j++)
                {
                    System.out.print(j);
                }
                if(i!=n)
                {
                    for(int k=n-1;k>=i;k--)
                    {
                        System.out.print(k);
                    }
                }
                System.out.println();
            }
            for(int x=1;x<=n;x++)
            {
                for(int y=x+1;y<=n;y++)
                {
                    System.out.print(y);
                }
                for(int z=n-x;z>0;z--)
                {
                    System.out.print(z);
                }
                System.out.println();

            }

        }
    }

