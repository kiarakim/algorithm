package algo.programmers.해시;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class 베스트앨범 {

    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        int[] solution = solution(genres, plays);
        for (int i : solution) {
            System.out.println(i);
        }
    }

    public static int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        List<String> orderGenres = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            orderGenres.add(entry.getKey());
        }

        List<Music> best = new ArrayList<>();
        for (String genre : orderGenres) {
            List<Music> genreBest = new ArrayList<>();
            for (int i = 0; i < genres.length; i++) {
                if (genres[i].equals(genre)) {
                    genreBest.add(new Music(genre, plays[i], i));
                }
            }
            genreBest.sort((s1, s2) -> s2.play - s1.play);
            best.add(genreBest.get(0));
            if (genreBest.size() != 1) {
                best.add(genreBest.get(1));
            }
        }

        return best.stream()
                .mapToInt(b -> b.index)
                .toArray();
    }

    static class Music {
        String genre;
        int play;
        int index;

        public Music(String genre, int play, int index) {
            this.genre = genre;
            this.play = play;
            this.index = index;
        }
    }
}
