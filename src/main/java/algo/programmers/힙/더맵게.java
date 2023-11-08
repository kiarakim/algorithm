package algo.programmers.힙;

import java.util.PriorityQueue;

public class 더맵게 {

    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        System.out.println(solution(scoville, K));
    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        Integer one;
        Integer two;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int s : scoville) {
            queue.add(s);
        }

        while (queue.peek() < K) {
            if (queue.size() < 2) {
                return -1;
            } else {
                one = queue.poll();
                two = queue.poll();

                one += (two * 2);
                queue.offer(one);
                answer += 1;
            }
        }
        return answer;
    }
}
