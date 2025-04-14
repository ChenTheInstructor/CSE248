package p7_minimum_spanning_trees;

//Java implementation of Kruskal's algorithm with explanation and sample input/output
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Edge implements Comparable<Edge> {
 int src, dest, weight;

 Edge(int s, int d, int w) {
     src = s;
     dest = d;
     weight = w;
 }

 public int compareTo(Edge other) {
     return this.weight - other.weight; // sort by weight
 }
}

class UnionFind {
 int[] parent;

 UnionFind(int n) {
     parent = new int[n];
     Arrays.fill(parent, -1);
 }

 int find(int x) {
     if (parent[x] < 0) return x;
     return parent[x] = find(parent[x]); // path compression
 }

 boolean union(int x, int y) {
     int rootX = find(x);
     int rootY = find(y);
     if (rootX == rootY) {
    	 return false; // cycle detected
     }
     parent[rootY] = rootX; // union
     return true;
 }
}

public class KruskalMST {
 public static int kruskal(int V, List<Edge> edges) {
     Collections.sort(edges); // sort edges by weight
     UnionFind uf = new UnionFind(V);
     int mstWeight = 0;

     System.out.println("Edges in the MST:");
     for (Edge e : edges) {
         if (uf.union(e.src, e.dest)) {
             System.out.println(e.src + " - " + e.dest + " : " + e.weight);
             mstWeight += e.weight;
         }
     }
     return mstWeight;
 }

 public static void main(String[] args) {
     List<Edge> edges = new ArrayList<>();
     edges.add(new Edge(0, 1, 10));
     edges.add(new Edge(0, 2, 6));
     edges.add(new Edge(0, 3, 5));
     edges.add(new Edge(1, 3, 15));
     edges.add(new Edge(2, 3, 4));

     int mst = kruskal(4, edges);
     System.out.println("Total weight of MST: " + mst);
 }
}
