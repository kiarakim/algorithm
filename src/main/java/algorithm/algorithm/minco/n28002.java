package algorithm.algorithm.minco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n28002 {
    public static int ME = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int y = 0; y < n; y++) {
            if (arr[y][ME] == 1) {
                System.out.printf("boss:%d\n", y);
                break;
            }
        }
        System.out.print("under:");
        for (int x = 0; x < n; x++) {
            if (arr[ME][x] == 1) {
                System.out.printf("%d ", x);
            }
        }
    }
}
