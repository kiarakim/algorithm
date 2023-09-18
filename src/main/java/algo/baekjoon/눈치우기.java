package algo.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class 눈치우기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer[] snow = new Integer[N];
        for (int i = 0; i < N; i++) {
            snow[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(snow, Collections.reverseOrder());

        if (N == 1) {
            if (snow[0] > 1440)
                System.out.println(-1);
            else
                System.out.println(snow[0]);
            return;
        }

        int count = 0;

        while (snow[0] != 0 && snow[1] != 0) {
            count += snow[1];
            snow[0] -= snow[1];
            snow[1] = 0;
            Arrays.sort(snow, Collections.reverseOrder());
        }

        count += snow[0];
        if (count > 1440) {
            System.out.println(-1);
            return;
        }
        System.out.println(count);
    }
}
