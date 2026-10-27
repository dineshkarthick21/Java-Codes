import java.util.*;
public class Queue_imple_LinkedList {

    Node front,rear;
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


    void enque(int data)
    {
        Node newNode = new Node(data);

        if(front==null)
        {
            front=rear=newNode;
        }
        else {

            rear.next=newNode;
            rear = newNode;
        }

    }

    void deque()
    {
        if(front==null)
        {
           System.out.print("queue is empty!!");
        }
        else {
            front = front.next;
        }

    }

    void getFront()
    {

        if(front==null)
        {
            System.out.println("queue is empty!!");
        }
        else {
            System.out.println("front is : "+front.data);
        }

    }

    void getRear()
    {

        if(front==null)
        {
            System.out.println("queue is empty!!");
        }
        else {
            System.out.println("rear is : "+rear.data);
        }

    }
    void isEmpty()
    {
        if(front==null)
        {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }

    void Size()
    {
        Node temp =front;
        int count=0;
        while(temp.next!=null)
        {
            count++;
            temp=temp.next;
        }
        int len =count+1;
        System.out.println("queue size is : "+len);
    }

    void display()
    {
        Node temp =front;
        while(temp.next!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print(temp.data);

    }

    public static void main(String args[])
    {
        Queue_imple_LinkedList queue = new Queue_imple_LinkedList();
        queue.enque(10);
        queue.enque(20);
        queue.enque(30);
        queue.enque(500);
        queue.Size();
        queue.display();
    }
}
