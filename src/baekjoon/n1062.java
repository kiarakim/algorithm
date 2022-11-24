package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1062 {
    public static int N, K;
    public static String[] S;
    public static boolean[] visited;
    public static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        S = new String[N];
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            S[i] = word.substring(4, word.length() - 4);
        }

        if (K < 5) {
            System.out.println(0);
            return;
        } else if (K == 26) {
            System.out.println(N);
            return;
        }

        visited = new boolean[26];
        visited['a' - 'a'] = true;
        visited['n' - 'a'] = true;
        visited['t' - 'a'] = true;
        visited['i' - 'a'] = true;
        visited['c' - 'a'] = true;


        dfs(0, 0);

        System.out.println(answer);
    }

    public static void dfs(int alpha, int count) {
        if (count == K - 5) {
            int temp = 0;
            for (int i = 0; i < N; i++) {
                boolean flag = true; // 이 단어는 배울 수 있겠지?

                for (int j = 0; j < S[i].length(); j++) {
                    if (visited[S[i].charAt(j) - 'a']) continue; // 가르칠 수 있는 글자면 넘어가
                    flag = false;   // 아니면 이 단어 못 배운다.
                    break;
                }
                if (flag) temp++;   // 배울 수 있는 단어 ++
            }
            answer = Math.max(temp, answer);    // 최대로 배울 수 있는 단어 개수
            return;
        }

        for (int i = alpha; i < 26; i++) {
            if (visited[i]) continue;
            visited[i] = true;  // 가르칠 수 있는 글자
            dfs(i, count + 1);
            visited[i] = false;
        }
    }
}
