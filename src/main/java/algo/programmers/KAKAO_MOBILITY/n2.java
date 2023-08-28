package algo.programmers.KAKAO_MOBILITY;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class n2 {
    public static void main(String[] args) {
        n2 sol = new n2();
        String[] id_list = {
                "J", "J E J M ", "M E M", "E M", "E E E", "M"
        };
        int k = 3;
        System.out.println(sol.solution(id_list, k));
    }

    public int solution(String[] id_list, int k) {
        String[][] id = new String[id_list.length][];
        id = getId(id, id_list);

        HashMap<String, Integer> map = new HashMap<>();
        map = getHash(map, id);

        return getCount(map, k);
    }

    public String[][] getId(String[][] id, String[] id_list) {
        for (int i = 0; i < id_list.length; i++) {
            id[i] = id_list[i].split(" ");
            Set<String> set = new HashSet<>(Arrays.asList(id[i]));
            id[i] = set.toArray(new String[0]);
        }
        return id;
    }

    public HashMap<String, Integer> getHash(HashMap<String, Integer> map, String[][] id) {
        map = new HashMap<>();
        for (String[] ids : id) {
            for (String name : ids) {
                map.put(name, map.getOrDefault(name, 0) + 1);
            }
        }
        return map;
    }

    public int getCount(HashMap<String,Integer> map, int k) {
        int count = 0;
        for (String name : map.keySet()) {
            if (map.get(name) >= k)
                count += k;
            else {
                count += map.get(name);
            }
        }
        return count;
    }
}
