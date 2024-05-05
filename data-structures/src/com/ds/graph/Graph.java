package com.ds.graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    public List<Vertex> vertices;
    public boolean isWeighted;
    public boolean isDirected;

    public Graph(boolean isWeighted, boolean isDirected) {
        this.isWeighted = isWeighted;
        this.isDirected = isDirected;
        vertices = new ArrayList<>();
    }

    public Vertex getVertex(String data) {
        for (Vertex vertex : this.vertices) {
            if(data.equals(vertex.data)) {
                return  vertex;
            }
        }
        return null;
    }

    public Vertex addVertex(String data) {
        Vertex vertex = getVertex(data);
        if(null == vertex) {
            vertex = new Vertex(data);
            this.vertices.add(vertex);
        }
        return vertex;
    }

    public void addEdge(Vertex start, Vertex end, int weight) {
        if(!isWeighted) {
            weight = 0;
        }
        start.addEdge(end, weight);
        if(!isDirected) {
            end.addEdge(start, weight);
        }
    }

    public void print() {
        StringBuilder s = new StringBuilder();
        for (Vertex vertex : this.vertices) {
            s.append("\n" + vertex.data +" ---> ");
            for (Edge edge : vertex.edges) {
                s.append("(" + edge.startVertex.data +", "+ edge.endVertex.data +", "+ edge.wight +") ");
            }
        }
        System.out.print(s.toString());
    }
}
