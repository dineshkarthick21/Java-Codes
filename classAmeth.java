
    import java.util.*;
     class classAmeth {


        String name;
        int rollno;

        public void display()
        {
            System.out.println(name);
            System.out.println(rollno);
        }


        public static void main(String[] args) {
            classAmeth obj = new classAmeth();
            obj.name ="dk";
            obj.rollno=10;
            obj.display();
        }

    }


