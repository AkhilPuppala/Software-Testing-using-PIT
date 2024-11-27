package org.example;
import java.util.*;
public class constructGridLayout {
    public int[][] constructGrid(int n, int[][] edges) {
        // Check for edge cases
        if (n <= 0) {
            throw new IllegalArgumentException("Number of nodes must be positive.");
        }
        if (edges.length < n - 1) {
            throw new IllegalArgumentException("Insufficient edges to construct a grid.");
        }

        // Building the graph
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            graph.computeIfAbsent(edge[0], k -> new HashSet<>()).add(edge[1]);
            graph.computeIfAbsent(edge[1], k -> new HashSet<>()).add(edge[0]);
        }

        // Check for connectivity
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        if (!graph.isEmpty()) {
            queue.add(graph.keySet().iterator().next());
            visited[queue.peek()] = true;
        }
        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int neighbor : graph.getOrDefault(current, Collections.emptySet())) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i] && graph.containsKey(i)) {
                throw new IllegalArgumentException("Graph is disconnected.");
            }
        }

        // Corner node search
        int minEdges = Integer.MAX_VALUE;
        int minNode = -1;
        for (int node : graph.keySet()) {
            int cnt = graph.get(node).size();
            if (cnt < minEdges) {
                minEdges = cnt;
                minNode = node;
            }
        }

        if (minNode == -1) {
            return new int[n][n]; // Edge case: No edges, return empty grid
        }

        // Building grid diagonal layer by layer
        List<List<Integer>> diags = new ArrayList<>();
        visited = new boolean[n];
        int nodesCnt = 1;
        diags.add(List.of(minNode));
        visited[minNode] = true;
        int h = 1;
        int w = 1;
        boolean hwLimited = false;

        while (nodesCnt < n) {
            List<Integer> lastLayer = diags.get(diags.size() - 1);
            List<Integer> nextLayer = new ArrayList<>(lastLayer.size() + 1);

            // Processing next cells with 2 predecessors
            for (int i = 1; i < lastLayer.size(); i++) {
                int node1 = lastLayer.get(i - 1);
                int node2 = lastLayer.get(i);

                if (!graph.containsKey(node1) || !graph.containsKey(node2)) {
                    continue; // Skip if neighbors are invalid or not found
                }

                Set<Integer> commonNeibs = new HashSet<>(graph.get(node1));
                commonNeibs.retainAll(graph.get(node2));
                for (int next : commonNeibs) {
                    if (!visited[next]) {
                        nextLayer.add(next);
                        visited[next] = true;
                        nodesCnt++;
                        break;
                    }
                }
            }

// Border cells with 1 predecessor
            boolean firstFound = false;
            if (!lastLayer.isEmpty()) {
//                boolean firstFound = false;
                for (int nextBorder : graph.getOrDefault(lastLayer.get(0), Collections.emptySet())) {
                    if (!visited[nextBorder]) {
                        nextLayer.add(0, nextBorder);
                        visited[nextBorder] = true;
                        nodesCnt++;
                        firstFound = true;
                        break;
                    }
                }

                boolean lastFound = false;
                for (int nextBorder : graph.getOrDefault(lastLayer.get(lastLayer.size() - 1), Collections.emptySet())) {
                    if (!visited[nextBorder]) {
                        nextLayer.add(nextBorder);
                        visited[nextBorder] = true;
                        nodesCnt++;
                        lastFound = true;
                        break;
                    }
                }
            }


            diags.add(nextLayer);

            if (lastLayer.size() + 1 == nextLayer.size()) {
                h++;
                w++;
            } else if (!hwLimited) {
                if (firstFound) {
                    w++;
                } else {
                    h++;
                }
                hwLimited = true;
            }
        }

        int hw = diags.size() + 1;
        if (h < w) {
            w = hw - h;
        } else {
            h = hw - w;
        }

        int[][] result = new int[h][w];
        int dNum = 0;
        int firstRow = 0;
        for (List<Integer> diag : diags) {
            int row = firstRow;
            int col = dNum - row;
            if (col == w) {
                firstRow++;
                row++;
                col--;
            }
            for (int node : diag) {
                result[row++][col--] = node;
            }
            dNum++;
        }
        return result;
    }

}
