package algo.programmers.DevMatching;

public class n3 {
    public static void main(String[] args) {
        n3 sol = new n3();

        String[] subway = {
                "1 2 3 4 5 6 7 8",
                "2 11",
                "0 11 10",
                "3 17 19 12 13 9 14 15 10",
                "20 2 21"
        };
        int start = 1;
        int end = 9;

        int answer = sol.solution(subway, start, end);
    }

    public int solution(String[] subway, int start, int end) {
        int count = 1;
        int lines = subway.length;
        int[][] allStation = new int[lines][];

        for (int i = 0; i < lines; i++) {
            String[] s = subway[i].split(" ");
            allStation[i] = new int[s.length];
            for (int j = 0; j < s.length; j++) {
                allStation[i][j] = Integer.parseInt(s[j]);
            }
        }

        int startLine = 0;
        int m = 0;
        while(m < lines){
            m++;
            for (int i = 0; i < lines; i++) {
                if (isThere(allStation[i], start) && isThere(allStation[i], end)) return 0;
                if (isThere(allStation[i], start)) {
                    startLine = i;
                    break;
                }
            }

            for (int i = 0; i < lines; i++) {
                if (i == startLine) continue;
                int[] nowLine = allStation[i];
                if(isThere(nowLine, end)) return count;

                count++;
                start = getStart(allStation[startLine], nowLine);
                if(start == -1) continue;

            }
        }
        return count;
    }

    public boolean isThere(int[] line, int target) {
        for (int station : line) {
            if (station == target)
                return true;
        }
        return false;
    }

    public int getStart(int[] startLine, int[] nowLine){
        for(int start : startLine){
            for(int now: nowLine){
                if(start == now) return now;
            }
        }
        return -1;
    }
}
