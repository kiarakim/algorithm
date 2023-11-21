package algo.programmers.KAKAO_TECH_INTERSHIP_2022;

import java.util.LinkedList;
import java.util.Queue;

public class 두큐합같게만들기 {
    public static void main(String[] args) {
        두큐합같게만들기 clazz = new 두큐합같게만들기();
        int[] queue1 = {1, 1, 1, 2};
        int[] queue2 = {7, 7, 7, 4};
        System.out.println(clazz.solution(queue1, queue2));
    }

    public int solution(int[] queue1, int[] queue2) {
        // 두큐의 총합을 구해야 함.
        // 홀수면 -1리턴
        long total = 0;
        long sum1 = 0;
        long sum2 = 0;
        Queue<Integer> q1 = new LinkedList<>();
        for (int i : queue1) {
            q1.add(i);
            sum1 += i;
            total += i;
        }
        Queue<Integer> q2 = new LinkedList<>();
        for (int i : queue2) {
            q2.add(i);
            sum2 += i;
            total += i;
        }
        if (total % 2 == 1) return -1;

        int answer = 0;
        while (sum1 != sum2) {
            if (answer > queue1.length * 4) return -1;

            if (sum1 > sum2) {
                Integer num = q1.poll();
                q2.add(num);
                sum1 -= num;
                sum2 += num;
                answer++;
            } else {
                Integer num = q2.poll();
                q1.add(num);
                sum1 += num;
                sum2 -= num;
                answer++;
            }
        }
        return answer;
    }
}
