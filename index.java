import java.util.*;

class Triangle{
    void lt(int n){
        for(int i=0;i<n;i++){
            for (int j = n-i; j >0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void rt(int n){
        for(int i=0;i<n;i++){
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = n-i; j >0 ; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    void rd(int n){
        for(int i=0;i<n;i++){
            for (int j = n-i; j >0; j--) {
                System.out.print("*");
            }
            for (int j = i; j <n ; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    void ld(int n){
        for(int i=0;i<n;i++){
            for (int j = 0; j<i ; j++) {
                System.out.print(" ");
            }
            for (int j = n-i; j >0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void diamond(int n){
        for (int i = 0; i < n; i++) {
            for (int j=n-i;j>1;j--){
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = n-i-1; j >0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}

public class index{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Triangle t = new Triangle();
        t.diamond(n);
    }
}