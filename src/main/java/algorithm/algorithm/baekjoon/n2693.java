package algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n2693 {
    public static int N = 3;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());


        for (int t = 0; t < T; t++) {
            int[] A = new int[10];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 10; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(A);
            sb.append(A[7]).append('\n');
        }
        System.out.println(sb);
    }
}
