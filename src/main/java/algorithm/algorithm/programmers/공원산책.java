package algorithm.algorithm.programmers;

public class 공원산책 {
    public static void main(String[] args) {
        String[] park = {"OSO", "OOO", "OXO", "OOO" };
        String[] routes = {"E 2", "S 3", "W 1" };

        int[] solution = solution(park, routes);

        System.out.println(solution[0] + ", " + solution[1]);
    }

    public static int[] solution(String[] park, String[] routes) {
        int startX = 0;
        int startY = 0;

        char[][] map = new char[park.length][park[0].length()];

        for (int i = 0; i < park.length; i++) {
            map[i] = park[i].toCharArray();

            if (park[i].contains("S")) {
                startY = i;
                startX = park[i].indexOf("S");
            }
        }

        for (String route : routes) {
            String way = route.split(" ")[0];
            int len = Integer.parseInt(route.split(" ")[1]);

            int nowX = startX;
            int nowY = startY;

            for (int i = 0; i < len; i++) {
                if (way.equals("E")) {
                    nowX++;
                }
                if (way.equals("W")) {
                    nowX--;
                }
                if (way.equals("S")) {
                    nowY++;
                }
                if (way.equals("N")) {
                    nowY--;
                }
                if (nowX >= 0 && nowY >= 0 && nowY < map.length && nowX < map[0].length) {
                    if (map[nowY][nowX] == 'X') {
                        break;
                    }
                    if (i == len - 1) {
                        startX = nowX;
                        startY = nowY;
                    }
                }
            }
        }

        int[] answer = {startY, startX};
        return answer;
    }
}
