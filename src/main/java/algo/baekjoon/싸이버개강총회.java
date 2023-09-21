package algo.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class 싸이버개강총회 {

    private static int startConference;
    private static int endConference;
    private static int endStreaming;
    private static Set<String> startStudents = new HashSet<>();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        startConference = getTime(st.nextToken());
        endConference = getTime(st.nextToken());
        endStreaming = getTime(st.nextToken());

        String str = "";
        int count = 0;

        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str);
            int chattingTime = getTime(st.nextToken());
            String student = st.nextToken();

            if (didStart(chattingTime)) {
                startStudents.add(student);
            }
            if (didEnd(chattingTime) && (startStudents.contains(student))) {
                count++;
                startStudents.remove(student);
            }
        }
        System.out.println(count);
    }

    private static boolean didStart(int chattingTime) {
        return chattingTime <= startConference;
    }

    private static boolean didEnd(int chattingTime) {
        return chattingTime >= endConference && chattingTime <= endStreaming;
    }

    private static int getTime(String time){
        String[] split = time.split(":");
        return Integer.parseInt(split[0]) * 100 + Integer.parseInt(split[1]);
    }
}
