import java.util.*;
// input : swiss , output : w -> the fst non-repeating character..
public class NonRepeatChar {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = scan.next();
        for(int i=0;i<s.length();i++)
        {
            int t =0;
            for(int j=0;j<s.length()-1;j++)
            {
                if(s.charAt(i)==(s.charAt(j)))
                {
                    t++;
                }
            }

            if(t==1)
            {
                System.out.print(s.charAt(i));
                break;
            }
            else{
                t=0;
            }
        }
    }
}
