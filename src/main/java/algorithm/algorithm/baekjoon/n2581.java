package algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                sum += i;
                if (min > i) min = i;
            }
        }
        if(sum ==0)
            System.out.println(-1);
        else
            System.out.printf("%d\n%d", sum, min);
    }

    public static boolean isPrime(int n) {
        if (n == 1) return false;
        int end = n / 2;
        for (int i = 2; i <= end; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
