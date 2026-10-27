import java.util.*;
public class missingOneNum {
    public static void main(String args[]) {

            int arr[] = {0,1,2,3};

            int missing = arr.length;
            for (int i = 0; i < arr.length; i++) {

                missing^=i^arr[i];

            }
            System.out.print(missing);

        }
    }

