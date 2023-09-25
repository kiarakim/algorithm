package algo.baekjoon.set2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {

    static int N, M;
    static int[][] map;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static List<Virus> virus = new ArrayList<>();
    static Virus[] target;
    static int zeros = 0;
    static int minTime = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][N];

        for (int x = 0; x < N; x++) {
            st = new StringTokenizer(br.readLine());
            for (int y = 0; y < N; y++) {
                map[x][y] = Integer.parseInt(st.nextToken());
                if (map[x][y] == 0) zeros++;
                if (map[x][y] == 2) {
                    virus.add(new Virus(x, y, 0));
                    zeros++;
                }
            }
        }

        target = new Virus[M];
        combination(0, 0);
        System.out.println(minTime == Integer.MAX_VALUE ? -1 : minTime);
    }

    private static void combination(int count, int start) {
        if (count == M) {
            bfs();
            return;
        }

        for (int i = start; i < virus.size(); i++) {
            target[count] = virus.get(i);
            combination(count + 1, i + 1);
        }
    }

    private static void bfs() {
        int zeroCount = zeros;
        boolean[][] visited = new boolean[N][N];
        Queue<Virus> q = new LinkedList<>();

        for (int i = 0; i < M; i++) {
            zeroCount--;

            visited[target[i].x][target[i].y] = true;
            q.add(new Virus(target[i].x, target[i].y, 0));
        }

        int time = 0;
        while (!q.isEmpty()) {
            Virus v = q.poll();
            time = v.time;

            for (int i = 0; i < 4; i++) {
                int nx = v.x + dx[i];
                int ny = v.y + dy[i];
                if (nx < 0 || nx >= N || ny < 0 || ny >= N) continue;
                if (visited[nx][ny]) continue;
                if (map[nx][ny] == 1) continue;

                visited[nx][ny] = true;
                q.add(new Virus(nx, ny, v.time + 1));

                if (map[nx][ny] == 0 || map[nx][ny] == 2) zeroCount--;
            }
        }
        if (zeroCount == 0) minTime = Math.min(minTime, time);
    }

    static class Virus {
        int x;
        int y;
        int time;

        public Virus(int x, int y, int time) {
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }
}
