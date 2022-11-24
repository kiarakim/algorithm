package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n14719 {
    public static int[] land;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        land = new int[W];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < W; i++) {
            land[i] = Integer.parseInt(st.nextToken());
        }

        int rain = 0;
        for (int i = 1; i < W - 1; i++) {
            int left = 0;
            int right = 0;

            for (int j = 0; j < i; j++) {
                left = Math.max(land[j], left);
            }
            for (int j = i + 1; j < W; j++) {
                right = Math.max(land[j], right);
            }

            if (land[i] < left && land[i] < right) {
                rain += Math.min(left, right) - land[i];
            }
        }
        System.out.println(rain);
    }
}
