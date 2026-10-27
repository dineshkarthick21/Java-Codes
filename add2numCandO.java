import java.util.*;

public class add2numCandO {
    public int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String args[])
    {
        add2numCandO sol = new add2numCandO();
        int a =10;
        int b=20;
        System.out.println("return the sum of two numbers : " +sol.addNumbers(a,b));
    }
}