package programmers;

public class 바탕화면정리 {
    public static void main(String[] args) {
        String[] wallpaper = {"..", "#."};
        int[] solution = solution(wallpaper);
        for (int i : solution) {
            System.out.print(i + ", ");
        }
    }

    public static int[] solution(String[] wallpaper) {

        char[][] map = new char[wallpaper.length][wallpaper[0].length()];
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                map[i][j] = wallpaper[i].charAt(j);
            }
        }

        int minX = 50;
        int minY = 50;
        int maxX = 0;
        int maxY = 0;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == '#') {
                    minX = Math.min(minX, i);
                    minY = Math.min(minY, j);
                    maxX = Math.max(maxX, i);
                    maxY = Math.max(maxY, j);
                }
            }

        }
        return new int[]{minX, minY, maxX + 1, maxY + 1};
    }
}
