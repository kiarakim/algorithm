package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int measure = 0;
        int num = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                measure++;
            }
            if (measure == K){
                num = i;
                break;
            }
        }
        System.out.println(num);
    }
}
