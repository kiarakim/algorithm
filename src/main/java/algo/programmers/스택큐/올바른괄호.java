package algo.programmers.스택큐;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class 올바른괄호 {
    public static void main(String[] args) {
//        String s = "(())()";
        String s = ")()(";
        System.out.println(solution(s));
    }

    public static boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        if (s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(') return false;

        for (int i = 0; i < s.length(); i++) {
            char now = s.charAt(i);
            if (now == '(') {
                stack.push(now);
            } else {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return false;
        return answer;
    }
}
