
import java.util.*;

public class stack_LinkedList_Implemenentataion {


    Node head;
    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public int size()
    {
        Node temp =head;
        if(temp!=null) {
            int count = 0;
            while (temp.next != null) {
                count++;
                temp = temp.next;
            }
            return count + 1;
        }
        return -1;
    }

    void push(int data)
    {
        Node newNode = new Node(data);
        Node temp =head;
        if(head==null)
        {
            head=newNode;
        }
        else {

            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }

    }

    void pop()
    {
        Node temp =head;
        if(size()==0)
        {
            System.out.print("Could not poped");
        }
        else {
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;
        }

    }

    void peek()
    {

        if(size()==0)
        {
            System.out.print("stack is empty");
        }
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            System.out.print("stack peek is : "+temp.data);
        }
    }

    void display()
    {
        Node temp = head;
        if(size()==0)
        {
            System.out.print("stack is empty");
        }
        else {
            while(temp.next!=null)
            {
                System.out.print(temp.data+"<-");
                temp=temp.next;
            }
            System.out.print(temp.data);
            //System.out.print("null stack in reverse order!!!");


        }
    }

    boolean isEmpty()
    {
        return size()>0;
    }

    public static void main(String args[])
    {
        stack_LinkedList_Implemenentataion stack = new stack_LinkedList_Implemenentataion();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        //System.out.println(stack.size());
        stack.peek();
    }

}
