package algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class n1620 {
    public static Map<Integer, String> intFirst = new HashMap<>();
    public static Map<String, Integer> strFirst = new HashMap<>();

    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            intFirst.put(i, name);
            strFirst.put(name, i);
        }

        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            if (isNumeric(input)) {
                int key = Integer.parseInt(input);
                sb.append(intFirst.get(key)).append('\n');

            } else {
                sb.append(strFirst.get(input)).append('\n');
            }
        }
        System.out.println(sb);
    }


    public static boolean isNumeric(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i)))
                return false;
        }
        return true;
    }

}
