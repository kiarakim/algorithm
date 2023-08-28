package algo.baekjoon;

// 최소비용 구하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class n1916 {
    static int N, M;
    static int start, end;
    static ArrayList<ArrayList<Node>> graph = new ArrayList<>();
    static int[] D;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());            // 도시
        M = Integer.parseInt(br.readLine());            // 버스

        D = new int[N + 1];                             // 1부터니까 N+1크기의 거리 배열 선언해준다.

        Arrays.fill(D, Integer.MAX_VALUE);              // 최소를 찾아야 하니까 최대로 초기화

        for (int i = 0; i < N + 1; i++) {
            graph.add(new ArrayList<>());               // graph 에 새로운 ArrayList 객체 추가
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());   // start 시작노드
            int idx = Integer.parseInt(st.nextToken()); // index  연결노드
            int c = Integer.parseInt(st.nextToken());   // cost  비용
            graph.get(s).add(new Node(idx, c));         // 시작노드의 공간에 연결노드로 가는 비용 저장
        }

        st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());       // 시작노드
        end = Integer.parseInt(st.nextToken());         // 끝노드

        dijkstra();

        System.out.println(D[end]);
    }

    static void dijkstra() {
        PriorityQueue<Node> pq = new PriorityQueue<>(); // Node 형 자료가 들어있는 우선순위 큐 객체 생성
        pq.offer(new Node(start, 0));           // 큐에 맨 처음 시작 노드저장. 처음 노드에서 처음으로 가는 비용은 0.
        D[start] = 0;                                   // 처음 노드에서 처음으로 가는 비용은 0.

        while (!pq.isEmpty()) {                         // 큐에 Node 객체가 남아 있을 때까지
            Node node = pq.poll();                      // 맨 위의 노드를 node 라고 하자
            int now = node.index;                       // 이제 살펴볼 연결 노드를 now 에 저장
            int dist = node.distance;                   // now 와의 거리

            if(D[now] < dist) continue;                 // 갱신된 거리가 now 와의 거리보다 더 짧으면 패스

            for(Node next : graph.get(now)){            // now 와 연결된 노드들을 차례로 next 라 부를건데
                if (D[now] + next.distance < D[next.index]) {   // now 까지의 거리와, now 와 next 사이의 거리 합이 next 의 최소 거리보다 짧으면
                    D[next.index] = D[now] + next.distance;     // 최소 거리를 갱신
                    pq.add(new Node(next.index, D[next.index]));// next 의 인덱스와 최신 거리를 큐에 저장
                }
            }
        }
    }

    static class Node implements Comparable<Node> {
        int index;
        int distance;

        public Node(int index, int distance) {
            this.index = index;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node o) {
            return distance - o.distance;
        }
    }
}
