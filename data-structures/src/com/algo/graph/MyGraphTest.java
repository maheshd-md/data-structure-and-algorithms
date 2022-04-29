/**
 * 
 */
package com.algo.graph;

/**
 * @author Mahesh D (dhavalshankh.md@gmail.com)
 *
 */
public class MyGraphTest {

	public static void main(String[] args) {
		
		MyGraph graph = new MyGraph(5);
		graph.addEdge(0, 4);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(0, 1);
		graph.addEdge(3, 4);
		graph.addEdge(2, 4);
		graph.addEdge(2, 1);

		graph.print();
	}

}
