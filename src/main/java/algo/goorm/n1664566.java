package algo.goorm;

//알고리즘-먼데이-챌린지
//복습문제-1-단어장-만들기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class n1664566 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String[] dic = new String[n];

        for (int i = 0; i < n; i++) {
            dic[i] = br.readLine();
        }

        Arrays.sort(dic, Comparator.comparingInt(String::length));
        System.out.println(dic[k - 1]);
    }
}
