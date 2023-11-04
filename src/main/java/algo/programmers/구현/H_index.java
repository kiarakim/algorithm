package algo.programmers.구현;

import java.util.Arrays;

// 정렬
public class H_index {
    public static void main(String[] args) {
        int[] citations = {6, 5, 5, 5, 3, 2, 1, 0};
        System.out.println(solution(citations));
    }

    public static int solution(int[] citations) {
        //어떤 과학자가 발표한 논문 n편 중,
        // h번 이상 인용된 논문이 h편 이상이고
        // 나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 이 과학자의 H-Index입니다.
        int answer = 0;
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;

            if(citations[i] >= h){
                answer = h;
                break;
            }
        }
        return answer;
    }
}
