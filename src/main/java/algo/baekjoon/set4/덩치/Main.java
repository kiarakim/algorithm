package algo.baekjoon.set4.덩치;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] people = new int[N][2];
        for (int i = 0; i < N; i++) {
            String[] split = br.readLine().split(" ");
            people[i][0] = Integer.parseInt(split[0]);
            people[i][1] = Integer.parseInt(split[1]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                if (people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
                    count++;
                }
            }
            sb.append(count).append(" ");
        }

        System.out.println(sb);
    }
}
