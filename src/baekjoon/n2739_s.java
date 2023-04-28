package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class n2739_s {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		IntStream.range(N, N + 1).forEach(i -> {
			IntStream.range(1, 9).forEach(j -> {
				System.out.println(i + " * " + j + " = " + i * j);
			});
		});
	}
}
