package algo.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 바이러스 {

    private static boolean[][] graph;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int pair = Integer.parseInt(br.readLine());

        graph = new boolean[N + 1][N + 1];
        for (int i = 1; i <= pair; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            graph[a][b] = true;
            graph[b][a] = true;
        }

        visited = new boolean[N + 1];
        dfs(1);

        int count = 0;
        for (int i = 1; i < visited.length; i++) {
            if (visited[i])
                count++;
        }
        System.out.println(count - 1);
    }

    private static void dfs(int start) {
        visited[start] = true;

        for (int i = 1; i < graph.length; i++) {
            if (graph[start][i] && !visited[i]) {
                dfs(i);
            }
        }
    }
}
