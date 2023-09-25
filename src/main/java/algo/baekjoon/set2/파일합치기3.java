package algo.baekjoon.set2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class 파일합치기3 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Queue<Long> pq;

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            pq = new PriorityQueue<>();
            st = new StringTokenizer(br.readLine());
            for (int n = 0; n < N; n++) {
                pq.add(Long.parseLong(st.nextToken()));
            }

            long save = 0;
            while (pq.size() > 1) {
                long chap1 = pq.poll();
                long chap2 = pq.poll();

                long sum = chap1 + chap2;

                save += sum;
                pq.add(sum);
            }
            sb.append(save).append("\n");
        }
        System.out.println(sb);
    }
}
