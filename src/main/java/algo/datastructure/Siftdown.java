package algo.datastructure;

public class Siftdown {

    private int[] arr;

    public void buildSiftDown(int[] arr) {
        this.arr = arr;
        for (int i = arr.length / 2; i > -0; i--) { // index는 1부터 시작
            siftdown(i);
        }
    }

    private void siftdown(int me) {
        if (arr.length <= 1) { // root가 1이니까
            return;
        }

        int left = (me * 2) + 1;
        int right = (me * 2) + 2;
        int bigger = me;

        if(left < arr.length && arr[left] > arr[right]){ // 왼쪽이 더 크면
            bigger = left;
        }

        if(right < arr.length && arr[right] > arr[left]){ // 오른쪽이 더 크면
            bigger = right;
        }

        if(bigger != me){
            swap(me, bigger);
            siftdown(bigger);
        }
    }

    private void swap(int i , int child){
        int temp = arr[child];
        arr[child] = arr[i];
        arr[i] = temp;
    }
}
