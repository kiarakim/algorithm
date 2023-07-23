package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 안전영역 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        int[][] map = new int[N][N];
        int min = 999;
        int max = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int height = Integer.parseInt(st.nextToken());
                map[i][j] = height;
                min = Math.min(height, min);
                max = Math.max(height, max);
            }
        }

        int[] dx = {0, 1, 0, -1};
        int[] dy = {-1, 0, 1, 0};

        int safe = 0;

        for (int i = min; i <= max; i++) {
            if(max == min){
                safe = 1;
                break;
            }
            int count = 0;
            boolean[][] visited = new boolean[N][N];
            Queue<int[]> q = new LinkedList<>();
            for (int y = 0; y < N; y++) {
                for (int x = 0; x < N; x++) {
                    if (map[y][x] <= i || visited[y][x]) continue;
                    q.add(new int[]{y, x});
                    visited[y][x] = true;

                    count++;
                    while (!q.isEmpty()) {
                        int[] position = q.poll();
                        int yVal = position[0];
                        int xVal = position[1];

                        for (int d = 0; d < 4; d++) {
                            int ny = yVal + dy[d];
                            int nx = xVal + dx[d];

                            if (nx < 0 || ny < 0 || nx > N - 1 || ny > N - 1) continue;
                            if (visited[ny][nx]) continue;
                            if (map[ny][nx] > i) {
                                visited[ny][nx] = true;
                                q.add(new int[]{ny, nx});
                            }
                        }
                    }
                }
            }
            if (count > safe) safe = count;
        }
        System.out.println(safe);
    }
}
