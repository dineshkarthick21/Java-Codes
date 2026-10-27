import java.util.*;
public class BinaryToDeci {



        public static void main(String args[])
        {
            Scanner scan = new Scanner(System.in);
            String n =scan.nextLine();
            String str =n;
            for(char c :str.toCharArray())
            {
                if(Character.isDigit(c)) {

                   int temp = c-'0';
                    if (temp == 0 ||temp==1) {
                        continue;
                    }
                    else {
                        System.out.print("InvAlid Input.");
                        return;
                    }
                }
                else
                {
                    System.out.print("InvAlid Input.");
                    return;
                }
            }

            int g =Integer.parseInt(n);

            int count =0;

            for(int i=0;i<str.length();i++)
            {


                count++;
            }

            int sum =0;
            int snt =count-1;
            int index =0;
            while(g!=0)
            {
                int digi = g%10;
                int rum =(int)Math.pow(2,index);
                sum+=(digi*rum);
                g=g/10;
                if(index<=snt)
                {
                    index++;
                }

            }
            System.out.print(sum);
        }
    }

