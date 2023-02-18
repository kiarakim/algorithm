package programmers.DevMatching;

public class n1 {
    public static void main(String[] args) {
        n1 sol = new n1();
        int low = 25;
        int high = 51;
        String[] img = {
                ".########......",
                ".####...#......",
                ".#.####.#.#####",
                ".#.#..#.#.#..##",
                ".#.##.#.#.#...#",
                ".#.####.#.#...#",
                ".#....###.#####",
                ".########......"
        };

        System.out.println(sol.solution(low, high, img));
    }

    public int solution(int low, int high, String[] img) {
        int answer = 0;

        int maxLen = Math.max(img.length, img[0].length());

        for (int y = 0; y <= img.length - 3; y++) {
            for (int x = 0; x <= img[0].length() - 3; x++) {
                if (img[y].charAt(x) != '#') break;
                for (int qr = 3; qr <= maxLen; qr++) {
                    if (isQR(y, x, qr)) {

                    }
                }
            }
        }

        return answer;
    }

    public boolean isQR(int y, int x, int qr) {

        return true;
    }
}
