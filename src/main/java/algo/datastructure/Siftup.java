package algo.datastructure;

public class Siftup {

    private int[] arr; // 루트가 0임

    public void buildSiftUp(int[] arr) {
        this.arr = arr;

        for (int i = 1; i < arr.length; i++) { // 루트의 자식부터 끝까지 돌면서 부모와 비교할 것
            siftUp(i);
        }
    }

    private void siftUp(int me) {
        if (me < 1) { // 루트를 만나거나 배열의 범위에서 벗어나면 리턴
            return;
        }

        int parent = (me - 1) / 2;
        if (arr[parent] < arr[me]) {
            swap(me, parent); // 둘의 위치 바꿔주고
            siftUp(parent);   // 바꾼 자리에서 부모와 비교하기 위해 재귀
        }
    }

    private void swap(int me, int parent) {
        int temp = arr[parent];
        arr[parent] = arr[me];
        arr[me] = temp;
    }
}
