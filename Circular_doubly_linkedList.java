import java.util.*;

public class Circular_doubly_linkedList {
    Node head,last;
    class Node
    {
        int data;
        Node next,prev;

        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }


    public void insertAtBegin(int data)
    {
        Node newNode = new Node(data);
        Node temp=head;
        if(head==null)
        {
            head=last=newNode;
            head.next=head;
            head.prev=head;
        }
            else {
                newNode.next=head;
                newNode.prev=last;
                head.prev=newNode;
                last.next=newNode;
                head=newNode;

            }

    }

    public void insertAtPosition(int data,int index)
    {
        Node newNode = new Node(data);
        Node temp =head;
        if(index==0)
        {
            insertAtBegin(data);
        }
        else if(index==length())
        {
            insertAtLast(data);
        }
        else {

               if(index<length())
               {
                   for (int i = 1; i < index - 1; i++) {
                           temp=temp.next;
                   }
                   Node ms=temp.next;
                   temp.next=newNode;
                   newNode.prev=temp;
                   newNode.next=ms;
                   ms.prev=newNode;
               }
               else {
                   System.out.print("Cannot insert the position!!!!");
               }

        }
    }

    public void insertAtLast(int data)
    {
        Node newNode = new Node(data);



        last.next=newNode;
        newNode.prev =last;
        newNode.next =head;
        head.prev =newNode;
        last =newNode;


    }

    public void deleteAtFirst()
    {
        Node ms=head.next;
        last.next=ms;
        ms.prev=last;
        head.next=null;
        head.prev=null;
        head=ms;
    }

    public void deleteAtIndex(int index)
    {
        Node temp=head;

        if(index==1)
        {
            deleteAtFirst();
        }
        else if(index==length())
        {
            deleteAtLast();
        }
        else {
            if(index<length())
            {
                for(int i=1;i<index-1;i++)
                {
                    temp=temp.next;
                }
                temp.next=temp.next.next;
                temp.next.prev=temp;
            }
            else {
                System.out.println("Cannot delete at the index!!!!");
            }
        }
    }

    public void deleteAtLast()
    {
        Node ms =last.prev;
        ms.next=head;
        head.prev =ms;
        last.prev=null;
        last=ms;
    }


    public int length()
    {
        Node temp=head;
        int count =0;
        while(temp.next!=head)
        {
            count++;
            temp=temp.next;
        }
        return count+1;
    }


    public void display()
    {
        Node temp =head;
        while(temp.next!=head)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;

        }
        System.out.print(temp.data+"->");
        System.out.print("connecting circularly with head and prev!!...");
    }

    public static void main(String args[])
    {
        Circular_doubly_linkedList cdl = new Circular_doubly_linkedList();
        cdl.insertAtBegin(10);
        cdl.insertAtBegin(20);
        cdl.insertAtBegin(30);
        cdl.insertAtBegin(40);
        cdl.insertAtLast(100);
        cdl.insertAtLast(200);
        cdl.insertAtBegin(100000);
        cdl.insertAtPosition(20,2);
        cdl.insertAtPosition(100,3);
        cdl.deleteAtIndex(2);
        cdl.deleteAtIndex(2);
        cdl.insertAtPosition(1234,2);


        cdl.display();
    }

}
