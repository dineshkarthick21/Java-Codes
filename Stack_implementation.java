import java.util.*;

public class Stack_implementation {

    int top =-1;
    int stack[] = new int[5];

    void push(int data)
    {
        if(top==4)
        {
            System.out.print("Stack is full >>> not to be pushed!!!");
        }
        else {
            top++;
            stack[top]=data;
        }
    }

    void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty >>> not to be poped!!!");
        }
        else {
            top--;
        }
    }

    void peek()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty >>> not to be get the peek value");
        }
        else {
            System.out.println("value is : "+stack[top]);
        }
    }
    boolean isEmpty()
    {
        return top==-1;
    }
    boolean isFull()
    {
        return top==4;
    }


    void display()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty >>> not to be display!!!");

        }
        else {
            System.out.println("stack is : ");
            for(int i=0;i<=top;i++)
            {
               System.out.print(stack[i]);
            }
            System.out.println();
        }
    }


    public static void main(String args[])
    {
        Stack_implementation stack = new Stack_implementation();
        stack.push(100);
        stack.pop();
        stack.push(100);
        stack.push(200);
        stack.peek();

    }
}
