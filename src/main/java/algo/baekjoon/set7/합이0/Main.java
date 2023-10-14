package algo.baekjoon.set7.합이0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private static int[] skills;
    private static long count = 0l;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        skills = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            skills[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(skills);

        for (int i = 0; i < N; i++) {
            if (skills[i] > 0) break;
            int start = i + 1;
            int end = N - 1;

            while(start < end){
                int s = 1;
                int e = 1;
                int sum = skills[i] + skills[start] + skills[end];
                if (sum == 0) {
                    if (skills[start] == skills[end]) {
                        int gap = end - start + 1;
                        count += (long) gap * (gap - 1) / 2;
                        break;
                    }
                    while(start + 1 < end && skills[start] == skills[start + 1]){
                        s++;
                        start++;
                    }
                    while(start < end - 1 && skills[end] == skills[end-1]){
                        e++;
                        end--;
                    }
                    count += (long) s * e;
                }
                if(sum > 0) end--;
                else start++;
            }
        }
        System.out.println(count);
    }
}

/*
-6 -5 -4 -4
0 1 2 2 3 7
 */
