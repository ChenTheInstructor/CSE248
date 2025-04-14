package p1_dfs_v2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class UndirectedDFSIterative {

    public static void dfsIterative(int start, List<List<Integer>> graph) {
        boolean[] visited = new boolean[graph.size()];
        Stack<Integer> stack = new Stack<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (!visited[node]) {
                visited[node] = true;
                System.out.print(node + " ");

                // Push neighbors to stack in reverse order for left-to-right traversal
                List<Integer> neighbors = graph.get(node);
                Collections.reverse(neighbors);
                for (int neighbor : neighbors) {
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
                Collections.reverse(neighbors); // Restore original order if needed
            }
        }
    }

    public static void main(String[] args) {
        int V = 10; // number of vertices (0 to 4)
        List<List<Integer>> graph = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Add undirected edges
        addUndirectedEdge(graph, 0, 1);
        addUndirectedEdge(graph, 0, 2);
        addUndirectedEdge(graph, 0, 3);
        addUndirectedEdge(graph, 1, 4);
        addUndirectedEdge(graph, 1, 5);
        addUndirectedEdge(graph, 2, 6);
        addUndirectedEdge(graph, 2, 7);
        addUndirectedEdge(graph, 3, 8);
        addUndirectedEdge(graph, 3, 9);
        

        System.out.println("Depth-First Traversal (Iterative, Undirected):");
        dfsIterative(0, graph); // Start DFS from vertex 0
    }

    // Utility method to add undirected edges
    static void addUndirectedEdge(List<List<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    
    // Not used in this example
    private static List<List<Integer>> buildGraphUsingList() {
		List<List<Integer>> list = new ArrayList<>();

		ArrayList<Integer> sublist0 = new ArrayList<>(Arrays.asList(1, 2, 3));
		list.add(sublist0);

		ArrayList<Integer> sublist1 = new ArrayList<>(Arrays.asList(0, 4, 5));
		list.add(sublist1);

		ArrayList<Integer> sublist2 = new ArrayList<>(Arrays.asList(0, 6, 7));
		list.add(sublist2);

		ArrayList<Integer> sublist3 = new ArrayList<>(Arrays.asList(0, 8, 9));
		list.add(sublist3);
		
		ArrayList<Integer> sublist4 = new ArrayList<>(Arrays.asList(1));
		list.add(sublist4);
		
		ArrayList<Integer> sublist5 = new ArrayList<>(Arrays.asList(1));
		list.add(sublist5);
		
		ArrayList<Integer> sublist6 = new ArrayList<>(Arrays.asList(2));
		list.add(sublist6);
		
		ArrayList<Integer> sublist7 = new ArrayList<>(Arrays.asList(2));
		list.add(sublist7);
		
		ArrayList<Integer> sublist8 = new ArrayList<>(Arrays.asList(3));
		list.add(sublist3);
		
		ArrayList<Integer> sublist9 = new ArrayList<>(Arrays.asList(3));
		list.add(sublist9);

		return list;

	}
}