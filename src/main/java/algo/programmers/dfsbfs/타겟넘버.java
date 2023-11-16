package algo.programmers.dfsbfs;

public class 타겟넘버 {

    private static int[] arr;
    private static int tar;
    private static int answer;

    public static void main(String[] args) {
        int[] numbers = {4, 1, 2, 1};
        tar = 4;
        System.out.println(solution(numbers, tar));
    }

    public static int solution(int[] numbers, int target) {
        arr = numbers;
        tar = target;
        dfs(0, 0);
        return answer;
    }

    private static void dfs(int idx, int sum) {
        if (idx == arr.length) {
            if (sum == tar) answer++;
        } else {
            dfs(idx + 1, sum + arr[idx]);
            dfs(idx + 1, sum - arr[idx]);
        }
    }
}
