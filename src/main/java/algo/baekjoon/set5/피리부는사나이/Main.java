package algo.baekjoon.set5.피리부는사나이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int x = 0, y = 0;
    private static char[][] map;
    private static int[][] visited;
    private static int result = 0;
    private static int turn = 1;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        y = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        map = new char[y][x];
        visited = new int[y][x];

        for (int i = 0; i < y; i++) {
            char[] tmp = br.readLine().toCharArray();
            for (int j = 0; j < x; j++) {
                map[i][j] = tmp[j];
            }
        }

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (visited[i][j] == 0) {
                    bfs(i, j);
                }
            }
        }

        System.out.println(result);
    }

    private static void bfs(int i, int j) {
        visited[i][j] = turn;
        int[] np = getNewPosition(map[i][j]);
        int nx = i + np[0];
        int ny = j + np[1];

        if (visited[nx][ny] == 0) {
            bfs(nx, ny);
        } else {
            if (visited[nx][ny] == turn) {
                result++;
            }
            turn++;
        }
    }

    private static int[] getNewPosition(char now) {
        switch (now) {
            case 'U':
                return new int[]{-1, 0};
            case 'D':
                return new int[]{1, 0};
            case 'L':
                return new int[]{0, -1};
            case 'R':
                return new int[]{0, 1};
        }
        return null;
    }
}
