class Node {
    int val;
    int key;
    Node next;
    Node prev;
    Node(int k, int v) {
        val = v;
        key = k;
    }
}

class LRUCache {

    private Map<Integer, Node> map;
    private Node head, tail;
    private int cursize, maxsize;
    public LRUCache(int capacity) {
        map = new HashMap<>();
        cursize = 0;
        maxsize = capacity;
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        Node node = map.get(key);
        remove(node);
        add(node);
        return node.val;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));
            cursize--;
        }
        Node newNode = new Node(key, value);
        map.put(key, newNode);
        add(newNode);
        cursize++;
        if (cursize > maxsize) {
            map.remove(head.next.key);
            remove(head.next);
            cursize--;
        }
    }

    private void remove(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
        node.next = null;
        node.prev = null;
    }

    private void add(Node node) {
        Node prev = tail.prev;
        prev.next = node;
        tail.prev = node;
        node.prev = prev;
        node.next = tail;
    }
}