package p6_bellman_ford;

import java.util.*;

public class BellmanFordDemo {

    // Define Edge class
    static class Edge {
        int from, to;
        double weight;

        Edge(int from, int to, double weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }
    }

    // Bellman-Ford algorithm
    public static void bellmanFord(List<Edge> edges, int V, int start) {
        double[] dist = new double[V];
        int[] pred = new int[V];

        Arrays.fill(dist, Double.POSITIVE_INFINITY);
        Arrays.fill(pred, -1);
        dist[start] = 0;

        // Relax edges V-1 times
        for (int i = 0; i < V - 1; i++) {
            for (Edge edge : edges) {
                if (dist[edge.from] != Double.POSITIVE_INFINITY &&
                    dist[edge.from] + edge.weight < dist[edge.to]) {
                    dist[edge.to] = dist[edge.from] + edge.weight;
                    pred[edge.to] = edge.from;
                }
            }
        }

        // Check for negative cycles
        for (Edge edge : edges) {
            if (dist[edge.from] != Double.POSITIVE_INFINITY &&
                dist[edge.from] + edge.weight < dist[edge.to]) {
                System.out.println("Negative cycle detected!");
                return;
            }
        }

        // Output shortest paths
        System.out.println("Shortest paths from vertex " + start + ":");
        for (int i = 0; i < V; i++) {
            System.out.print("To vertex " + i + ": ");
            if (dist[i] == Double.POSITIVE_INFINITY) {
                System.out.println("Unreachable");
            } else {
                printPath(i, pred);
                System.out.printf(" | Cost: %.2f\n", dist[i]);
            }
        }
    }

    // Recursive method to print path using predecessors
    public static void printPath(int v, int[] pred) {
        if (pred[v] == -1) {
            System.out.print(v);
        } else {
            printPath(pred[v], pred);
            System.out.print(" -> " + v);
        }
    }

    // Main method with graph setup
    public static void main(String[] args) {
        int V = 4; // number of vertices
        List<Edge> edges = new ArrayList<>();

        // Example graph
        edges.add(new Edge(0, 1, 4));
        edges.add(new Edge(0, 2, 5));
        edges.add(new Edge(1, 2, -3));
        edges.add(new Edge(2, 3, 2));
        edges.add(new Edge(3, 1, 0)); // introduces a negative cycle

        bellmanFord(edges, V, 0);
    }
}
