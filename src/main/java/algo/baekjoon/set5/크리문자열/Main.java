package algo.baekjoon.set5.크리문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        int length = S.length();
        int half = length / 2;
        int maxCr = 0;
        for (int i = 1; i <= half; i++) {
            for (int startIdx = 0; startIdx <= length - (i * 2); startIdx++) {
                int front = sum(S.substring(startIdx, startIdx + i));
                int back = sum(S.substring(startIdx + i, startIdx + (i * 2)));

                if (front == back) {
                    maxCr = Math.max(maxCr, i * 2);
                    break;
                }
            }
        }
        System.out.println(maxCr);
    }

    private static int sum(String sub) {
        int sum = 0;
        String[] split = sub.split("");
        for (int i = 0; i < split.length; i++) {
            sum += Integer.parseInt(split[i]);
        }
        return sum;
    }
}
