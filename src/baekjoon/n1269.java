package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class n1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            int num = Integer.parseInt(st.nextToken());
            setA.add(num);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++) {
            int num = Integer.parseInt(st.nextToken());
            setB.add(num);
        }

        int ans = 0;
        for(int a : setA){
            if(!setB.contains(a))
                ans++;
        }

        for(int b : setB){
            if(!setA.contains(b))
                ans++;
        }

        System.out.println(ans);
    }
}
