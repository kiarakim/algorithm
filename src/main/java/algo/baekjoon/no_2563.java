package algo.baekjoon;

// [2차원 배열] 색종이

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_2563 {

    public static final int[][] paper = new int[100][100];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int xDot = Integer.parseInt(st.nextToken());
            int yDot = Integer.parseInt(st.nextToken());
            pastePaper(xDot, yDot);
        }

        int black = getBlack(paper);

        System.out.println(black);
    }

    public static void pastePaper(int xDot, int yDot) {
        for (int y = yDot; y < yDot + 10; y++) {
            for (int x = xDot; x < xDot + 10; x++) {
                paper[y][x] = 1;
            }
        }
    }

    public static int getBlack(int[][] paper) {
        int black = 0;
        for (int y = 0; y < 100; y++) {
            for (int x = 0; x < 100; x++) {
                if (paper[y][x] == 1) {
                    black++;
                }
            }
        }
        return black;
    }
}
