import java.util.*;
public class Sorting
{
    public static void main(String args[])
    {
        int arr[] = {100,200,0,3,2,4};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
//        for(int a:arr)
//        {
//            System.out.print(a+" ");
//        }

        Stack<Integer> stack = new Stack<>();

        for(int  k=0;k<arr.length;k++)
        {
            if(!stack.isEmpty())
            {
               

            }
            else {
                stack.push(arr[k]);
            }
        }
        System.out.print(stack.size());
    }
}