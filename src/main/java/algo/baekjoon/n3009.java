package algo.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class n3009 {
    public static int x, y;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Map<Integer, Integer> xCnt = new HashMap<>();
        Map<Integer, Integer> yCnt = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            xCnt.put(x, xCnt.getOrDefault(x, 0) + 1);
            yCnt.put(y, yCnt.getOrDefault(y, 0) + 1);
        }

        for (int xC : xCnt.keySet()) {
            if (xCnt.get(xC) == 1) x = xC;
        }

        for (int yC : yCnt.keySet()) {
            if (yCnt.get(yC) == 1) y = yC;
        }

        System.out.println(x + " " + y);
    }
}
