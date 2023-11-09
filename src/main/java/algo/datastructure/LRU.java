package algo.datastructure;

import java.util.HashMap;
import java.util.Map;

public class LRU {

    private int size;
    private int capacity;
    private Node head;
    private Node tail;
    private Map<Integer, Node> cache;

    public LRU(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.head = new Node(0, 0);
        this.tail = new Node(0, 0);
        head.next = this.tail;
        tail.prev = this.head;
        cache = new HashMap<>();
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        Node node = cache.get(key);
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.value = value;
            moveToHead(node);
        } else {
            Node node = new Node(key, value);
            cache.put(key, node);
            addToHead(node);
            size++;
            if(size > capacity){
                Node least = removeTail();
                cache.remove(least.key);
                size--;
            }
        }
    }

    private Node removeTail() {
        Node least = this.tail.prev;
        removeNode(least);
        return least;
    }

    private void moveToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }

    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addToHead(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
}

class Node {
    int key;
    int value;
    Node prev;
    Node next;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
