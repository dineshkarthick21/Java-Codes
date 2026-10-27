import java.util.LinkedList;
public class LinkedList_collection {
    public static void main(String args[])
    {
        LinkedList<String> list = new LinkedList<>();
        list.add("dinesh");
        list.add("karthick");
        list.add("elhil");
        list.add("maameee");
//        list.removeFirst();
//        list.removeLast();
        list.offer("dinesh");

        System.out.print(list.getFirst()+" ");
        System.out.print(list.getLast());










    }
}
