public class TopologicalSortDemo {
    private static void dfs(int[][] graph, int node, boolean[] visited, int[] stack, int[] idx) {
        visited[node] = true;

        for (int v = 0; v < graph.length; v++) {
            if (graph[node][v] == 1 && !visited[v]) {
                dfs(graph, v, visited, stack, idx);
            }
        }

        stack[idx[0]] = node;
        idx[0] = idx[0] - 1;
    }

    public static void topologicalSort(int[][] graph) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        int[] stack = new int[n];
        int[] idx = {n - 1};

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(graph, i, visited, stack, idx);
            }
        }

        System.out.print("Topological Order: ");
        for (int i = 0; i < n; i++) {
            System.out.print(stack[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[][] dag = {
            {0, 1, 1, 0, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 0, 0, 1, 1, 0},
            {0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0, 0}
        };

        topologicalSort(dag);
    }
}
