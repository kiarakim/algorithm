package algo.programmers.스택큐;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class 기능개발 {
    public static void main(String[] args) {
//        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] progresses = {93, 30, 55};
//        int[] speeds = {1, 1, 1, 1, 1, 1};
        int[] speeds = {1, 30, 5};
        for (int i : solution(progresses, speeds)) {
            System.out.print(i + " ");
        }
    }

    /*
    뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고, 이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.
    100까지 남은 진도 / 스피드가 정확하게 나눠떨어지면 값, 아니면 +1
    5 / 10 / 1 / 1 / 20 / 1
    6 / 4 / 3 / 7
    앞이 뒤보다 작으면 배포,
    앞이 뒤보다 크면 작은게 나오기 전까지 모아서 한 번에 배포
     */
    public static int[] solution(int[] progresses, int[] speeds) {
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < progresses.length; i++) {
            int day = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0) {
                day++;
            }
            q.addLast(day);
        }
        int count = 1;
        int now = q.pop();
        List<Integer> list = new ArrayList<>();

        while (!q.isEmpty()) {
            Integer next = q.pop();
            if (now < next) {
                list.add(count);
                now = next;
                count = 1;
            } else {
                count++;
            }
        }
        list.add(count);
        return list.stream().mapToInt(i -> i).toArray();
    }
}
