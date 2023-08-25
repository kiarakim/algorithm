package algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[] numbs = new int[1001];
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                if (count == 1001) break;
                numbs[count] = i;
                count++;
            }
        }

        int sum = 0;
        for (int i = A - 1; i < B; i++) {
            sum += numbs[i];
        }
        System.out.println(sum);
    }
}
