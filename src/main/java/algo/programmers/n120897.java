package algo.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class n120897 {
    public static void main(String[] args) {
        n120897 sol = new n120897();
        int n = 24;
        System.out.println(Arrays.toString(sol.solution(n)));
    }

    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        int N = 1;

        while (N <= n) {
            if (n % N == 0) {
                list.add(N);
            }
            N++;
        }

        return list.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}
