package algo.baekjoon.set3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 더흔한타일색칠문제 {

    private static int N, M, K;
    private static char[][] tile;
    private static int sectionCount;
    private static int maxIndex;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        tile = new char[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                tile[i][j] = line.charAt(j);
            }
        }

        sectionCount = N * M / (K * K);
        int count = 0;
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < K; j++) {
                count += getLeastChangeCount(i, j);
                changeTile(i, j);
            }
        }
        System.out.println(count);
        printTile();
    }

    private static int getLeastChangeCount(int i, int j) {
        int[] alpha = new int[26];
        for (int x = 0; x < N; x += K) {
            for (int y = 0; y < M; y += K) {
                alpha[tile[x + i][y + j] - 'A']++;
            }
        }
        maxIndex = maxAlphaIndex(alpha);
        return sectionCount - alpha[maxIndex];
    }

    private static int maxAlphaIndex(int[] alpha) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int a = 0; a < alpha.length; a++) {
            if (alpha[a] > max) {
                max = alpha[a];
                index = a;
            }
        }
        return index;
    }

    private static void changeTile(int i, int j) {
        for (int x = 0; x < N; x += K) {
            for (int y = 0; y < M; y += K) {
                tile[x + i][y + j] = (char) (maxIndex + 'A');
            }
        }
    }

    private static void printTile() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(tile[i]).append("\n");
        }
        System.out.println(sb);
    }
}
