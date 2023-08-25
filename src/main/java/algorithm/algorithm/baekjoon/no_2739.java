package algorithm.algorithm.baekjoon;
// [반복문] 구구단
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_2739 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= 9; i++) {
            sb.append(N).append(" * ").append(i).append(" = ");
            int s = N * i;
            sb.append(s).append('\n');
        }
        System.out.println(sb);
    }
}
