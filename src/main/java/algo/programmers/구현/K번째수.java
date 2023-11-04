package algo.programmers.구현;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// 정렬
public class K번째수 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] solution = solution(array, commands);
        for (int i : solution) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        List<Integer> list = new ArrayList<>();
        for (int a : array) {
            list.add(a);
        }

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int index = commands[i][2];

            List<Integer> temp = new ArrayList<>(list.subList(start - 1, end));
            temp.sort(Comparator.naturalOrder());

            answer[i] = temp.get(index - 1);
        }

        return answer;
    }

}
