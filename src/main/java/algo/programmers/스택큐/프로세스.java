package algo.programmers.스택큐;

import java.util.Collections;
import java.util.PriorityQueue;

public class 프로세스 {
    public static void main(String[] args) {
//        int[] priorities = {2, 1, 3, 2};
        int[] priorities = {1, 1, 9, 1, 1, 1};
//        int location = 2;
        int location = 0;
        System.out.println(solution(priorities, location));
    }

    public static int solution(int[] priorities, int location) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int priority : priorities) {
            queue.add(priority);
        }
        int answer = 0;

        while (!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (queue.peek() == priorities[i]) { // 값이 같다면
                    queue.poll();
                    answer++;

                    if (i == location) return answer;
                }
            }
        }

        return answer;
    }
}
