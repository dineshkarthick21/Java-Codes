public class Doubly_linkedList {

Node head;

        class Node {
            int data;
            Node next,prev;

            Node(int data) {
                this.data = data;
            }
        }


        public void insertAtBegin(int data)
        {
            Node newNode = new Node(data);

            if(head==null)
            {
                head =newNode;
            }
            else {
                newNode.next=head;
                head.prev= newNode;
                head =newNode;
            }

        }
        public void insertAtPosition(int data,int index) {
            Node newNode = new Node(data);
            Node temp = head;


            if (index == 1)
            {
                 newNode.next =temp;
                 temp.prev =newNode;
                 head =newNode;
            }
            else
            {
                int count =length();

                if(index<=count) {

                    for (int i = 1; i < index - 1; i++) {
                        temp = temp.next;
                    }

                    Node ms = temp.next;
                    temp.next = newNode;
                    newNode.prev = temp;
                    newNode.next = ms;
                    ms.prev = newNode;
                }
                else {
                    System.out.print("No places found in our index!!...");
                }
            }
        }
        public void insertAtEnd(int data)
        {
            Node newNode = new Node(data);
            Node temp = head;

            while(temp.next!=null)
            {
                temp=temp.next;

            }
            temp.next=newNode;
            newNode.prev =temp;

        }


        public void deleteAtfirst()
        {
            head =head.next;
        }


        public void deleteAtLast()
        {
            Node temp =head;

            while(temp.next!=null)
            {
                temp=temp.next;
            }

            temp=temp.prev;
            temp.next=null;
        }

        public void  deleteAtIndex(int index)
        {
            Node temp = head;
            int count =length();

            if(index==1)
            {
                deleteAtfirst();
            }
            else if(count==index)
            {
                deleteAtLast();

            }

            else
            {

                if(index<count)
                {
                    for(int i=1;i<=index-1;i++)
                    {

                        temp =temp.next;
                    }
                    if(temp.prev!=null && temp.next!=null)
                    {
                        temp.prev.next = temp.next;
                        temp.next.prev = temp.prev;
                    }
                    else {
                        System.out.print("Not be deleted on index..");
                    }

                }

                 else {
                    System.out.println("Cannot be deleted the index!!");
                }

            }


        }

        public boolean searching(int data)
        {
            Node temp = head;

            while(temp!=null)
            {
                if(temp.data==data)
                {
                    return true;
                }
                temp=temp.next;
            }

            return false;


        }

        public int length()
        {
            Node temp =head;
            int count =0;
            while(temp!=null)
            {
                temp=temp.next;
                count++;

            }
            return count;
        }

//        public void previous()
//        {
//            Node temp = head;
//
//            while(temp.prev!=null)
//            {
//                temp=temp.prev;
//            }
//            System.out.print(temp.data);
//        }

        public void display()
        {
            Node temp =head;

            while(temp!=null)
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.print("null");
        }



    public static void main(String args[]) {
            Doubly_linkedList dl = new Doubly_linkedList();
            dl.insertAtBegin(20);
            dl.insertAtBegin(10);
            dl.insertAtEnd(30);
            dl.insertAtPosition(100,3);
            dl.insertAtPosition(101,4);
            dl.insertAtPosition(100,5);
//            dl.deleteAtLast();
//            dl.deleteAtfirst();
            //dl.previous();
            dl.deleteAtIndex(1);

//        System.out.println(dl.length());
//        System.out.print(dl.searching(1000));
        dl.display();

    }
}

