package algo.programmers;

public class n77485 {
    public static void main(String[] args) {
        int rows = 6;
        int columns = 6;
        int[][] queries = {{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}};

        n77485 sol = new n77485();
        int[] answer = sol.solution(rows, columns, queries);

    }

    public int[] solution(int rows, int columns, int[][] queries) {
        int len = queries.length;
        int[] answer = new int[len];
        int[][] grid = new int[rows][columns];

        int idx = 1;
        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < columns; x++) {
                grid[y][x] = idx++;
            }
        }


        for (int l = 0; l < len; l++) {
            int min = Integer.MAX_VALUE;
            int[] query = queries[l];
            int total = ((query[2]-query[0]) + (query[3]-query[1])) * 2;

            int temp = grid[query[0] - 1][query[1] - 1];



            answer[l] = min;
        }

        return answer;
    }
}
