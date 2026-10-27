import java.util.*;

public class AreaOfCirclePrblm {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int rl = r * r;
        double dl = 3.14;
        double fin =dl*rl;
        System.out.printf("%.2f",fin);

    }
}
