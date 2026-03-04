import java.util.Arrays;
import java.util.Comparator;

class Edge {
    int src;
    int dest;
    int weight;

    Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}

public class KruskalMSTDemo {
    private int[] parent;

    public KruskalMSTDemo(int v) {
        parent = new int[v];
        for (int i = 0; i < v; i++) {
            parent[i] = i;
        }
    }

    private int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    private void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);
        if (rootA != rootB) {
            parent[rootA] = rootB;
        }
    }

    public void kruskal(Edge[] edges, int vertices) {
        Arrays.sort(edges, new Comparator<Edge>() {
            public int compare(Edge e1, Edge e2) {
                return e1.weight - e2.weight;
            }
        });

        int total = 0;
        int used = 0;

        for (int i = 0; i < edges.length && used < vertices - 1; i++) {
            Edge e = edges[i];
            if (find(e.src) != find(e.dest)) {
                union(e.src, e.dest);
                total += e.weight;
                used++;
                System.out.println(e.src + " - " + e.dest + " : " + e.weight);
            }
        }

        System.out.println("MST total weight: " + total);
    }

    public static void main(String[] args) {
        int vertices = 4;
        Edge[] edges = {
            new Edge(0, 1, 10),
            new Edge(0, 2, 6),
            new Edge(0, 3, 5),
            new Edge(1, 3, 15),
            new Edge(2, 3, 4)
        };

        KruskalMSTDemo algo = new KruskalMSTDemo(vertices);
        algo.kruskal(edges, vertices);
    }
}
