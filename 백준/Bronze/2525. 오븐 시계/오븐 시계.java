import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main (String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(br.readLine());
		
		H += T / 60;
		M += T % 60;
		
		if(M >= 60) {
			H += 1;
			M -= 60;
		}
		if(H >= 24)
			H -= 24;
		
		System.out.println(H + " " + M);
		
	}
}