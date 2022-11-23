package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n3460 {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            getBinary(n);
            sb.append('\n');
        }
        System.out.println(sb);
    }

    public static void getBinary(int n) {
        int index = 0;
        while (n > 0) {
            int leftover = n % 2;
            n /= 2;
            if (leftover == 1) {
                sb.append(index).append(' ');
            }
            index++;
        }
    }
}
