package algorithm.algorithm.programmers;

public class 덧칠하기 {
    public static void main(String[] args) {
        int n = 5;
        int m = 4;
        int[] section = {1,3};

        System.out.println(solution(n, m, section));
    }

    public static int solution(int n, int m, int[] section) {
        int answer = 0;
        int start = section[0];

        for (int point : section) {
            if (point < start) {
                continue;
            }
            if (point > start) {
                start = point;
            }
            answer++;
            start += m;
        }

        return answer;
    }
}
