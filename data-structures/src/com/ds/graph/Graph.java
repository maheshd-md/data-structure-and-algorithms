package com.ds.graph;

import java.util.*;

public class Graph {

    public Map<String, List<Edge>> vertices;
    public boolean isWeighted;
    public boolean isDirected;

    public Graph(boolean isWeighted, boolean isDirected) {
        this.isWeighted = isWeighted;
        this.isDirected = isDirected;
        vertices = new HashMap<>();
    }

    public void addEdge(String start, String end, int weight) {
        if(!isWeighted) {
            weight = 0;
        }
        this.vertices.putIfAbsent(start, new ArrayList<>());
        this.vertices.get(start).add(new Edge(end, weight));
        if(!isDirected) {
            this.vertices.putIfAbsent(end, new ArrayList<>());
            this.vertices.get(end).add(new Edge(start, weight));
        }
    }

    public void print() {
        StringBuilder s = new StringBuilder();
        for (String data : this.vertices.keySet()) {
            s.append("\n" + data +" ---> ");
            for (Edge edge : vertices.get(data)) {
                s.append("(" + data +", "+ edge.end +", "+ edge.wight +") ");
            }
        }
        System.out.print(s.toString());
    }
}
