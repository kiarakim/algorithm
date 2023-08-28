package algo.programmers;

public class n120826 {
    public static void main(String[] args) {
        n120826 sol = new n120826();
        String my_string = "BCBdbe";
        String letter = "B";
        System.out.println(sol.solution(my_string, letter));
    }

    public String solution(String my_string, String letter) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) == letter.charAt(0)) continue;
            answer.append(my_string.charAt(i));
        }

        return answer.toString();
    }
}
