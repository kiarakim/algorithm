package algo.datastructure;

public class LinkedList {
    // do we allow duplicated values?

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    private Node search(int index) {
        Node now = head; // search from head to index
        // 0 is head
        for (int i = 0; i < index; i++) {
            now = now.next;
        }
        return now;
    }

    public void addFirst(int val) {
        Node headNode = head; // bring the head node
        Node newNode = new Node(val, headNode); // create new node
        size++; // increase size
        head = newNode; // update head to newNode

        if (headNode == null) { // if it is the first time of addition,
            tail = newNode; // tail is the newNode
        }
    }

    public void addLast(int val) {
        Node tailNode = tail; // bring the tail node
        Node newNode = new Node(val, null); // create new node
        size++;
        tail = newNode; // update tail to newNode

        if (tailNode == null) { // if it is the first time of addition
            head = newNode; // head is the newNode
        } else {
            tailNode.next = newNode;
        }
    }

    public void add(int index, int val) {
        if (index < 0 || index >= size) {
            return;
        }

        if (index == 0) {
            addFirst(val);
            return;
        }

        if (index == size - 1) {
            addLast(val);
            return;
        }

        Node prevNode = search(index - 1); // bring prev node
        Node nextNode = prevNode.next; // bring next node
        Node newNode = new Node(val, nextNode); // link newNode to nextNode
        size++;

        prevNode.next = newNode;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return search(index).val;
    }

    public void set(int index, int val) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node now = search(index);
        now.val = val;
    }

    public int removeFirst() {
        if (head == null) {
            throw new RuntimeException();
        }

        int returnVal = head.val; // backup the return value
        Node nextNode = head.next; // bring the second node which will soon be the first node

        head = nextNode; // head is now looking nextNode
        size--;
        if (head == null) { // if the list became empty
            tail = null; // tail should be empty too
        }
        return returnVal;
    }

    public int remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            return removeFirst();
        }

        Node prevNode = search(index - 1); // bring the prev node
        Node targetNode = prevNode.next; // bring the target node to delete
        Node nextNode = targetNode.next; // bring the next node
        prevNode.next = nextNode; // link prev to next
        size--;
        return targetNode.val; // return the value of deleted node
    }

//    public boolean remove(int val) {
//        if (head == null) { // if there's nothing to delete, error
//            throw new RuntimeException();
//        }
//        Node prevNode = null;
//        Node targerNode = null;
//        Node nextNode = null;
//
//        Node now = head;
//        while (now != null) { // while now is not null
//            if (now.val == val) { // if value of now is same with input val
//                targerNode = now; // targetNode is defined
//                break;
//            }
//            prevNode = now; // if those are different, update prevNode
//            now = now.next; // and nowNode
//        }
//        if (targerNode == null) { // if i couldn't find the matching node
//            return false;
//        }
//
//        if (targerNode == head) { // if the target is the head
//            removeFirst();
//            return true;
//        }
//
//        nextNode = targerNode.next;
//        size--;
//        prevNode.next = nextNode;
//        return true;
//    }

    private static class Node {
        private int val;
        private Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}

