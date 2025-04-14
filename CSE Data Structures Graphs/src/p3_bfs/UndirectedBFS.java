package p3_bfs;

import java.util.*;

public class UndirectedBFS {

    public static void bfs(int start, List<List<Integer>> graph) {
        boolean[] visited = new boolean[graph.size()];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        List<List<Integer>> graph = new ArrayList<>();

        // Initialize the adjacency list
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Add undirected edges
        addUndirectedEdge(graph, 0, 1);
        addUndirectedEdge(graph, 0, 2);
        addUndirectedEdge(graph, 2, 3);
        addUndirectedEdge(graph, 2, 4);

        System.out.println("Breadth-First Traversal (Iterative, Undirected):");
        bfs(0, graph); // Start BFS from node 0
    }

    // Utility method to add undirected edges
    static void addUndirectedEdge(List<List<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
}