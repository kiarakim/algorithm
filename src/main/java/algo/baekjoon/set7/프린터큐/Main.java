package algo.baekjoon.set7.프린터큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;
        LinkedList<int[]> queue;
        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            queue = new LinkedList<>();
            for (int i = 0; i < N; i++) {
                int n = Integer.parseInt(st.nextToken());
                queue.add(new int[]{i, n});
            }

            int count = 0;
            while (!queue.isEmpty()) {
                int[] first = queue.poll();
                boolean isMax = true;

                for (int i = 0; i < queue.size(); i++) {
                    if (first[1] < queue.get(i)[1]) {
                        queue.add(first);

                        for (int j = 0; j < i; j++)
                            queue.add(queue.poll());

                        isMax = false;
                        break;
                    }
                }
                if (!isMax) continue;
                count++;
                if (first[0] == M) break;
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }
}
