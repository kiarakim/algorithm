package algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class n2178 {
    public static int N, M;
    public static int[][] maze;
    public static boolean[][] visited;
    public static int[] dirY = {0, 0, -1, 1};
    public static int[] dirX = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        maze = new int[N][M];

        for (int y = 0; y < N; y++) {
            String S = br.readLine();
            for (int x = 0; x < M; x++) {
                maze[y][x] = S.charAt(x) - '0';
            }
        }
        visited = new boolean[N][M];
        visited[0][0] = true;

        BFS(0, 0);
        System.out.println(maze[N - 1][M - 1]);
    }

    static void BFS(int x, int y) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(x, y));
        visited[y][x] = true;

        while (!queue.isEmpty()) {
            Node now = queue.poll();

            for (int i = 0; i < 4; i++) {
                int dx = now.x + dirX[i];
                int dy = now.y + dirY[i];

                if (dx < 0 || dy < 0 || dx >= M || dy >= N) continue;
                if (visited[dy][dx] || maze[dy][dx] == 0) continue;
                visited[dy][dx] = true;
                maze[dy][dx] += maze[now.y][now.x];
                queue.offer(new Node(dx, dy));
            }
        }
    }

    static class Node {
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
