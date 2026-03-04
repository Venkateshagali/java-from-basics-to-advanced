import java.util.LinkedList;
import java.util.Queue;

public class BFSShortestPathUnweightedDemo {
    public static void shortestPath(int[][] graph, int src) {
        int n = graph.length;
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            dist[i] = -1;
            visited[i] = false;
        }

        Queue<Integer> q = new LinkedList<Integer>();
        visited[src] = true;
        dist[src] = 0;
        q.offer(src);

        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v = 0; v < n; v++) {
                if (graph[u][v] == 1 && !visited[v]) {
                    visited[v] = true;
                    dist[v] = dist[u] + 1;
                    q.offer(v);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Edges from " + src + " to " + i + " = " + dist[i]);
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 1, 0},
            {0, 1, 1, 0, 1, 1},
            {0, 0, 1, 1, 0, 1},
            {0, 0, 0, 1, 1, 0}
        };

        shortestPath(graph, 0);
    }
}
