package algo.baekjoon.set7.벚꽃이정보섬에피어난이유;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] trees = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        boolean[] visited;

        for (int t = 0; t < 4; t++) {
            visited = new boolean[N];
            int total = 1;
            for (int i = t; i <= N - 4 + t; i++) {
                total *= trees[i];
                visited[i] = true;
            }
            for (int i = 0; i < N; i++) {
                if (!visited[i]) {
                    total += trees[i];
                }
            }

            max = Math.max(max, total);
        }
        System.out.println(max);
    }
}
