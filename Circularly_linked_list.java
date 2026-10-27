import java.util.*;

public class Circularly_linked_list {
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

public int length()
{
    Node temp = head;
    int count =0;
    while(temp.next!=head)
    {
        count++;
        temp=temp.next;
    }
    return count+1;
}

public boolean search(int data)
{
    Node temp =head;
    while(temp.next!=head)
    {
        if(temp.data==data)
        {
            return true;
        }
        temp=temp.next;
    }
    if(temp.data==data)
    {
        return true;
    }
    return false;
}


public void insertAtBegin(int data)
{
    Node newNode = new Node(data);
    Node temp = head;

    if(head==null)
    {
        head =newNode;
        newNode.next=head;
    }
    else
    {
        while(temp.next!=head)
        {
            temp=temp.next;
        }
        newNode.next=head;
        temp.next=newNode;
        head=newNode;

    }
}

public void insertAtPosition(int data,int index)
{
    Node temp = head;
    Node newNode= new Node(data);
    int len =length();
    if(data==1)
    {
        insertAtBegin(data);
    }
    else if(len==index)
    {
        insertAtEnd(data);
    }
    else {

        if(index<len)
        {
            for(int i=1;i<index-1;i++)
            {
                temp=temp.next;
            }

            Node ms=temp.next;
            temp.next=newNode;
            newNode.next=ms;
        }
        else {
            System.out.println("Not beee added the position!!!..");
        }

    }
}

public void insertAtEnd(int data)
{
    Node temp=head;
    Node newNode = new Node(data);


    while(temp.next!=head)
    {
        temp=temp.next;
    }

    temp.next=newNode;
    newNode.next=head;

}

public void deleteAtBegin()
{
    head =head.next;
    deleteAtLast();
}



public void deleteAtIndex(int index)
{
    Node temp = head;
    if(index==1)
    {
        deleteAtBegin();
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
        }
        else {
            System.out.println("Not be deleted the index!!!..");
        }
    }
}
public void deleteAtLast()
{
    Node temp=head;
    while(temp.next.next!=head)
    {
        temp=temp.next;
    }

    temp.next=head;
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
    System.out.print("cycle connected with head node");
}




    public static void main(String args[])
    {
        Circularly_linked_list cr = new Circularly_linked_list();
        cr.insertAtBegin(20);
        cr.insertAtBegin(30);
        cr.insertAtBegin(40);
        cr.deleteAtBegin();
        cr.deleteAtLast();
//        cr.insertAtEnd(10);
//        cr.insertAtPosition(100,5);
//        cr.deleteAtBegin();
//        cr.deleteAtLast();
//        cr.deleteAtIndex(2);
//        System.out.println(cr.search(60));

//        int len = cr.length();
//
//        System.out.print(len);
        cr.display();
    }
}
