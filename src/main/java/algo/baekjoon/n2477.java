package algo.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n2477 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int maxHeight = 0, maxWidth = 0;
        int heightIdx = -1, widthIdx = -1;

        int[] dist = new int[6];

        int K = Integer.parseInt(br.readLine());
        for (int i = 0; i < 6; i++) {
            st = new StringTokenizer(br.readLine());
            int D = Integer.parseInt(st.nextToken());
            dist[i] = Integer.parseInt(st.nextToken());

            if (D == 1 || D == 2) {
                if (maxHeight < dist[i]) {
                    maxHeight = dist[i];
                    heightIdx = i;
                }
            } else {
                if (maxWidth < dist[i]) {
                    maxWidth = dist[i];
                    widthIdx = i;
                }
            }
        }
        int square = maxHeight * maxWidth;
        int minSquare = dist[(heightIdx + 3) % 6] * dist[(widthIdx + 3) % 6];

        System.out.println((square - minSquare) * K);
    }
}
