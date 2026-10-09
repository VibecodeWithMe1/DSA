//dfs

import java.util.*;

class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        int V = adj.size(); // Number of vertices in the graph
        
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        // Start BFS traversal from node 0
        queue.add(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            ans.add(node);

            // Traverse all unvisited adjacent neighbors of current node
            for (int nei : adj.get(node)) {
                if (!visited[nei]) {
                    visited[nei] = true;
                    queue.add(nei);
                }
            }
        }

        return ans;
    }
}
