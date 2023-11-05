package algo.programmers.스택큐;

import java.util.ArrayDeque;
import java.util.Deque;

public class 같은숫자는싫어 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        for (int i : solution(arr)) {
            System.out.print(i + " ");
        }

    }

    public static int[] solution(int[] arr) {
        Deque<Integer> q = new ArrayDeque<>();

        for (int num : arr) {
            if (!q.isEmpty() && q.peekLast() == num) continue;
            q.addLast(num);
        }

        return q.stream().mapToInt(i -> i).toArray();
    }
}
