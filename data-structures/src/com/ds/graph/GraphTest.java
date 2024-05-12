package com.ds.graph;

import java.util.Stack;

public class GraphTest {

    public static void main(String[] args) {
        Graph directedGraph = new Graph(true, true);
        directedGraph.addEdge("A", "B", 5);
        directedGraph.addEdge("D", "A", 5);
        directedGraph.addEdge("B", "C", 6);
        directedGraph.addEdge("B", "F", 5);
        directedGraph.addEdge("G", "C", 4);
        directedGraph.addEdge("G", "F", 2);
        directedGraph.addEdge("E", "G", 8);
        directedGraph.addEdge("E", "D", 8);
        directedGraph.addEdge("G", "H", 8);
        directedGraph.addEdge("G", "I", 6);
        System.out.println("\n\nDirected Graph ------------------------------");
        directedGraph.print();


        Graph unDirectedGraph = new Graph(false, false);
        unDirectedGraph.addEdge("A", "B", 5);
        unDirectedGraph.addEdge("D", "A", 5);
        unDirectedGraph.addEdge("B", "C", 6);
        unDirectedGraph.addEdge("B", "F", 5);
        unDirectedGraph.addEdge("G", "C", 4);
        unDirectedGraph.addEdge("G", "F", 2);
        unDirectedGraph.addEdge("E", "G", 8);
        unDirectedGraph.addEdge("E", "D", 8);
        unDirectedGraph.addEdge("G", "H", 8);
        unDirectedGraph.addEdge("G", "I", 6);
        System.out.println("\n\nUndirected Graph ------------------------------");
        unDirectedGraph.print();

//        A --- B --- C
//          \    \     \
//           \    F --- G --- H
//            \        /  \
//             D --- E     \
//                          I

        System.out.println("\n\nDFS Undirected Graph ------------------------------");
        DFS.printDFS(unDirectedGraph, "A");

        System.out.println("\n\nBFS Undirected Graph ------------------------------");
        BFS.printBFS(unDirectedGraph, "A");


        System.out.println("\n\nPrint all paths from start to target for Undirected Graph ------------------------------");
        AllPaths.printAllPaths(unDirectedGraph, "A", "G", "", new Stack<String>());
    }

}
