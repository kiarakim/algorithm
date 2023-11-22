package algo.datastructure;

import java.util.Arrays;

public class Stack {
    // are we allowing both positive and negative integer?
    // if we allow both and if stack is empty, how will I return?

    public int[] stack;
    public static int capacity;
    public int size;

    public static void main(String[] args) {
        Stack clazz = new Stack();
        // build stack(int)
        capacity = 5;
        clazz.buildStack(capacity);
        // put(int)
        clazz.put(6);
        // pop()
        int pop = clazz.pop();
        // peek()
        int peek = clazz.peek();
    }

    public void buildStack(int capacity) {
        stack = new int[capacity];
        size = -1; // if size == 0 we have 1 element, if size == 4 we have 5 elements
    }

    public void put(int element) {
        if (capacity <= size + 1) { // = stack is full = expand the capacity
            stack = Arrays.copyOf(stack, capacity * 2);
        }
        stack[++size] = element;
    }

    public int pop() {
        if (size == -1) { // if stack is empty
            return -1;
        }
        return stack[size--];
    }

    public int peek() {
        if (size == -1) { // if stack is empty
            return -1;
        }
        return stack[size];
    }
}
