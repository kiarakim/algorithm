package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class n1700 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] name = new int[K];
        boolean[] visited = new boolean[101];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < K; i++) {
            int one = Integer.parseInt(st.nextToken());
            name[i] = one;
        }

        int done = 0;
        int count = 0;
        for (int i = 0; i < K; i++) {                               // 7개를 돌면서
            int now = name[i];                                      // 현재 기기의 이름을 now 에 저장하고

            if (visited[now]) continue;                             // now 가 꽂혀 있으면 패스

            if (done < N) {                                         // 콘센트가 남으면 = 꽂힌게 2보다 작으면
                visited[now] = true;                                // now 를 꽂고
                done++;                                             // 남은 개수 차감. 즉, 끼워놓은 개수 증가
            } else {                                                // 콘센트 꽉 찼으면 빼줘야지

                ArrayList<Integer> list = new ArrayList<>();        //나중에 사용될 애들 저장하는 공간
                for (int j = i; j < K; j++) {                       // now 부터 끝까지 돌면서
                    if (visited[name[j]] && !list.contains(name[j]))// 꽂혀 있는 것들 중 나중에 사용되면
                        list.add(name[j]);                          // list 에다 추가
                }

                if (list.size() == N) {                             // 지금 꽂혀있는 것들이 전부 다음에 사용된다면
                    int remove = list.get(list.size() - 1);         // 가장 나중에 사용될 콘센트를
                    visited[remove] = false;                        // 빼버린다.
                } else {                                            // 지금 꽂혀있는 것들 중 몇개만 사용된다면
                    for (int j = 1; j < K; j++) {                   // 두번째부터 마지막 아름까지 확인하면서
                        if (visited[j] && !list.contains(j)) {      // 꼽힌 것들 중 나중에 사용 안하면
                            visited[j] = false;                     // 빼고
                            break;
                        }
                    }
                }
                visited[now] = true;                                // now 를 꽂고
                count++;                                            // count 증가
            }
        }
        System.out.println(count);
    }
}
