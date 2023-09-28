package algo.baekjoon.set4.세워라반석위에;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    private static int[] nums = new int[11];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int answer = 0;
        Deque<Integer> queue = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            nums[n]++;
            queue.add(n);
            while (check() > 2 && !queue.isEmpty()) {
                int a = queue.pollFirst();
                nums[a]--;
            }
            answer = Math.max(answer, queue.size());
        }
        System.out.println(answer);
    }


    private static int check() {
        int a = 0;
        for (int i = 1; i <= 10; i++) {
            if (nums[i] > 0) {
                a = i;
                break;
            }
        }
        int b = 0;
        for (int i = 10; i >= 1; i--) {
            if (nums[i] > 0) {
                b = i;
                break;
            }
        }
        return b - a;
    }
}
