package com.ds.customhashmap;

import java.util.List;

public class CustomHashMap<K, V> {

    private List<Node<K, V>> table;
    private final int capacity = 16;
    private int size = 0;

    public V get(K key) {
        Node<K, V> node = table.get(getHash(key));
        while (null != node) {
            if (node.getKey().equals(key)) {
                return node.getValue();
            }
            node = node.next;
        }
        return null;
    }

    public V put(K key, V value) {
        Node<K, V> bucket = table.get(getHash(key));
        Node<K, V> newNode = new Node<>(key, value);
        Node<K, V> node = bucket;
        while (null != node) {
            if (node.getKey().equals(key)) {
                node.value = value;
                return value;
            }
            node = node.next;
        }
        node = newNode;
        size++;
        return node.value;
    }

    private int getHash(K key) {
        return null == key ? 0 : Math.abs(key.hashCode()) % capacity;
    }

    static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}
