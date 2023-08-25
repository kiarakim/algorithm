package algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class n10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        Deque<Integer> q = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String command = br.readLine();

            if (command.startsWith("push_front")) {
                int element = Integer.parseInt(command.substring(11));
                q.addFirst(element);
                continue;
            }

            if (command.startsWith("push_back")) {
                int element = Integer.parseInt(command.substring(10));
                q.addLast(element);
                continue;
            }

            if (command.equals("size")) {
                sb.append(q.size()).append("\n");
                continue;
            }

            if (command.equals("empty")) {
                if (q.isEmpty()) {
                    sb.append(1).append("\n");
                } else sb.append(0).append("\n");
                continue;
            }

            if (q.isEmpty()) {
                sb.append(-1).append("\n");
                continue;
            }

            if (command.equals("pop_front")) {
                sb.append(q.pollFirst()).append("\n");
            }

            if (command.equals("pop_back")) {
                sb.append(q.pollLast()).append("\n");
            }

            if (command.equals("front")) {
                sb.append(q.peekFirst()).append("\n");
            }

            if (command.equals("back")) {
                sb.append(q.peekLast()).append("\n");
            }
        }
        System.out.println(sb);
    }
}
