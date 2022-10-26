package baekjoon;

// [반복문] 영수증

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_25304 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());    // 총 금액
        int N = Integer.parseInt(br.readLine());    // 구매한 물건의 종류

        StringTokenizer st;

        int total = 0;  // 비교할 가격
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            total += (Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken())); // 금액 * 개수
        }
        if(total == X) System.out.println("Yes");
        else System.out.println("No");
    }
}
