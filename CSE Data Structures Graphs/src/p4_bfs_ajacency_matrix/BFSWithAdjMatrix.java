package p4_bfs_ajacency_matrix;

import java.util.LinkedList;
import java.util.Queue;

public class BFSWithAdjMatrix {

    public static void bfs(int start, int[][] adjMatrix) {
        int V = adjMatrix.length;
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor = 0; neighbor < V; neighbor++) {
                if (adjMatrix[node][neighbor] == 1 && !visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        int[][] adjMatrix = new int[V][V]; // Initialize V x V adjacency matrix

        // Add undirected edges
        addUndirectedEdge(adjMatrix, 0, 1);
        addUndirectedEdge(adjMatrix, 0, 2);
        addUndirectedEdge(adjMatrix, 2, 3);
        addUndirectedEdge(adjMatrix, 2, 4);

        System.out.println("Breadth-First Traversal (Adjacency Matrix, Undirected):");
        bfs(0, adjMatrix); // Start BFS from vertex 0
    }

    // Utility method to add undirected edge in adjacency matrix
    static void addUndirectedEdge(int[][] matrix, int u, int v) {
        matrix[u][v] = 1;
        matrix[v][u] = 1;
    }
}