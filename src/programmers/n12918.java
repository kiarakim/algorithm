package programmers;

public class n12918 {
    public static void main(String[] args) {
        String s = "1234";
        n12918 sol = new n12918();
        System.out.println(sol.solution(s));
    }

    public boolean solution(String s) {

        int length = s.length();

        if (length == 4 || length == 6){
            for (int i = 0; i < length; i++) {
                if (s.charAt(i) < '0' || s.charAt(i) > '9') return false;
            }
            return true;
        }
        return false;
    }
}
