package baekjoon;

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

        bfs(0, 0);
        System.out.println(maze[N - 1][M - 1]);
    }

    public static void bfs(int y, int x) {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(y, x));
        visited[y][x] = true;

        while (!q.isEmpty()) {
            Node node = q.poll();

            for (int i = 0; i < 4; i++) {
                int dy = node.y + dirY[i];
                int dx = node.x + dirX[i];

                if (dx < 0 || dy < 0 || dx >= M || dy >= N) continue;
                if (visited[dy][dx] || maze[dy][dx] == 0) continue;
                q.offer(new Node(dy, dx));
                visited[dy][dx] = true;

                maze[dy][dx] = maze[node.y][node.x] + 1;
                if(visited[N - 1][M - 1])
                    return;
            }
        }
    }

    static class Node {
        int y, x;

        public Node(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }

}
