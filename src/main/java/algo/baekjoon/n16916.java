package algo.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n16916 {
    public static String S, P;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        S = br.readLine();
        P = br.readLine();

        System.out.println(KMP(S, P));
    }

    static int KMP(String S, String P) {
        int[] table = getTable(P);
        int j = 0;
        for (int i = 0; i < S.length(); i++) {
            while (j > 0 && S.charAt(i) != P.charAt(j)) {
                j = table[j - 1];
            }
            if (S.charAt(i) == P.charAt(j)) {
                if (j == P.length() - 1) return 1;
                else j++;
            }
        }
        return 0;
    }

    static int[] getTable(String P) {
        int[] table = new int[P.length()];
        int j = 0;
        for (int i = 1; i < P.length(); i++) {
            while (j > 0 && P.charAt(i) != P.charAt(j)) {
                j = table[j - 1];
            }
            if (P.charAt(i) == P.charAt(j)) {
                table[i] = ++j;
            }
        }
        return table;
    }
}
