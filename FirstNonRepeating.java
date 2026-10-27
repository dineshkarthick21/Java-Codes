import java.util.*;

public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for(char ch : s.toCharArray()) {
            freq[ch-'a']++;
            q.add(ch);

            while(!q.isEmpty() && freq[q.peek()-'a'] > 1)
                q.poll();

            if(q.isEmpty())
                System.out.print("-1 ");
            else
                System.out.print(q.peek()+" ");
        }
    }
}
