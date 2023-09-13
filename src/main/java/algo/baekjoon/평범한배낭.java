package algo.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 평범한배낭 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] w = new int[N + 1];
        int[] v = new int[N + 1];
        int[][] dp = new int[N + 1][K + 1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            w[i] = Integer.parseInt(st.nextToken());
            v[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= K; j++) {
                if (j >= w[i]) {    // i번째 물건을 넣을 수 있다면
                    // i-1번째에 물건을 넣었을 때와 i번째 물건과 i-1번째에 j-w[i] 이하의 물건을 넣은 경우를 비교해서 가치가 큰 것 선택
                    dp[i][j] = Math.max(dp[i - 1][j], v[i] + dp[i - 1][j - w[i]]);
                } else dp[i][j] = dp[i - 1][j];
            }

        }
        System.out.println(dp[N][K]);
    }
}
