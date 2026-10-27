import java.util.*;
public class Kit_perf_sqre {

        public static void main(String args[])
        {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();

            for(int i=1;i<n;i++)
            {
                int temp =i*i;
                if(temp==n)
                {
                    System.out.print(true);
                    return;
                }
            }

            System.out.print(false);


        }
    }


