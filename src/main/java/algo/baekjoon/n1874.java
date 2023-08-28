package algo.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class n1874 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		Stack<Integer> stack = new Stack<>();

		int element = 0;

		while (n-- > 0) {
			int num = Integer.parseInt(br.readLine());

			if (element < num) {
				int gap = num - element;
				for (int i = 0; i < gap; i++) {
					stack.push(++element);
				}
				stack.pop();
				sb.append("+\n".repeat(gap));
			}

			else {
				if (num != stack.peek()) {
					sb.setLength(0);
					sb.append("NO");
					break;
				}
				stack.pop();
			}

			sb.append("-\n");
		}

		System.out.println(sb);
	}
}
