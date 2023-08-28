package algo.baekjoon;

// [2차원 배열] 최댓값

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_2566 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int max = 0;
        int yIdx = 0;
        int xIdx = 0;
        int[][] map = new int[9][9];

        for (int y = 0; y < 9; y++) {
            st = new StringTokenizer(br.readLine());
            for (int x = 0; x < 9; x++) {
                map[y][x] = Integer.parseInt(st.nextToken());
                if (max <= map[y][x]) {
                    max = map[y][x];
                    yIdx = y + 1;
                    xIdx = x + 1;
                }
            }
        }

        sb.append(max).append('\n').append(yIdx).append(' ').append(xIdx);
        System.out.println(sb);
    }
}
