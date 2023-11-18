package algo.leetcode;

import java.util.HashMap;
import java.util.Map;

public class n205_IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("add", "boo"));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            char value = t.charAt(i);
            if (map.containsKey(key)) {
                if (map.get(key) != value) return false;
            } else {
                if (map.containsValue(value)) return false;
                map.putIfAbsent(key, value);
            }
        }
        return true;
    }
}
