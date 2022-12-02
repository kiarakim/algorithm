package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n3053 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double r = Double.parseDouble(br.readLine());

        double e = printEuclid(r);
        double t = printTaxi(r);

        System.out.printf("%.6f\n", e);
        System.out.printf("%.6f\n", t);
    }

    public static double printEuclid(double r) {
        return Math.PI * r * r;
    }

    public static double printTaxi(double r) {
        return 2 * r * r;
    }
}
