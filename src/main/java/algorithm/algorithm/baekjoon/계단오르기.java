package algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 계단오르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int step = Integer.parseInt(br.readLine());
        int[] stair = new int[301];

        for (int i = 0; i < step; i++) {
            int score = Integer.parseInt(br.readLine());
            stair[i] = score;
        }

        int[] scores = new int[301];
        scores[0] = stair[0];
        scores[1] = stair[0] + stair[1];
        scores[2] = Math.max(stair[0], stair[1]) + stair[2];

        for (int i = 3; i < step; i++) {
            scores[i] = Math.max(scores[i - 3] + stair[i - 1], scores[i - 2]) + stair[i];
        }
        System.out.println(scores[step - 1]);
    }
}
