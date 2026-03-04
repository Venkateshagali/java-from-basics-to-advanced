public class DFSGraphTraversalDemo {
    public static void dfs(int[][] graph, int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int v = 0; v < graph.length; v++) {
            if (graph[node][v] == 1 && !visited[v]) {
                dfs(graph, v, visited);
            }
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 1, 1, 0, 0},
            {1, 0, 0, 1, 0},
            {1, 0, 0, 0, 1},
            {0, 1, 0, 0, 1},
            {0, 0, 1, 1, 0}
        };

        boolean[] visited = new boolean[graph.length];
        System.out.print("DFS Traversal: ");
        dfs(graph, 0, visited);
    }
}
