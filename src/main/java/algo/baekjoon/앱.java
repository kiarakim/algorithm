package algo.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 앱 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] memory = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            memory[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int[] cost = new int[N + 1];
        int costSize = 0;
        for (int i = 1; i <= N; i++) {
            int value = Integer.parseInt(st.nextToken());
            cost[i] = value;
            costSize += value;
        }

        int[] dp = new int[costSize + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = costSize; j >= cost[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - cost[i]] + memory[i]);
            }
        }

        for (int i = 0; i < dp.length; i++) {
            if (dp[i] >= M) {
                System.out.println(i);
                break;
            }
        }
    }
}
