package algo.programmers.KAKAO_MOBILITY;

public class n1 {
    public static void main(String[] args) {
        n1 sol = new n1();
        int[][] flowers = {
                {2, 5}, {3, 7}, {10, 11}
        };
        System.out.println(sol.solution(flowers));
    }

    public int solution(int[][] flowers) {
        int answer = 0;

        int[] days = new int[366];

        for (int[] season : flowers) {
            for (int i = season[0]; i < season[1]; i++) {
                days[i] = 1;
            }
        }

        for (int day : days) {
            if (day == 1)
                answer++;
        }
        return answer;
    }
}
