package algo.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1806 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int[] sequence = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            sequence[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0, end = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        while (start <= N && end <= N) {
            if (sum >= S && min > end - start)
                min = end - start;
            if (sum < S)
                sum += sequence[end++];
            else sum -= sequence[start++];
        }
        if (min == Integer.MAX_VALUE) min = 0;
        System.out.println(min);
    }
}
