package algo.programmers.dfsbfs;

public class 네트워크 {
    static boolean[] visited;
    static int n;

    public static void main(String[] args) {
        n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(solution(n, computers));
    }

    public static int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                answer++;
                dfs(i, computers);
            }
        }
        return answer;
    }

    private static void dfs(int now, int[][] computers) {
        visited[now] = true;

        for (int i = 0; i < computers.length; i++) {
            if (!visited[i] && computers[now][i] == 1) {
                dfs(i, computers);
            }
        }
    }
}
