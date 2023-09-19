package algo.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 신입사원 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            int[][] scores = new int[N][2];
            for (int n = 0; n < N; n++) {
                st = new StringTokenizer(br.readLine());
                scores[n][0] = Integer.parseInt(st.nextToken());
                scores[n][1] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(scores, Comparator.comparingInt(o -> o[0]));

            int count = 1;
            int max = scores[0][1];
            for (int n = 1; n < N; n++) {
                if(scores[n][1] < max) {
                    count++;
                    max = scores[n][1];
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
