package baekjoon;

/*
크루스칼 알고리즘
    간선의 가중치의 합이 최솟값이 되도록 모든 노드를 연결

    1. 간선 데이터를 오름차순 정렬
    2. 간선을 확인하며 현 간선이 사이클을 발생시키는지 확인
    3. 발생시키지 않으면 MST에 포함
    4. 모든 간선에 대해 반복한다.
*/

/*
프림 알고리즘
        시작 정점을 기준으로 가장 작은 간선과 연결된 정점을 선택하여 모든 노드를 연결

        1. 임의의 간선 선택
        2. 현 정점으로부터 가장 낮은 가중치를 갖는 정점 선택
        3. 모든 간선에 대해 반복한다.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1197 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int V = Integer.parseInt(st.nextToken());   // 정점
        int E = Integer.parseInt(st.nextToken());   // 간선

        for(int i=0;i<E;i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

        }
    }
}
