package algo.baekjoon.set3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 성싶당밀키트 {

    private static int N, G, K;
    private static int[] s, ns, l;
    private static boolean[] o;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        G = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        s = new int[N];
        ns = new int[N];
        l = new int[N];
        o = new boolean[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            l[i] = Integer.parseInt(st.nextToken());
            if (st.nextToken().equals("1")) {
                o[i] = true;
                ns[i] = S;
            } else s[i] = S;
        }

        long x = 0;
        long bacteria = 0;
        long left = 0;
        long right = Integer.MAX_VALUE;
        long mid = 0;

        while (left <= right) {
            mid = (left + right) / 2;
            bacteria = calc(mid);

            if (bacteria > G)
                right = mid - 1;
            else {
                left = mid + 1;
                x = Math.max(x, mid);
            }
        }
        System.out.println(x);
    }

    private static long calc(long x) {
        Long[] b = new Long[ns.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = ns[i] * Math.max(1, x - l[i]);
        }
        Arrays.sort(b, Comparator.reverseOrder());

        long sum = 0;
        for (int i = K; i < b.length; i++) {
            sum += b[i];
        }
        for (int i = 0; i < s.length; i++) {
            sum += s[i] * Math.max(1, x - l[i]);
        }
        return sum;
    }
}

/*
4 36 0
2 14 1
3 8 1
5 12 1
7 10 0

4 36 1
2 14 1
3 8 1
5 12 1
7 10 0

4 36 2
2 14 1
3 8 1
5 12 1
7 10 0
 */
