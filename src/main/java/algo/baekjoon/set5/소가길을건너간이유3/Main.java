package algo.baekjoon.set5.소가길을건너간이유3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        List<Cow> cows = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String[] split = br.readLine().split(" ");
            cows.add(new Cow(Integer.parseInt(split[0]), Integer.parseInt(split[1])));
        }

        Collections.sort(cows, Comparator.comparing(Cow::getArrive).thenComparing(Cow::getSpend));

        long time = cows.get(0).getArrive() + cows.get(0).getSpend();

        for (int i = 1; i < N; i++) {
            if(time < cows.get(i).getArrive()) {
                time = cows.get(i).getArrive() + cows.get(i).getSpend();
            } else {
                time += cows.get(i).getSpend();
            }
        }

        System.out.println(time);
    }
}

class Cow {
    private int arrive;
    private int spend;

    public Cow(int arrive, int spend) {
        this.arrive = arrive;
        this.spend = spend;
    }

    public int getArrive() {
        return arrive;
    }

    public int getSpend() {
        return spend;
    }
}
