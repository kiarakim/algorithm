package algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class n2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String bracket = br.readLine();

        Stack<Character> stack = new Stack<>();
        int result = 0;
        int multi = 1;

        for (int i = 0; i < bracket.length(); i++) {
            if(bracket.charAt(i) == '('){
                stack.push('(');
                multi *= 2;
                continue;
            }
            if(bracket.charAt(i) == '['){
                stack.push('[');
                multi *= 3;
                continue;
            }
            if(bracket.charAt(i) ==')'){
                if (stack.isEmpty() || stack.peek() != '(') {
                    result = 0;
                    break;
                }
                if (bracket.charAt(i - 1) == '(')
                    result += multi;
                stack.pop();
                multi /= 2;
                continue;
            }
            if(bracket.charAt(i) ==']'){
                if (stack.isEmpty() || stack.peek() != '[') {
                    result = 0;
                    break;
                }
                if (bracket.charAt(i - 1) == '[')
                    result += multi;
                stack.pop();
                multi /= 3;
            }
        }
        if (!stack.isEmpty()) result = 0;
        System.out.println(result);
    }
}
