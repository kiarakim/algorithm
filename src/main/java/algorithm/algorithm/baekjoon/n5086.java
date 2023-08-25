package algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n5086 {
    public static void main(String[] args) throws IOException {

        String factor = "factor\n";
        String multiple = "multiple\n";
        String neither = "neither\n";


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (A == 0 && B == 0) break;

            if (A % B == 0) {
                sb.append(multiple);
            } else if (B % A == 0) {
                sb.append(factor);
            } else {
                sb.append(neither);
            }
        }
        System.out.println(sb);
    }
}
