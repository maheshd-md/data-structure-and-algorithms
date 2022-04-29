/**
 * 
 */
package com.algo.graph;

import java.util.LinkedList;

/**
 * @author Mahesh D (dhavalshankh.md@gmail.com)
 *
 */
public class MyGraph {

	LinkedList<Integer>[] adj;
	int size;
	
	public MyGraph(int size) {
		this.size = size;
		adj = new LinkedList[size];
		for(int i=0; i<size; i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
	
	public void print() {
		for(int i=0; i<size; i++) {
			System.out.println("Node " + i + "--> " + adj[i]); 
		} 
	}
}
