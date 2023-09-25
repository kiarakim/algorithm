package algo.baekjoon.set2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 정원Easy {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] garden = new int[N + 1][M + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            garden[i][0] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= M; i++) {
            garden[0][i] = Integer.parseInt(st.nextToken());
        }

        for (int n = 1; n <= N; n++) {
            for (int m = 1; m <= M; m++) {
                if (garden[n][m - 1] == garden[n - 1][m]) {
                    garden[n][m] = 0;
                } else garden[n][m] = 1;
            }
        }

        System.out.println(garden[N][M]);
    }
}
