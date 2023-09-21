package algo.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 물건팔기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] money = new int[N][2];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            money[i][0] = Integer.parseInt(st.nextToken());
            money[i][1] = Integer.parseInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE;
        int person = 0;
        int lowest_price = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < N; i++) {
            sum = 0;
            int price = money[i][0];
            for (int j = 0; j < N; j++) {
                if (price > money[j][0]) continue;
                if (price <= money[j][1]) continue;
                sum += price;
                sum -= money[j][1];
            }
            if (sum == 0) continue;
            count++;
            if (sum == max) {
                if (price < lowest_price) {
                    person = i;
                    lowest_price = price;
                }
            }
            if (sum > max) {
                max = sum;
                person = i;
                lowest_price = price;
            }
        }
        if (count == 0) {
            System.out.println(0);
        } else System.out.println(money[person][0]);
    }
}
