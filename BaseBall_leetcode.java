import java.util.Stack;
public class BaseBall_leetcode {
        public static void main(String args[]) {
            String operations[] = {"5","2","C","D","+"};
            Stack<Integer> stack = new Stack<>();

            for (String op : operations) {
                if (op.equals("C")) {
                    stack.pop();
                } else if (op.equals("D")) {
                    stack.push(2 * stack.peek());
                } else if (op.equals("+")) {
                    int last = stack.pop();
                    int secondLast = stack.peek();
                    stack.push(last);
                    stack.push(last + secondLast);
                } else {
                    stack.push(Integer.parseInt(op));
                }
            }

            int total = 0;
            for (int score : stack) {
                total += score;
            }

            System.out.println(total);
        }
    }


