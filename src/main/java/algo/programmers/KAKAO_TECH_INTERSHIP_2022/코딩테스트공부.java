package algo.programmers.KAKAO_TECH_INTERSHIP_2022;

public class 코딩테스트공부 {
    public static void main(String[] args) {
        코딩테스트공부 clazz = new 코딩테스트공부();
        int alp = 10;
        int cop = 10;
        int[][] problem = {{10, 15, 2, 1, 2}, {20, 20, 3, 3, 4}};
        System.out.println(clazz.solution(alp, cop, problem));
    }

    public int solution(int alp, int cop, int[][] problems) {
        int al_goal = 0;
        int co_goal = 0;

        for (int[] problem : problems) {
            al_goal = Math.max(al_goal, problem[0]);
            co_goal = Math.max(co_goal, problem[1]);
        }

        if (al_goal <= alp && co_goal <= cop) return 0;
        if (al_goal <= alp) alp = al_goal;
        if (co_goal <= cop) cop = co_goal;

        int[][] dp = new int[al_goal + 2][co_goal + 2];

        for (int a = alp; a <= al_goal; a++) {
            for (int c = cop; c <= co_goal; c++) {
                dp[a][c] = Integer.MAX_VALUE;
            }
        }

        dp[alp][cop] = 0;

        for (int a = alp; a <= al_goal; a++) {
            for (int c = cop; c <= co_goal; c++) {
                dp[a + 1][c] = Math.min(dp[a + 1][c], dp[a][c] + 1);
                dp[a][c + 1] = Math.min(dp[a][c + 1], dp[a][c] + 1);

                for (int[] p : problems) {
                    if (a >= p[0] && c >= p[1]) { // if I can solve this problem
                        if (a + p[2] >= al_goal && c + p[3] >= co_goal) { // if I met the both goal
                            dp[al_goal][co_goal] = Math.min(dp[al_goal][co_goal], dp[a][c] + p[4]);
                        } else if (a + p[2] > al_goal) { // if I only met al_goal
                            dp[al_goal][c + p[3]] = Math.min(dp[al_goal][c + p[3]], dp[a][c] + p[4]);
                        } else if (c + p[3] > co_goal) { // if I met co_goal
                            dp[a + p[2]][co_goal] = Math.min(dp[a + p[2]][co_goal], dp[a][c] + p[4]);
                        } else dp[a + p[2]][c + p[3]] = Math.min(dp[a + p[2]][c + p[3]], dp[a][c] + p[4]);
                    }
                }
            }
        }

        return dp[al_goal][co_goal];
    }
}
