package algo.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] height = new int[9];
        int sum = 0;
        int spyA = 0, spyB = 0;

        for (int i = 0; i < 9; i++) {
            height[i] = Integer.parseInt(br.readLine());
            sum += height[i];
        }

        Arrays.sort(height);

        for (int a = 0; a < height.length - 1; a++) {
            for (int b = a + 1; b < height.length; b++) {
                if (sum - height[a] - height[b] == 100) {
                    spyA = a;
                    spyB = b;
                    break;
                }
            }
        }

        for (int i = 0; i < height.length; i++) {
            if (i == spyA || i == spyB)
                continue;
            System.out.println(height[i]);
        }
    }
}
