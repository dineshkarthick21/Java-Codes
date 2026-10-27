import java.util.*;
public class String_prblm
    {
        public static void main(String args[])
        {
            Scanner scan = new Scanner(System.in);
            String str =scan.nextLine();
            int n=str.length();
            int len =n;
            String fin ="";
            String fin2="";
            StringBuilder s = new StringBuilder();
            while(len>=1)
            {
                for(int i=0;i<n;i++)
                {
                    int count=0;
                    for(int j=0;j<n;j++)
                    {
                        if(str.charAt(i)==str.charAt(j))
                        {
                            count++;
                        }
                    }
                    if(count==len)
                    {
                        char tem =str.charAt(i);
                        String temp =String.valueOf(tem);
                        if(!fin.contains(temp))
                        {
                            if(count==1) {
                                fin2+=temp;
                            }
                            else
                            {
                                for (int y = 1; y <= len; y++)
                                {
                                    fin += temp;
                                }
                            }
                        }
                    }
                    if(i==n-1)
                    {
                        len--;
                    }
                }
            }
            s.append(fin);
            char[] cr = new char[fin2.length()];
            for(int m=0;m<fin2.length();m++)
            {
                cr[m] =fin2.charAt(m);
            }
            Arrays.sort(cr);
            s.append(cr);
            System.out.print(s.toString());
        }
    }

