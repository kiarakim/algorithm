import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Solution {

	static StringBuilder sb = new StringBuilder();
	static int N, M;
	static int[][] graph;
	static boolean[] visited;

	static void dfs(int now) {

		visited[now] = true;
		sb.append(now + " ");

		for (int i = 0; i <= N; i++) {
			if (visited[i])
				continue;
			if (graph[now][i] == 1)
				dfs(i);
		}

	}

	static void bfs(int now) {

		Queue<Integer> myQueue = new LinkedList<>();

		myQueue.add(now);
		visited[now] = true;

		while (!myQueue.isEmpty()) {

			now = myQueue.poll();
			sb.append(now + " ");

			for (int i = 0; i <= N; i++) {
				if (visited[i])
					continue;
				if (graph[now][i] == 1) {
					myQueue.add(i);
					visited[i] = true;
				}
			}
		}
	}

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());

		graph = new int[N + 1][N + 1];
		visited = new boolean[N + 1];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			graph[u][v] = graph[v][u] = 1;
		}

		dfs(V);
		sb.append('\n');

		visited = new boolean[N + 1];
		bfs(V);

		System.out.println(sb);

	}
}
