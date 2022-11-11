package programmers;

public class n120816 {
    public static void main(String[] args) {
        n120816 sol = new n120816();
        System.out.println(sol.solution(4, 12));
    }

    public int solution(int slice, int n) {

        if (slice >= n) {
            return 1;
        }

        int mini = 1;
        int total = slice;
        while (total < n) {
            mini++;
            total = slice * mini;
        }
        return mini;
    }
}
