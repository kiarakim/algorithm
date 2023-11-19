package algo.programmers.KAKAO_TECH_INTERSHIP_2022;

public class 성격유형검사하기 {
    public static void main(String[] args) {
//        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        String[] survey = {"TR", "RT", "TR"};
//        int[] choices = {5, 3, 2, 7, 5};
        int[] choices = {7, 1, 3};
        System.out.println(solution(survey, choices));
    }

    public static String solution(String[] survey, int[] choices) {
        // RT - CF - JM - AN
        String part = "RTCFJMAN";
        int[] parts = new int[8];
        for (int i = 0; i < survey.length; i++) {
            int score = 0;
            int index = 0;

            if (choices[i] < 4) {
                score = 4 - choices[i]; // 1점
                index = part.indexOf(survey[i].charAt(0));
            } else if (choices[i] > 4) {
                score = choices[i] - 4;
                index = part.indexOf(survey[i].charAt(1));
            }
            parts[index] += score;
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i <= 6; i += 2) {
            if (parts[i] < parts[i + 1]) {
                answer.append(part.charAt(1 + i));
            } else {
                answer.append(part.charAt(0 + i));
            }
        }
        return answer.toString();
    }
}
// 1->3
// 2->2
// 3->1
// 4->0
// 5->1
// 6->2
// 7->3
