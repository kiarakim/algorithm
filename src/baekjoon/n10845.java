package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class n10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (s.startsWith("push")) {
                int element = Integer.parseInt(s.split(" ")[1]);
                if (element > 0 && element <= 100000) {
                    queue.add(element);
                }
            }
            if (s.equals("pop")) {
                if (queue.isEmpty()) {
                    sb.append(-1).append("\n");
                    continue;
                }
                int index = queue.size() - 1;
                sb.append(queue.poll()).append("\n");
            }
            if (s.equals("size")) {
                sb.append(queue.size()).append("\n");
            }
            if (s.equals("empty")) {
                if (queue.isEmpty()) {
                    sb.append(1).append("\n");
                } else sb.append(0).append("\n");
            }
            if (s.equals("front")) {
                if (queue.isEmpty()) {
                    sb.append(-1).append("\n");
                } else sb.append(queue.peek()).append("\n");
            }
            if (s.equals("back")) {
                if (queue.isEmpty()) {
                    sb.append(-1).append("\n");
                } else sb.append(queue.peekLast()).append("\n");
            }
        }
        System.out.println(sb);
    }
}
