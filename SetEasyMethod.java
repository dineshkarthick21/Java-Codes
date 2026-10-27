import java.util.*;
//import java.util.Set;
//import java.util.ArrayList;
import java.util.LinkedHashSet;
public class SetEasyMethod {

    // Duplicate எண்களை நீக்கி Set-ஆக மாற்றும் method
    public static Set<Integer> removeDuplicates(Integer[] arr) {
        return new LinkedHashSet<>(Arrays.asList(arr));
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};

        System.out.println(removeDuplicates(arr));
    }
}
