package algo.programmers.스택큐;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};
        System.out.println(solution(bridge_length, weight, truck_weights));
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int sum = 0;
        int time = 0;

        for (int tw : truck_weights) {
            while (true) {
                if (bridge.isEmpty()) {
                    bridge.add(tw);
                    time++;
                    sum += tw;
                    break;
                } else if (bridge.size() == bridge_length) {
                    sum -= bridge.poll();
                } else {
                    if (sum + tw <= weight) {
                        bridge.add(tw);
                        time++;
                        sum += tw;
                        break;
                    } else {
                        bridge.add(0);
                        time++;
                    }
                }
            }
        }
        return time + bridge_length;
    }
}
