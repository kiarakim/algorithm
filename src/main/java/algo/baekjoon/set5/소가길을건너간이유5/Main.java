package algo.baekjoon.set5.소가길을건너간이유5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[] light = new int[N + 1];

        for (int i = 0; i < B; i++) {
            int broken = Integer.parseInt(br.readLine());
            light[broken] = 1;
        }

        int sum = 0;
        for (int i = 1; i <= K; i++) {
            sum += light[i];
        }

        int min = sum;
        for (int i = K + 1; i <= N; i++) {
            sum = sum + light[i] - light[i - K];
            min = Math.min(min, sum);
        }
        System.out.println(min);
    }
}
