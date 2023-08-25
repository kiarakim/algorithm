package algorithm.algorithm.programmers;

public class n120924 {
    public static void main(String[] args) {
        int[] common = {1,2,3,4};
        int result = solution(common);
        System.out.println(result);
    }

    public static int solution(int[] common) {
        int answer = 0;
        int commonLength = common.length;

        if ((common[1] - common[0]) == (common[2] - common[1])) {
            int difference = common[1] - common[0];
            answer = common[commonLength - 1] + difference;
        }

        else if ((common[1] / common[0]) == (common[2] / common[1])) {
            int ratio = common[1] / common[0];
            answer = common[commonLength - 1] * ratio;
        }
        return answer;
    }
}
