class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {

        List<List<Integer>> adjList = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
            res.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            adjList.get(from).add(to);
        }

        for (int node = 0; node < n; node++) {
            int[] visited = new int[n];
            visited[node] = -1;
            dfs(node, visited, res, node, adjList);
        }
        return res;
    }

    private void dfs(int node, int[] visited, List<List<Integer>> res,
                     int start, List<List<Integer>> adjList) {

        for (int next : adjList.get(node)) {
            if (visited[next] == 0) {
                visited[next] = 1;
                res.get(next).add(start);
                dfs(next, visited, res, start, adjList);
            }
        }
        
    }
}