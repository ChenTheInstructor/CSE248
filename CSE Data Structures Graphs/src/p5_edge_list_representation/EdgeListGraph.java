package p5_edge_list_representation;

import java.util.*;

public class EdgeListGraph {

    // Edge class to represent a weighted edge in the graph
    static class Edge {
        int from;
        int to;
        double weight;

        Edge(int from, int to, double weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return from + " -> " + to + " (weight: " + weight + ")";
        }
    }

    public static void main(String[] args) {
        // List to store all edges
        List<Edge> edges = new ArrayList<>();

        // Add edges to the graph (example graph with 5 nodes)
        edges.add(new Edge(0, 1, 4.5));
        edges.add(new Edge(0, 2, 2.0));
        edges.add(new Edge(1, 2, 1.5));
        edges.add(new Edge(2, 3, 3.2));
        edges.add(new Edge(3, 4, 2.1));
        edges.add(new Edge(4, 1, -5.0)); // This could create a negative cycle
        
        edges.add(new Edge(1, 0, 4.5));
        edges.add(new Edge(2, 0, 2.0));
        edges.add(new Edge(2, 1, 1.5));
        edges.add(new Edge(3, 2, 3.2));
        edges.add(new Edge(4, 3, 2.1));
        edges.add(new Edge(1, 4, -5.0));
        
      

        // Print the edge list
        System.out.println("Edge List:");
        for (Edge edge : edges) {
            System.out.println(edge);
        }
    }
}
