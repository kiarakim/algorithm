package algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n15649 {
    public static int N;
    public static int M;
    public static int[] path;
    public static boolean[] visited;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        path = new int[M];
        visited = new boolean[N];

        dfs(0);
        System.out.print(sb);
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
            if (visited[i]) continue;
            visited[i] = true;
            path[lev] = i + 1;
            dfs(lev + 1);
            visited[i] = false;
        }
    }
}
