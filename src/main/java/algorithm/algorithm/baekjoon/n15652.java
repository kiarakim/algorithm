package algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n15652 {
    public static int N, M;
    public static int[] path;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        path = new int[M];

        dfs(0);

        System.out.println(sb);
    }

    public static void dfs(int lev) {
        if (lev == M) {
            for (int num : path) {
                sb.append(num).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < N; i++) {
            if (lev > 0 && path[lev - 1] > i + 1) continue;
            path[lev] = i + 1;
            dfs(lev + 1);
        }
    }
}
