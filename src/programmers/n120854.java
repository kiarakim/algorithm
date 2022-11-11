package programmers;

import java.util.Arrays;

public class n120854 {
    public static void main(String[] args) {
        n120854 sol = new n120854();
        String[] stringL = {"We", "are", "the", "world!"};
        System.out.println(Arrays.toString(sol.solution(stringL)));
    }

    public int[] solution(String[] stringL) {
        int strLen = stringL.length;
        int[] answer = new int[strLen];
        int index = 0;

        for (String str : stringL) {
            int len = str.length();
            answer[index] = len;
            index++;
        }

        return answer;
    }
}
