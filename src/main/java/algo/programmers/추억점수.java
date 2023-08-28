package algo.programmers;

import java.util.HashMap;
import java.util.Map;

public class 추억점수 {
    public static void main(String[] args) {
        String[] names = {"may", "kein", "kain", "radi" };
        int[] yearning = {5, 10, 1, 3};
        String[][] photos = {{"may", "kein", "kain", "radi" }, {"may", "kein", "brin", "deny" }, {"kon", "kain", "may", "coni" }};
        int[] a = solution(names, yearning, photos);

        for (int i : a) {
            System.out.print(i + ", ");
        }
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String, Integer> yearn = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            yearn.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (String each : photo[i]) {
                if (!yearn.containsKey(each))
                    continue;
                sum += yearn.get(each);
            }
            answer[i] = sum;
        }
        return answer;
    }
}
