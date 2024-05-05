package com.ds.graph;

public class GraphTest {

    public static void main(String[] args) {
        Graph directedGraph = new Graph(true, true);
        Vertex vertexA = directedGraph.addVertex("A");
        Vertex vertexB = directedGraph.addVertex("B");
        Vertex vertexC = directedGraph.addVertex("C");
        Vertex vertexD = directedGraph.addVertex("D");
        Vertex vertexE = directedGraph.addVertex("E");

        directedGraph.addEdge(vertexA, vertexB, 2);
        directedGraph.addEdge(vertexB, vertexC, 4);
        directedGraph.addEdge(vertexD, vertexE, 6);
        directedGraph.addEdge(vertexD, vertexA, 5);

        System.out.println("\n\nDirected Graph ------------------------------");
        directedGraph.print();


        Graph unDirectedGraph = new Graph(true, false);
        vertexA = unDirectedGraph.addVertex("A");
        vertexB = unDirectedGraph.addVertex("B");
        vertexD = unDirectedGraph.addVertex("D");
        vertexC = unDirectedGraph.addVertex("C");
        vertexE = unDirectedGraph.addVertex("E");
        Vertex vertexF = unDirectedGraph.addVertex("F");
        Vertex vertexG = unDirectedGraph.addVertex("G");
        Vertex vertexH = unDirectedGraph.addVertex("H");
        Vertex vertexI = unDirectedGraph.addVertex("I");

        unDirectedGraph.addEdge(vertexA, vertexB, 2);
        unDirectedGraph.addEdge(vertexB, vertexC, 4);
        unDirectedGraph.addEdge(vertexB, vertexF, 4);
        unDirectedGraph.addEdge(vertexF, vertexG, 4);
        unDirectedGraph.addEdge(vertexG, vertexH, 4);
        unDirectedGraph.addEdge(vertexD, vertexE, 6);
        unDirectedGraph.addEdge(vertexD, vertexA, 5);
        unDirectedGraph.addEdge(vertexG, vertexI, 5);


        System.out.println("\n\nUndirected Graph ------------------------------");
        unDirectedGraph.print();

//        A --- B --- C
//          \    \
//           \    F --- G --- H
//            \          \
//             D --- E    \
//                         I

        System.out.println("\n\nDFS Undirected Graph ------------------------------");
        DFS.printDFS(unDirectedGraph);

        System.out.println("\n\nBFS Undirected Graph ------------------------------");
        BFS.printBFS(unDirectedGraph);
    }

}
