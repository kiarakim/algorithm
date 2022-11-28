package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class n1303 {
    static int N, M;
    static char[][] map;
    static int[] dirY = {-1, 1, 0, 0};
    static int[] dirX = {0, 0, -1, 1};
    static boolean[][] visited;
    static int count, white, blue;

    static Queue<Node> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());   // 가로
        M = Integer.parseInt(st.nextToken());   // 세로
        map = new char[M][N];
        visited = new boolean[M][N];

        for (int y = 0; y < M; y++) {
            String line = br.readLine();
            for (int x = 0; x < N; x++) {
                map[y][x] = line.charAt(x);
            }
        }

        for (int y = 0; y < M; y++) {
            for (int x = 0; x < N; x++) {
                if (visited[y][x]) continue;
                if (map[y][x] == 'W') {
                    int cnt = BFS(x, y, 'W');
                    white += cnt * cnt;
                } else {
                    int cnt = BFS(x, y, 'B');
                    blue += cnt * cnt;
                }
            }
        }

        /*for (int y = 0; y < M; y++) {
            for (int x = 0; x < N; x++) {
                if (visited[y][x]) continue;
                char color = map[y][x];
                count = 0;
                DFS(x, y, color);

                if (color == 'W') white += count * count;
                else blue += count * count;
            }
        }*/

        System.out.println(white + " " + blue);
    }

    static int BFS(int x, int y, char color) {
        q.offer(new Node(x, y));
        count = 1;
        visited[y][x] = true;

        while (!q.isEmpty()) {
            Node now = q.poll();

            for (int i = 0; i < 4; i++) {
                int dx = now.x + dirX[i];
                int dy = now.y + dirY[i];

                if (dx < 0 || dy < 0 || dx >= N | dy >= M) continue;
                if (visited[dy][dx] || map[dy][dx] != color) continue;
                q.offer(new Node(dx, dy));
                visited[dy][dx] = true;
                count++;
            }
        }
        return count;
    }

    static class Node {
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    /*static void DFS(int x, int y, char color) {
        visited[y][x] = true;
        count++;

        for (int i = 0; i < 4; i++) {
            int dx = x + dirX[i];
            int dy = y + dirY[i];

            if (dx < 0 || dy < 0 || dx >= N | dy >= M) continue;
            if (visited[dy][dx] || map[dy][dx] != color) continue;
            DFS(dx, dy, map[dy][dx]);
        }
    }*/
}
