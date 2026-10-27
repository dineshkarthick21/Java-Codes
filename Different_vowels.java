import java.util.*;
public class Different_vowels {


    public class Main
    {

        public static boolean isVowel(char c)
        {
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                return true;
            }
            else
            {

                return false;
            }
        }
        public static void main(String args[])
        {
            String str1 ="hello";
            char[] str =str1.toCharArray();

            int left =0;
            int  right =str1.length()-1;

            while(left<=right)
            {
                boolean s1 =isVowel(str[left]);
                boolean s2 =isVowel(str[right]);

                if(s1&&s2)
                {
                    char temp=str[left];
                    str[left]=str[right];
                    str[right] =temp;
                    right--;
                    left++;
                }
                else if(s1==true)
                {
                    right--;
                }
                else
                {
                    left++;
                }

            }
            System.out.print(str);


        }
    }
}
