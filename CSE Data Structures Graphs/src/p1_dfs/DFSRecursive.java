package p1_dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DFSRecursive {
	private static Stack<Integer> stack = new Stack<>();

	public static void main(String[] args) {
		boolean[] visited = new boolean[10];
		List<List<Integer>> list = buildGraphUsingList();
		int start = 0;
		dfs(start, visited, list);

	}

	static void dfs(int node, boolean[] visited, List<List<Integer>> graph) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, graph);
            }
        }
    }

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
