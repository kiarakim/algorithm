package algorithm.algorithm.programmers;

import java.util.HashSet;
import java.util.Set;

public class 대충만든자판 {
    public static void main(String[] args) {
        String[] keymap = {"AGZ", "BSSS"};
        String[] targets = {"ASA", "BGZ"};
        int[] solution = solution(keymap, targets);
        for (int i : solution) {
            System.out.print(i + ", ");
        }
    }

    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        Set<Character> alphabet = new HashSet<>();
        for (String each : keymap) {
            for (char c : each.toCharArray()) {
                alphabet.add(c);
            }
        }

        for (int i = 0; i < targets.length; i++) {
            int totalCount = 0;
            for (int j = 0; j < targets[i].length(); j++) {
                char dial = targets[i].charAt(j);
                if (!alphabet.contains(dial)) {
                    totalCount = -1;
                    break;
                }
                int count = 100;
                for (String key : keymap) {
                    for (int l = 0; l < key.length(); l++) {
                        if (key.charAt(l) == dial && count > l) {
                            count = l + 1;
                            break;
                        }
                    }
                }
                totalCount += count;
            }
            answer[i] = totalCount;
        }
        return answer;
    }
}
