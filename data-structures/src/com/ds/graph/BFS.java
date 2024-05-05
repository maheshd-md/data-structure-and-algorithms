package com.ds.graph;

import com.ds.graph.Edge;
import com.ds.graph.Graph;
import com.ds.graph.Vertex;

import java.util.*;

public class BFS {

    public static void printBFS(Graph graph) {
        if(null != graph && !graph.vertices.isEmpty()) {
            Queue<Vertex> queue = new LinkedList<>();
            Set<Vertex> visited = new HashSet<>();
            queue.add(graph.vertices.get(0));
            while(!queue.isEmpty()) {
                Vertex currVertex = queue.remove();
                System.out.print(currVertex.data + ", ");
                visited.add(currVertex);
                for(Edge edge : currVertex.edges) {
                    if(!visited.contains(edge.endVertex)) {
                        queue.add(edge.endVertex);
                    }
                }
            }
        }
    }
}
