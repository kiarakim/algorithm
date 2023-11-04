package algo.programmers.구현;

import java.util.LinkedList;
import java.util.Queue;

public class 예상대진표 {
    public static void main(String[] args) {
        int n = 8;
        int a = 4;
        int b = 7;
        System.out.println(solution(n, a, b));
    }

    public static int solution(int n, int a, int b) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        int answer = 1;
        while (queue.size() >= 2) {
            Integer first = queue.poll();
            Integer second = queue.poll();

            if ((first == a && second == b) || (first == b && second == a)) {
                break;
            }
            if (first != a && second != a && first != b && second != b) {
                queue.add(first);
            }
            if (first == a || second == a) queue.add(a);
            if (first == b || second == b) queue.add(b);


            if (queue.size() == n / 2) {
                n /= 2;
                answer++;
            }
        }
        return answer;
//        int answer = 0;
//        int[] people = new int[N + 1];
//        for (int i = 1; i <= N; i++) {
//            people[i] = i;
//        }
//
//        int n = (int) Math.floor(Math.log(N) / Math.log(2));
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j < N; j++) {
//                if (j % 2 == 1 && people[j] == a) {
//                    if (people[j + 1] == b) {
//                        answer = i;
//                        break;
//                    }
//                    people[j / 2 + 1] = a;
//                    if (people[j] == b) people[j / 2 + 1] = b;
//                    people[j] = 0;
//                }
//                if (j % 2 == 0 && people[j] == a) {
//                    if (people[j - 1] == b) {
//                        answer = i;
//                        break;
//                    }
//                    people[j / 2] = a;
//                    if (people[j] == b) people[j / 2] = b;
//                    people[j] = 0;
//                }
//            }
//            N /= 2;
//        }
//        return answer;
    }
}
/*
1 2 3 4 5 6 7 8
1 2 3 4
1 2
만약 a가 홀수일때 오른쪽이 b라면 스탑
만약 a가 짝수일때 왼쪽이 b라면 스탑
 홀수면 오른쪽이랑 경쟁, 짝수면 왼쪽이랑 경쟁
 a가 짝수면 a/2번으로 가고, 홀수면 a/2+1번으로 간다

1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
1 2 3 4 5 6 7 8
1 2 3 4
1 2

2의 n승
 */
