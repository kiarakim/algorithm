package algo.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 퇴사2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        int[] T = new int[N + 2];
        int[] P = new int[N + 2];


        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        int[] dp = new int[N + 2];

        for (int i = 1; i <= N + 1; i++) {
            if (max < dp[i]) {
                max = dp[i];
            }

            int day = i + T[i];
            if (day <= N + 1) {
                dp[day] = Math.max(dp[day], max + P[i]);
            }
        }
        System.out.println(max);
    }
}
