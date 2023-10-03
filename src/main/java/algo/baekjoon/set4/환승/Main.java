package algo.baekjoon.set4.환승;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int N, K, M;
    private static List<Integer>[] stations, lines;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        stations = new ArrayList[N + 1]; // 각 역에 대한 노선
        lines = new ArrayList[M + 1];    // 각 노선에 대한 역

        for (int i = 0; i <= N; i++) {
            stations[i] = new ArrayList<>();
        }
        for (int i = 0; i <= M; i++) {
            lines[i] = new ArrayList<>();
        }
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int k = 0; k < K; k++) {
                int station = Integer.parseInt(st.nextToken());
                stations[station].add(i);
                lines[i].add(station);
            }
        }
        System.out.println(bfs());
    }

    private static int bfs() {
        if (N == 1) return 1;
        boolean[] vStation = new boolean[N + 1];
        boolean[] vLine = new boolean[M + 1];
        Queue<Station> q = new LinkedList<>();
        vStation[1] = true;
        for (int line : stations[1]) {
            vLine[line] = true;
            q.add(new Station(line, 1));
        }
        while (!q.isEmpty()) {
            Station s = q.poll();
            for (int station : lines[s.line]) {
                if (station == N) return s.move + 1;
                if (vStation[station]) continue;
                vStation[station] = true;
                for (int line : stations[station]) {
                    if (vLine[line]) continue;
                    vLine[line] = true;
                    q.add(new Station(line, s.move + 1));
                }
            }
        }
        return -1;
    }

    static class Station {
        int line;
        int move;

        public Station(int line, int move) {
            this.line = line;
            this.move = move;
        }
    }
}
