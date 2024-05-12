package com.ds.graph;

import java.util.*;

public class BFS {

    public static void printBFS(Graph graph, String start) {
        if(null != graph && !graph.vertices.isEmpty()) {
            Queue<String> queue = new LinkedList<>();
            Set<String> visited = new HashSet<>();
            queue.add(start);
            while(!queue.isEmpty()) {
                String curr = queue.remove();
                if(!visited.contains(curr)) {
                    System.out.print(curr);
                    visited.add(curr);
                    for(Edge edge : graph.vertices.get(curr)) {
                        queue.add(edge.end);
                    }
                }
            }
        }
    }

    public static void printBFSRecursive(Graph graph, String start, Set<String> visited) {
        // BFS can't be implemented using recursion
        System.out.println("BFS can't be implemented using recursion");
    }
}
