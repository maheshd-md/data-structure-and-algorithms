package com.problems;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache {

    private final LinkedList<Node> queue;
    private final Map<Integer, Node> map;
    private final int capacity;

    public LRUCache(int capacity) {
        super();
        this.queue = new LinkedList<>();
        this.map = new HashMap<>();
        this.capacity = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            queue.remove(node);
            queue.addFirst(node);
            return node.data;
        }
        return -1;
    }

    public void put(int key, int data) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            queue.remove(node);
            node.data = data;
            queue.addFirst(node);
        } else {
            if (map.size() >= capacity) {
                Node node = queue.removeLast();
                map.remove(node.key);
            }
            Node node = new Node(key, data);
            map.put(key, node);
            queue.addFirst(node);
        }
    }

    class Node {

        final int key;
        int data;

        public Node(int key, int data) {
            super();
            this.key = key;
            this.data = data;
        }
    }
}

