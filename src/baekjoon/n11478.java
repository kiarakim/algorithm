package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class n11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int len = S.length();

        Set<String> set = new HashSet<>();

        for (int i = 1; i <= len; i++) {
            for (int j = 0; j <= len - i; j++) {
                String str = S.substring(j, j + i);
                set.add(str);
            }
        }

        System.out.println(set.size());
    }
}
