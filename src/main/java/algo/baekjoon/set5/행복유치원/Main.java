package algo.baekjoon.set5.행복유치원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] children = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            children[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer> group = new ArrayList<>();
        for (int i = 1; i < N; i++) {
            group.add(children[i] - children[i - 1]);
        }

        Collections.sort(group);

        int result = 0;
        for (int i = 0; i < N - K; i++) {
            result += group.get(i);
        }

        System.out.println(result);
    }
}
