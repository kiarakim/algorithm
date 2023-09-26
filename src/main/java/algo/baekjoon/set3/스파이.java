package algo.baekjoon.set3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 스파이 {

    private static int N, M;
    private static int[][] schedule;
    private static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        schedule = new int[2][3];

        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                schedule[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0, -1);
        System.out.println(count);
    }

    static void dfs(int day, int sum, int yesterday) {
        if (day == N) {
            if (M <= sum) {
                count++;
            }
            return;
        }

        for (int[] ints : schedule) {
            for (int j = 0; j < 3; j++) {
                if (j == yesterday) {
                    dfs(day + 1, sum + ints[j] / 2, j);
                } else {
                    dfs(day + 1, sum + ints[j], j);
                }
            }
        }
    }
}
