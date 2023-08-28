package algo.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.function.Consumer;

public class n10950_s {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[][] s = new int[T][2];
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			s[i][0] = Integer.parseInt(st.nextToken());
			s[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.stream(s)
			.forEach(getConsumer());
	}

	private static Consumer<int[]> getConsumer() {
		return arr -> System.out.println(arr[0] + arr[1]);
	}
}
