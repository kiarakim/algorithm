package algo.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 단지번호붙이기 {

    private static int N;
    private static int[][] map;
    private static boolean[][] visited;
    private static int count = 0;
    private static final int[] dx = {-1, 0, 1, 0};
    private static final int[] dy = {0, 1, 0, -1};


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        map = new int[N][N];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = Character.getNumericValue(line.charAt(j));
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    count = 0;
                    bfs(i, j);
                    list.add(count);
                }
            }
        }

        System.out.println(list.size());
        list.stream()
                .sorted()
                .forEach(System.out::println);
    }

    private static void bfs(int x, int y) {
        visited[x][y] = true;
        count++;

        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (newX < 0 || newY < 0 || newX >= N || newY >= N)
                continue;
            if (!visited[newX][newY] && map[newX][newY] == 1)
                bfs(newX, newY);
        }
    }
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        N = Integer.parseInt(br.readLine());
//        List<Integer> list = new ArrayList<>();
//
//        map = new int[N][N];
//        visited = new boolean[N][N];
//        for (int i = 0; i < N; i++) {
//            String line = br.readLine();
//            for (int j = 0; j < N; j++) {
//                map[i][j] = Character.getNumericValue(line.charAt(j));
//            }
//        }
//
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                if (!visited[i][j] && map[i][j] == 1) {
//                    count = 0;
//                    dfs(i, j);
//                    list.add(count);
//                }
//            }
//        }
//
//        System.out.println(list.size());
//        list.stream()
//                .sorted()
//                .forEach(System.out::println);
//    }
//
//    private static void dfs(int x, int y) {
//        visited[x][y] = true;
//        count++;
//
//        for (int i = 0; i < 4; i++) {
//            int newX = x + dx[i];
//            int newY = y + dy[i];
//
//            if (newX < 0 || newY < 0 || newX >= N || newY >= N)
//                continue;
//            if (!visited[newX][newY] && map[newX][newY] == 1)
//                dfs(newX, newY);
//        }
//    }
}
