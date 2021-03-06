package utils;

import java.awt.Color;
import java.util.ArrayList;

/*
* Name   : Graph
* Purpose: Represents a graph in the ShortestPath program
* Details: The graph is a 2d array, where each node represents a Coordinate.
* 		   Each Coordinate can only have a value either 0 or 1, wall or path respectively.
*
* @author  David Macababayao
* @version 1.0
* @since   2021-05-10 
*/
public class Graph {

	private int graphSize;
	private int[][] graph;
	
	public Graph(int size) {
		graphSize = size;
		
		/* initialize original borders (1 = wall, 0 = path) */
		graph = new int[graphSize][graphSize];
	}
	
	/*
	 * Name   : setWalls
	 * Purpose: Add walls to graph
	 * Details: Assigns a value of 0 to the Coordinates in the given list 
	 * 
	 * @param : ArrayList of Coordinates representing walls
	 * @return: void
	 */
	public void setWalls(ArrayList<Coordinate> walls) {
		for (Coordinate wall: walls) { 
			graph[wall.x][wall.y] = 1;
		} 
	}
	
	/*
	 * Name   : flip
	 * Purpose: Assigns the opposite to the value of the given Coordinate
	 * 
	 * @param : Coordinate
	 * @return: void
	 */
	public void flip(Coordinate c) {
		graph[c.x][c.y] = 1 - graph[c.x][c.y];
	}
	
	/*
	 * Name   : resetGraph
	 * Purpose: Resets the graph to constructor specification
	 * Details: Assigns 0 to all Coordinates
	 * 
	 * @return: void
	 */
	public void resetGraph() {
		/* initialize original borders (1 = wall, 0 = path) */
		graph = new int[graphSize][graphSize];
	}

	/*
	 * Name   : getSize
	 * Purpose: Returns the size of the graph
	 * 
	 * @return: integer value of the graph's size
	 */
	public int getSize() {
		return graphSize;
	}
	
	/*
	 * Name   : getValue
	 * Purpose: Returns the value at the given Coordinate
	 * 
	 * @param : Coordinate
	 * @return: integer value of the given Coordinate in the graph
	 */
	public int getValue(Coordinate c) {
		return (graph[c.x][c.y]);
	}
}
