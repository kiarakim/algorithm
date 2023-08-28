package algo.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n4153 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            int[] arr = new int[3];

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < 3; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            if(arr[0] == 0) break;

            Arrays.sort(arr);

            int sum = 0;
            for (int i = 0; i < 2; i++) {
                sum += arr[i] * arr[i];
            }

            if(sum == arr[2] * arr[2])
                sb.append("right").append('\n');
            else sb.append("wrong").append('\n');
        }
        System.out.println(sb);
    }
}
