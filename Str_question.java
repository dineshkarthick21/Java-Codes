import java.util.*;
import java.util.ArrayList;
public class Str_question {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        boolean not =true;
        List<String> lt = new ArrayList<>();
        while(not)
        {
            String s =scan.nextLine();
            if(!s.equals("exit")) {
                lt.add(s);
            }
            else {
                not = false;
            }
        }

        int tot =0;
        for(int i=0;i<lt.size();i++)
        {
            String  tmp =lt.get(i);
            for(char c:tmp.toCharArray())
            {
                if(Character.isDigit(c))
                {
                    int y =c-'0';
                    if(y>tot)
                    {
                        tot=y;
                    }
                }
            }
        }

        for(int j=1;j<=tot;j++)
        {
            String h ="";
            int count =0;
            for(int k=0;k<lt.size();k++)
            {
                String m2=String.valueOf(j);
                String m1 =lt.get(k);
                if(m1.contains(m2))
                {
                    h=m1;
                    count++;
                }
            }

            System.out.println(h+" "+count);
        }
    }
}
