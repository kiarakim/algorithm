package algorithm.algorithm.swea;

import java.util.Scanner;

class Sol2072 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		StringBuilder sBuilder = new StringBuilder();

		for (int t = 1; t <= T; t++) {
			sBuilder = new StringBuilder();
			int sum = 0;
			for (int c = 0; c < 10; c++) {
				int num = sc.nextInt();
				if (num % 2 == 1) {
					sum += num;
				}
			}
			System.out.printf("#%d %d\n", t, sum);
		}
		sc.close();
	}
}
