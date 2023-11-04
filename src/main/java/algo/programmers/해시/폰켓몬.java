package algo.programmers.해시;

import java.util.HashMap;
import java.util.Map;

public class 폰켓몬 {
    public static void main(String[] args) {
//        int[] nums = {3, 3, 3, 2, 2, 4};
//        int[] nums = {3,1,2,3};
        int[] nums = {3, 3, 3, 2, 2, 2};
        System.out.println(solution(nums));
    }

    public static int solution(int[] nums) {
        int half = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return Math.min(map.size(), half);
    }
}
