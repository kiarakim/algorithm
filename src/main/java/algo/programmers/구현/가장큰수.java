package algo.programmers.구현;

import java.util.ArrayList;
import java.util.List;

// 정렬
public class 가장큰수 {

    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};
        System.out.println(solution(numbers));
    }

    public static String solution(int[] numbers) {
        List<String> list = new ArrayList<>();
        for (int number : numbers) {
            list.add(String.valueOf(number));
        }

        list.sort((a, b) -> {
            String order1 = a + b;
            String order2 = b + a;
            return order2.compareTo(order1);
        });

        String join = String.join("", list);
        if (join.startsWith("0")) return "0";
        return join;
    }
}
