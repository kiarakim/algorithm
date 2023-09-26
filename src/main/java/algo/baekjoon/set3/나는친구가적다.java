package algo.baekjoon.set3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class 나는친구가적다 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();
        String keyword = br.readLine();

        for (int i = 0; i < sentence.getBytes().length; i++) {
            char c = sentence.charAt(i);
            if ((c < 65 || c > 123) || (c > 90 && c < 97)) {
                sentence = sentence.replace(c, ' ');
            }
        }

        sentence = sentence.replace(" ", "");
        if (sentence.contains(keyword)) {
            System.out.println(1);
        } else System.out.println(0);
    }
}
