package programmers;

import java.util.HashMap;

public class 달리기경주 {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine" };
        String[] callings = {"kai", "kai", "mine", "mine" };

        String[] answer = solution(players, callings);

        for (String s : answer) {
            System.out.println(s);
        }
    }

    public static String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];

        HashMap<String, Integer> playersMap = new HashMap<>();
        HashMap<Integer, String> ranksMap = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            playersMap.put(players[i], i);
            ranksMap.put(i, players[i]);
        }

        for (String calling : callings) {
            int callingRank = playersMap.get(calling);
            String front = ranksMap.get(callingRank - 1);

            ranksMap.put(callingRank, front);
            ranksMap.put(callingRank - 1, calling);

            playersMap.put(calling, callingRank - 1);
            playersMap.put(front, callingRank);
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = ranksMap.get(i);
        }

        return answer;
    }
}
