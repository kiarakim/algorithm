package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n9093 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			while (st.hasMoreTokens()) {
				String word = st.nextToken();
				for (int j = word.length() - 1; j >= 0; j--) {
					sb.append(word.charAt(j));
				}
				sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
