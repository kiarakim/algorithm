package algo.programmers.구현;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 의상 {
    public static void main(String[] args) {
        String[][] clothes = {
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}
        };

//        String[][] clothes = {
//                {"a","A"},
//                {"aa","A"},
//                {"b","B"},
//                {"bb","B"},
//                {"bbb","B"},
//                {"c","C"},
//                {"cc","C"},
//                {"ccc","C"},
//                {"cccc","C"},
//                {"d","D"},
//                {"dd","D"},
//                {"ddd","D"}
//        };

//        String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        System.out.println(solution(clothes));
    }

    public static int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> map = new HashMap<>();

        for (String[] clothe : clothes) {
            map.put(clothe[1], map.getOrDefault(clothe[1], 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            answer *= entry.getValue() + 1;
        }

        return answer - 1;
    }
}
/*
A-a,aa
B-b,bb,bbb
C-c,cc,ccc
D-d,dd,ddd,dddd

1->12
2->2*(3+3+4) + 3*(3+4) + 3*(4)
3->(2*3)*(3+4) + (3*3) *4
4->(2*3*3)*4
 */
