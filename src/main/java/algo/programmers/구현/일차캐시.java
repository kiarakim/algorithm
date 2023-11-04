package algo.programmers.구현;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

// 2018 KAKAO BLIND RECRUITMENT
public class 일차캐시 {
    public static void main(String[] args) {
//        int cacheSize = 3;
        int cacheSize = 5;
//        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
//        String[] cities = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};

        System.out.println(solution(cacheSize, cities));
    }

    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if (cacheSize == 0) return 5 * cities.length;
        List<String> list = new ArrayList<>();
        for (String c : cities) {
            String city = c.toUpperCase();
            if (list.remove(city)) {
                answer += 1;
                list.add(city);
            } else {
                answer += 5;
                if (list.size() == cacheSize) {
                    list.remove(0);
                }
                list.add(city);
            }
        }
        return answer;
    }
}
