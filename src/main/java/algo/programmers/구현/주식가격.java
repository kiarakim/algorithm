package algo.programmers.구현;

public class 주식가격 {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        int[] solution = solution(prices);
        for (int i = 0; i < solution.length; i++) {
            System.out.print(solution[i] + ", ");
        }
    }

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] >= prices[i]) {
                    answer[i]++;
                } else {
                    answer[i]++;
                    break;
                }
            }
        }

        return answer;
    }
}
