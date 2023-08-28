package algo.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class n1260 {
    public static StringBuilder sb = new StringBuilder();
    public static int N, M;
    public static boolean[] visited;
    public static int[][] graph;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        graph = new int[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            graph[y][x] = graph[x][y] = 1;
        }

        DFS(V);
        sb.append('\n');
        Arrays.fill(visited, false);
        BFS(V);
        System.out.println(sb);
    }

    public static void DFS(int lev) {
        sb.append(lev).append(' ');

        for (int i = 1; i <= N; i++) {
            if (visited[i]) continue;
            visited[lev] = true;
            if (graph[lev][i] != 1) continue;
            DFS(i);
        }
    }

    public static void BFS(int lev) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(lev);
        visited[lev] = true;
        sb.append(lev).append(' ');

        while (!q.isEmpty()) {
            int now = q.poll();

            for (int i = 1; i <= N; i++) {
                if (visited[i]) continue;
                if (graph[now][i] != 1) continue;
                q.offer(i);
                visited[i] = true;
                sb.append(i).append(' ');
            }
        }
    }
}
