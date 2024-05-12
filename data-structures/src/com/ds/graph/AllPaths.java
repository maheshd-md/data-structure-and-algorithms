package com.ds.graph;

import java.util.List;
import java.util.Stack;

public class AllPaths {

    public static void printAllPaths(Graph graph, String curr, String target, String path, Stack<String> visited) {
        path = path + curr;
        if(curr.equals(target)) {
            System.out.println(path);
            return;
        }
        List<Edge> edges = graph.vertices.get(curr);
        for (Edge edge : edges) {
            if(!visited.contains(edge.end)) {
                visited.add(curr);
                printAllPaths(graph, edge.end, target, path, visited);
                visited.remove(curr);
            }

        }
    }
}
