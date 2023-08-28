package algo.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class n1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> noSeen = new HashSet<>();
        for (int i = 0; i < N; i++) {
            noSeen.add(br.readLine());
        }

        ArrayList<String> noSeenHeard = new ArrayList<>();
        for(int i=0;i<M;i++){
            String name = br.readLine();
            if(noSeen.contains(name)){
                noSeenHeard.add(name);
            }
        }

        Collections.sort(noSeenHeard);

        System.out.println(noSeenHeard.size());
        for (String str : noSeenHeard){
            System.out.println(str);
        }
    }
}
