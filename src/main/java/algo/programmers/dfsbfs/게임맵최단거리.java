package algo.programmers.dfsbfs;

public class 게임맵최단거리 {

    private static int[] dr = {0, 0, 1, -1};
    private static int[] dc = {1, -1, 0, 0};
    private static boolean[][] visited;

    public static void main(String[] args) {
        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        System.out.println(solution(maps));
    }

    public static int solution(int[][] maps) {
        visited = new boolean[maps.length][maps[0].length];
        int answer = 0;

        dfs(maps, 0, 0);

        return answer;
    }

    private static void dfs(int[][] maps, int row, int col) {
        if (row == maps.length - 1 && col == maps[0].length - 1) {
            return;
        }
    }
}
