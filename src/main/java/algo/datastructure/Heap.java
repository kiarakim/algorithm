package algo.datastructure;

import java.util.Arrays;

public class Heap {
    private static int[] heap;
    private static int lastNode;

    public static void main(String[] args) {
        heap = new int[]{4, 6, 7, 8, 9, 2, 13, 3, 1, 5};
        Heap clazz = new Heap();
        clazz.buildMaxHeap(heap);
        int max = clazz.getMax();
        clazz.add(20);
        clazz.deleteAt(3);
        clazz.delete(9);
        int a = 0;
    }

    private boolean delete(int num) {
        int idx = -1;
        for (int i = 0; i < heap.length; i++) {
            if (heap[i] == num) {
                idx = i;
                break;
            }
        }
        if (idx == -1) return false;
        deleteAt(idx);
        return true;
    }

    private void deleteAt(int idx) {
        heap[idx] = 0;
        swap(idx, lastNode--);
        siftUp(lastNode);
    }

    private void add(int num) {
        if (heap.length - 1 == lastNode) { // need to expand
            heap = Arrays.copyOf(heap, heap.length * 2);
        }
        heap[++lastNode] = num;
        siftUp(lastNode);
    }

    private int getMax() {
        return heap[0];
    }

    private void buildMaxHeap(int[] heap) {
        for (int i = 1; i < heap.length; i++) {
            siftUp(i);
        }
        lastNode = heap.length - 1;
    }

    private void siftUp(int child) {
        if (child < 1) return;

        int parent = (child - 1) / 2;
        if (heap[parent] < heap[child]) {
            swap(parent, child);
            siftUp(parent);
        }
    }

    private void swap(int parent, int child) {
        int temp = heap[parent];
        heap[parent] = heap[child];
        heap[child] = temp;
    }
}
