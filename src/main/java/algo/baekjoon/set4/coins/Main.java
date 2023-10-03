package algo.baekjoon.set4.coins;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] coins = new int[N];
            String[] split = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                coins[j] = Integer.parseInt(split[j]);
            }
            int M = Integer.parseInt(br.readLine());

            int[] dp = new int[M + 1];
            dp[0] = 1;
            for (int coin : coins) {
                for (int j = coin; j <= M; j++) {
                    dp[j] += dp[j - coin];
                }
            }
            sb.append(dp[M]).append("\n");
        }
        System.out.println(sb);
    }
}
