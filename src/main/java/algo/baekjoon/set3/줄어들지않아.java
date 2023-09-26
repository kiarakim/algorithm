package algo.baekjoon.set3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 줄어들지않아 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            sb.append(getCount(N)).append("\n");
        }

        System.out.println(sb);
    }

    private static long getCount(int N) {
        long[][] dp = new long[N + 1][10];
        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1L;
        }

        for (int i = 2; i <= N; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = j; k < 10; k++) {
                    dp[i][j] += dp[i - 1][k];
                }
            }
        }

        long sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += dp[N][i];
        }
        return sum;
    }
}
