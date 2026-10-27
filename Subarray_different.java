import java.util.*;
public class Subarray_different {


        public static void main(String args[])
        {
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            int min = scan.nextInt();
            int max = scan.nextInt();
            String str[] = s.split(" ");
            int arr[] = new int [str.length];

            for(int i=0;i<str.length;i++)
            {
                int temp = Integer.parseInt(str[i]);
                arr[i]=temp;
            }

            int sum =0;
            for(int i=0;i<arr.length;i++)
            {
                int dummy =0;
                int temp =0;
                for(int j=i+1;j<arr.length;j++)
                {
                    temp+=arr[j];
                    dummy++;

                }

                if(temp>sum && (dummy<=max && dummy>=min))
                {
                    sum=temp;
                }
            }

            System.out.print(sum);
        }
    }

