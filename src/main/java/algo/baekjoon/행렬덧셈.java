package algo.baekjoon;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 행렬덧셈 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][M];

        for (int i = 0; i < 2; i++) {
            for (int y = 0; y < N; y++) {
                st = new StringTokenizer(br.readLine());
                for (int x = 0; x < M; x++) {
                    map[y][x] += Integer.parseInt(st.nextToken());
                }
            }
        }

        for(int y=0;y<N;y++){
            for(int x=0;x<M;x++){
                sb.append(map[y][x]).append(' ');
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
