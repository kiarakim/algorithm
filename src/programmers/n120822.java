package programmers;

public class n120822 {
    public static void main(String[] args) {
        n120822 sol = new n120822();
        String my_string = "bread";
        System.out.println(sol.solution(my_string));
    }

    public String solution(String my_string) {
        StringBuilder myString = new StringBuilder(my_string);
        String answer = myString.reverse().toString();
        return answer;
    }
}
