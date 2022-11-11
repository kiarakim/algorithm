package programmers;

public class n120841 {
    public static void main(String[] args) {
        n120841 sol = new n120841();
        int[] dot = {-7, 9};
        System.out.println(sol.solution(dot));
    }

    public int solution(int[] dot) {
        if (dot[0] > 0) {
            if (dot[1] > 0) {
                return 1;
            }
            return 4;
        }
        if (dot[1] > 0) {
            return 2;
        }
        return 3;
    }
}
