package algorithm.algorithm.programmers;

public class n120956 {
    public static String[] canBabble = {"aya","ye","woo","ma"};

    public static void main(String[] args) {
        String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        int result = solution(babbling);
        System.out.println(result);
    }

    public static int solution(String[] babbling) {

        int answer = 0;

        for(String bab : babbling){
            for(String can : canBabble){
                bab = bab.replace(can, " ");
            }
            if(bab.replaceAll(" ", "").equals("")){
                answer++;
            }
        }
        return answer;
    }

}
