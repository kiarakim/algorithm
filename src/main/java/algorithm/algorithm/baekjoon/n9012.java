package algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < T; i++) {
			int count = 0;
			String line = br.readLine();
			for (char ps : line.toCharArray()) {
				if (ps == '(') {
					count++;
				}
				if (ps == ')'){
					if (count <= 0){
						count--;
						break;
					}
					count--;
				}
			}
			if (count == 0)
				sb.append("YES").append("\n");
			else
				sb.append("NO").append("\n");

		}
		System.out.println(sb);
	}
}
