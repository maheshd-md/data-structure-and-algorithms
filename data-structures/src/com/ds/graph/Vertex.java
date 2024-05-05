package com.ds.graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    public String data;
    public List<Edge> edges;

    public Vertex(String data) {
        this.data = data;
        this.edges = new ArrayList<>();
    }

    public Edge addEdge(Vertex end, int weight) {
        Edge edge = new Edge(weight);
        edge.startVertex = this;
        edge.endVertex = end;
        this.edges.add(edge);
        return edge;
    }

}
