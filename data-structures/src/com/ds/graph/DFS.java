package com.ds.graph;

import java.util.*;

public class DFS {

    public static void printDFS(Graph graph, String start) {
        Stack<String> stack = new Stack<>();
        Set<String> visited = new HashSet<>();
        stack.add(start);
        while(!stack.isEmpty()) {
            String curr = stack.pop();
            if(!visited.contains(curr)) {
                System.out.print(curr);
                visited.add(curr);
                for(Edge edge : graph.vertices.get(curr)) {
                    stack.add(edge.end);
                }
            }
        }
    }

    public static void printDFSRecursive(Graph graph, String start, Set<String> visited) {
        if(visited.contains(start)) {
            return;
        }
        System.out.print(start);
        visited.add(start);
        List<Edge> edges = graph.vertices.get(start);
        for (Edge edge : edges) {
            if(!visited.contains(edge.end)) {
                printDFSRecursive(graph, edge.end, visited);
            }
        }
    }
}
