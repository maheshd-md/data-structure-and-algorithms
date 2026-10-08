package com.problems;

import java.util.HashMap;
import java.util.Map;

public class LRUCacheO1 {

    private final Map<Integer, Node> map;
    private final int capacity;
    private final Node head;
    private final Node tail;

    public LRUCacheO1(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }

        this.capacity = capacity;
        this.map = new HashMap<>();

        // Dummy head and tail nodes
        this.head = new Node(-1, -1);
        this.tail = new Node(-1, -1);

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        Node node = map.get(key);

        if (node == null) {
            return -1;
        }

        // Move accessed node to front (MRU)
        remove(node);
        addFirst(node);

        return node.data;
    }

    public void put(int key, int data) {
        Node node = map.get(key);

        if (node != null) {
            // Update existing node
            node.data = data;

            // Move to front (MRU)
            remove(node);
            addFirst(node);
            return;
        }

        // Remove least recently used node
        if (map.size() >= capacity) {
            Node lru = tail.prev;
            remove(lru);
            map.remove(lru.key);
        }

        // Insert new node
        Node newNode = new Node(key, data);
        addFirst(newNode);
        map.put(key, newNode);
    }

    // Remove node in O(1)
    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // Add node immediately after head in O(1)
    private void addFirst(Node node) {
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }

    private static class Node {
        final int key;
        int data;
        Node prev;
        Node next;

        Node(int key, int data) {
            this.key = key;
            this.data = data;
        }
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);

        cache.put(1, 10);
        cache.put(2, 20);

        System.out.println(cache.get(1)); // 10

        cache.put(3, 30); // Evicts key 2

        System.out.println(cache.get(2)); // -1
        System.out.println(cache.get(3)); // 30

        cache.put(4, 40); // Evicts key 1

        System.out.println(cache.get(1)); // -1
        System.out.println(cache.get(3)); // 30
        System.out.println(cache.get(4)); // 40
    }
}
