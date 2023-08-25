package algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String S = br.readLine() + "<";

        int bracketStartIndex = 0;
        int bracketEndIndex = 0;

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (c == '<') {
                bracketStartIndex = i;
                if (i == 0) {
                    continue;
                }
                String stringNotBracket;
                if (bracketEndIndex == 0) {
                    stringNotBracket = S.substring(bracketEndIndex, bracketStartIndex);
                } else stringNotBracket = S.substring(bracketEndIndex + 1, bracketStartIndex);
                sb.append(convertString(stringNotBracket));
            }

            if (c == '>') {
                bracketEndIndex = i;
                sb.append(S, bracketStartIndex, bracketEndIndex + 1);
            }
        }
        System.out.println(sb);
    }

    private static StringBuilder convertString(String stringNotBraket) {
        StringBuilder returnString = new StringBuilder();
        if (stringNotBraket.equals("")) {
            return returnString;
        }
        String[] splitedString = stringNotBraket.split(" ");
        for (String s : splitedString) {
            for (int i = s.length() - 1; i >= 0; i--) {
                returnString.append(s.charAt(i));
            }
            returnString.append(" ");
        }
        return returnString.deleteCharAt(returnString.length() - 1);
    }
}
