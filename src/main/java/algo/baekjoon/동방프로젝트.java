package algo.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 동방프로젝트 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] rooms = new int[N + 1];

        for (int i = 0; i < M; i++) {
            String[] action = br.readLine().split(" ");
            int x = Integer.parseInt(action[0]);
            int y = Integer.parseInt(action[1]);

            for(int j = x; j < y; j++) {
                rooms[j] = 1;
            }
        }

        long count = Arrays.stream(rooms)
                .filter(room -> room == 0)
                .count() - 1;
        System.out.println(count);
    }
}
