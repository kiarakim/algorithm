package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1303 {
    public static int N, M;
    public static char[][] map;
    public static int[] dirY = {-1, 1, 0, 0};
    public static int[] dirX = {0, 0, -1, 1};
    public static boolean[][] visited;
    public static int count, white, blue;

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
                char color = map[y][x];
                count = 0;
                DFS(x, y, color);

                if (color == 'W') white += count * count;
                else blue += count * count;
            }
        }

        System.out.println(white + " " + blue);
    }

    static void DFS(int x, int y, char color) {
        visited[y][x] = true;
        count++;

        for (int i = 0; i < 4; i++) {
            int dx = x + dirX[i];
            int dy = y + dirY[i];

            if (dx < 0 || dy < 0 || dx >= N | dy >= M) continue;
            if (visited[dy][dx] || map[dy][dx] != color) continue;
            DFS(dx, dy, map[dy][dx]);
        }
    }
}
