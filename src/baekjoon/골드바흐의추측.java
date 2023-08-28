package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 골드바흐의추측 {
    public static boolean[] prime;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        prime = new boolean[1000001];
        get_prime();

        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            int possible = isPossible(n);

            if (possible == -1) {
                sb.append("Goldbach's conjecture is wrong.\n");
                continue;
            }
            sb.append(n + " = " + possible + " + " + (n - possible) + "\n");
        }
        System.out.println(sb);
    }

    private static int isPossible(int n) {
        for (int i = 1; i <= n / 2; i++) {
            int a = i;
            int b = n - i;
            if (!prime[a] && !prime[b]) {
                return a;
            }
        }
        return -1;
    }

    private static void get_prime() {
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
