package Graphs;

import java.util.*;

public class Graph {

  private class Vertex {
    HashMap<String, Integer> neighbours = new HashMap<>();
  }

  private HashMap<String, Vertex> vertices = new HashMap<>();

  public void addVertex(String vname) {
    Vertex vtx = new Vertex();
    vertices.put(vname, vtx);
  }

  public void addEdge(String vname1, String vname2) {
    Vertex v1 = vertices.get(vname1);
    Vertex v2 = vertices.get(vname2);

    if (v1 == null || v2 == null || v1.neighbours.containsKey(vname2))
      return;

    v1.neighbours.put(vname2, 1);
    v2.neighbours.put(vname1, 1);
  }

  public void dfs(String vertex, HashMap<String, Boolean> visited) {
    visited.put(vertex, true);
    Vertex v = this.vertices.get(vertex);
    System.out.print(vertex + " ");
    for (String vtx : v.neighbours.keySet())
      if (!visited.containsKey(vtx))
        dfs(vtx, visited);
  }

  public void depthfirstSearch() {
    HashMap<String, Boolean> visited = new HashMap<>();
    for (String vtx : this.vertices.keySet()) {
      if (!visited.containsKey(vtx))
        dfs(vtx, visited);
    }
  }

  public void bfs(String vertex) {
    HashMap<String, Boolean> visited = new HashMap<>();
    Queue<String> queue = new LinkedList<>();
    visited.put(vertex, true);
    queue.add(vertex);
    while (!queue.isEmpty()) {
      vertex = queue.poll();
      System.out.print(vertex + " ");
      Vertex v = this.vertices.get(vertex);
      for (String node : v.neighbours.keySet()) {
        if (!visited.containsKey(node)) {
          visited.put(node, true);
          queue.add(node);
        }
      }
    }
  }

}
