    import java.util.*;
    public class Problem_assesment {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String idInput = scanner.nextLine();
            String[] str = idInput.split(" ");

            int arr[] =new int[str.length];
            for(int k=0;k<str.length;k++)
            {
                arr[k]=scanner.nextInt();
            }

            boolean valid =true;

            for(int i=0;i<arr.length;i++)
            {
                int cnt =0;
                valid=false;
                int index=0;

                for(int j=0;j<arr.length;j++)
                {
                    if(arr[j]>cnt)
                    {

                        valid =true;
                        cnt =arr[j];
                        index=j;

                    }
                }

                if(valid)
                {

                    String temp =String.valueOf(cnt);

                    if(i!=arr.length-1) {
                        System.out.print(str[index] + ":" + temp + ", ");
                        arr[index] = 0;
                    }
                    else
                    {
                        System.out.print(str[index]+":"+temp);
                    }

                }

                    arr[index]=0;
                }





        }
    }

