package com.ds.graph;

import com.ds.graph.Edge;
import com.ds.graph.Graph;
import com.ds.graph.Vertex;

import java.util.*;

public class DFS {

    public static void printDFS(Graph graph) {
        if(null != graph && !graph.vertices.isEmpty()) {
            Stack<Vertex> stack = new Stack<>();
            Set<Vertex> visited = new HashSet<>();
            stack.add(graph.vertices.get(0));
            while(!stack.isEmpty()) {
                Vertex currVertex = stack.pop();
                System.out.print(currVertex.data + ", ");
                visited.add(currVertex);
                for(Edge edge : currVertex.edges) {
                    if(!visited.contains(edge.endVertex)) {
                        stack.add(edge.endVertex);
                    }
                }
            }
        }
    }
}
