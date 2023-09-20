package algo.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 중량제한 {

    private static List<List<Island>> islands = new ArrayList<>();
    private static boolean[] visited;
    private static boolean reachable;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 섬의 개수
        int M = Integer.parseInt(st.nextToken()); // 다리 개수
        for (int i = 0; i <= N; i++) {
            islands.add(new ArrayList<>());
        }

        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;

        for (int m = 0; m < M; m++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()); // 섬1
            int B = Integer.parseInt(st.nextToken()); // 섬2
            int C = Integer.parseInt(st.nextToken()); // 중량제한

            islands.get(A).add(new Island(B, C));
            islands.get(B).add(new Island(A, C));
            if (C < left) left = C;
            if (C > right) right = C;
        }

        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        while (left <= right) {
            int mid = (left + right) / 2;
            reachable = false;
            visited = new boolean[N + 1];

            bfs(start, end, mid);

            if (reachable) {
                left = mid + 1;
            } else right = mid - 1;
        }
        System.out.println(right);
    }

    private static void bfs(int start, int end, int standard) {
        if (start == end) {
            reachable = true;
            return;
        }
        visited[start] = true;
        for (Island island : islands.get(start)) {
            if (!visited[island.des] && standard <= island.limit) {
                bfs(island.des, end, standard);
            }
        }
    }
}

/*
 * 4 4
 * 1 4 100
 * 1 3 120
 * 1 2 2
 * 3 4 120
 * 1 4
 *
 * 2 2
 * 1 2 50
 * 1 2 100
 * 1 2
 */
class Island {
    int des;
    int limit;

    public Island(int des, int limit) {
        this.des = des;
        this.limit = limit;
    }
}
