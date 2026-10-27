import java.util.*;
import java.util.ArrayList;
public class lexo_str {



        public static void main(String args[])
        {
            Scanner scan = new Scanner(System.in);
            String s =scan.nextLine();


            char ch[] = new char[26];
            int snt=0;
            for(char i ='a';i<='z';i++)
            {
                ch[snt++] = i;
            }



            int t=0;
            int h=0;

            List<String> list = new ArrayList<>();
            while(t<26)
            {
                for(int j=0;j<s.length();j++)
                {
                    String temp =String.valueOf(ch[t]);
                    boolean hh =false;

                    if(ch[t]==s.charAt(j))
                    {

                        String y="";

                        for(int k=j;k<s.length();k++)
                        {
                            y+=s.charAt(k);
                            if(!list.contains(y))
                            {
                                list.add(y);
                            }


                        }
                    }
                }

                t++;

            }

            System.out.println(list);
            System.out.println(list.get(list.size()-1));

        }
    }

