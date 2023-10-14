package algo.baekjoon.set7.일이삼더하기4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int[] a = new int[10001];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        make();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            sb.append(a[Integer.parseInt(br.readLine())]).append('\n');
        }
        System.out.println(sb);
    }

    private static void make() {
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        for (int i = 4; i < 10001; i++) {
            a[i] = 1 + i / 2 + a[i - 3];
        }
    }
}
/*
1+1+1+1
2+1+1 (1+1+2, 1+2+1)
2+2
1+3 (3+1)

2(짝
1+1
2

3(홀+1=2
(1+1)+1 int[10001][4]
(2)+1
3

4(짝+2=4
(1+1+1)+1
(2+1)+1
2+2
3+1

5(홀+1=5
(1+1+1+1)+1
(2+1+1)+1
(2+2)+1
(3+1)+1
3+2

6(짝+2=7
(1+1+1+1+1)+1
(2+1+1+1)+1
(2+2+1)+1
2+2+2
(3+1+1)+1
(3+2)+1
3+3

7(홀+1=8
(1+1+1+1+1+1)+1
(2+1+1+1+1)+1
(2+2+1+1)+1
(2+2+2)+1
(3+1+1+1)+1
(3+2+1)+1
3+2+2
(3+3)+1

8(+2=10
(1+1+1+1+1+1+1)+1
(2+1+1+1+1+1)+1
(2+2+1+1+1)+1
(2+2+2+1)+1
2+2+2+2
(3+1+1+1+1)+1
(3+2+1+1)+1
(3+2+2)+1
(3+3+1)+1
3+3+2

9
(1+1+1+1+1+1+1+1)+1
(2+1+1+1+1+1+1)+1
(2+2+1+1+1+1)+1
(2+2+2+1+1)+1
(2+2+2+2)+1
(3+1+1+1+1+1)+1
(3+2+1+1+1)+1
(3+2+2+1)+1
3+2+2+2
(3+3+1+1)+1
(3+3+2)+1
3+3+3

10
(1+1+1+1+1+1+1+1+1)+1
(2+1+1+1+1+1+1+1)+1
(2+2+1+1+1+1+1)+1
(2+2+2+1+1+1)+1
(2+2+2+2+1)+1
2+2+2+2+2
(3+1+1+1+1+1+1)+1
(3+2+1+1+1+1)+1
(3+2+2+1+1)+1
(3+2+2+2)+1
(3+3+1+1+1)+1
(3+3+2+1)+1
3+3+2+2
(3+3+3)+1
 */
