package algo.programmers.구현;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 전화번호목록 {
    public static void main(String[] args) {
//        String[] phone_book = {"119", "97674223", "1195524421"};
        String[] phone_book = {"123","456","789"};
//        String[] phone_book = {"12", "123", "1235", "567", "88"};
        System.out.println(solution(phone_book));
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

//        for (int i = 0; i < phone_book.length; i++) {
//            for (int j = 0; j < phone_book.length; j++) {
//                if (i == j) continue;
//                if (phone_book[j].startsWith(phone_book[i])) return false;
//            }
//        }

        List<String> list = Arrays.asList(phone_book);
        list.sort(Comparator.naturalOrder());

        int a = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if(list.get(j).startsWith(list.get(i))) return false;
                break;
            }
        }

        return answer;
    }
}
