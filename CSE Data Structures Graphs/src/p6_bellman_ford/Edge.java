package p6_bellman_ford;

class Edge {
    int from, to;
    double weight;
    Edge(int from, int to, double weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }
}
