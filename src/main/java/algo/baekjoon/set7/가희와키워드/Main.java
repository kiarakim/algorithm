package algo.baekjoon.set7.가희와키워드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        Set<String> keywords = new HashSet<>();
        for (int i = 0; i < N; i++) {
            keywords.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            String[] split = br.readLine().split(",");
            for (int s = 0; s < split.length; s++) {
                keywords.remove(split[s]);
            }
            sb.append(keywords.size()).append('\n');
        }
        System.out.println(sb);
    }
}
