package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            count += isPrime(num);
        }

        System.out.println(count);
    }

    public static int isPrime(int n) {
        if (n <= 1) return 0;
        int end = n / 2;
        for (int i = 2; i <= end; i++) {
            if (n % i == 0)
                return 0;
        }
        return 1;
    }
}
