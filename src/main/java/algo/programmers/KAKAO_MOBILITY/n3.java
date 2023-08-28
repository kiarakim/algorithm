package algo.programmers.KAKAO_MOBILITY;

import java.util.LinkedList;
import java.util.Queue;

public class n3 {
    public static void main(String[] args) {
        n3 sol = new n3();
        String s = "2021:04:12:16:08:35";
        String[] times = {
                "01:06:30:00", "01:04:12:00"
        };
        int[] answer = sol.solution(s, times);
        System.out.println(answer[0]);
        System.out.println(answer[1]);


    }

    public int[] solution(String s, String[] times) {
        int[] answer = new int[2];
        int[] S = makeIntArr(s);
        Node now = new Node(S[0], S[1], S[2], S[3], S[4], S[5]);
        int nowY = now.YY;
        int nowM = now.MM;
        int nowD = now.DD;

        Queue<Node> queue = new LinkedList<>();
        for (String time : times) {
            int[] t = makeIntArr(time);
            queue.offer(new Node(t[0], t[1], t[2], t[3]));
        }

        int isEvery = 1;
        int count = 0;
        while (!queue.isEmpty()) {
            int newD = now.DD;
            Node fresh = queue.poll();
            addTime(now, fresh);
            now = refactor(now);
            isEvery = isOne(newD, now.DD);
            count = getCount(nowY, nowM, nowD, now);
        }

        answer[0] = isEvery;
        answer[1] = count;
        return answer;
    }

    public int[] makeIntArr(String s) {
        String[] string = s.split(":");
        int[] S = new int[string.length];
        for (int i = 0; i < string.length; i++) {
            S[i] = Integer.parseInt(string[i]);
        }
        return S;
    }

    public Node refactor(Node now) {
        int up = 0;
        if (now.SS > 60) {
            up = now.SS / 60;
            now.mm += up;
            now.SS %= 60;
        }
        if (now.mm > 60) {
            up = now.mm / 60;
            now.HH += up;
            now.mm %= 60;
        }
        if (now.HH > 24) {
            up = now.HH / 24;
            now.DD += up;
            now.HH %= 24;
        }
        if (now.DD > 31) {
            up = now.DD / 31;
            now.MM += up;
            now.DD %= 31;
        }

        return now;
    }
    public int isOne(int origin, int change){
        if(change - origin > 1)
            return 0;
        return 1;
    }

    public int getCount(int Y, int M, int D, Node now) {
        if (Y == now.YY && M == now.MM && D == now.DD) return 0;

        return (now.YY * 360 + now.MM * 30 + now.DD) - (Y * 360 + M * 30 + D) + 1;
    }

    public void addTime(Node now, Node fresh) {
        now.SS += fresh.SS;
        now.mm += fresh.mm;
        now.HH += fresh.HH;
        now.DD += fresh.DD;
    }

    static class Node {
        int YY, MM, DD, HH, mm, SS;

        public Node(int DD, int HH, int mm, int SS) {
            this.DD = DD;
            this.HH = HH;
            this.mm = mm;
            this.SS = SS;
        }

        public Node(int YY, int MM, int DD, int HH, int mm, int SS) {
            this.YY = YY;
            this.MM = MM;
            this.DD = DD;
            this.HH = HH;
            this.mm = mm;
            this.SS = SS;
        }
    }
}
