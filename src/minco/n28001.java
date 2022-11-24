package minco;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class n28001 {
    public static void main(String[] args) throws IOException {
        List<String> names = Arrays.asList("Amy", "Bob", "Chloe", "Diane", "Edger");
        int[][] arr = {
                {0, 1, 0, 0, 0},
                {0, 0, 1, 1, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0}
        };

        int maxIdx = 0;
        int[] count = new int[5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] == 1) {
                    count[i]++;
                }
            }
            if(count[maxIdx] < count[i])
                maxIdx = i;
        }

        System.out.println(names.get(maxIdx));
    }
}
