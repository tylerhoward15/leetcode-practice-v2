class Graph {
    class MyPair {
        int key;
        int value;

        public MyPair(int x, int y) {
            this.key = x;
            this.value = y;
        }

        public int getKey() {
            return this.key;
        }
        public int getValue() {
            return this.value;
        }
    }


    Map<Integer, List<int[]>> edgeGraph;  // k: from, v: List<[from, to, weight]>
    final int size;

    public Graph(int n, int[][] edges) {
        this.edgeGraph = new HashMap<>();
        this.size = n;

        for (int[] edge : edges) {
            if (!edgeGraph.containsKey(edge[0])) {
                edgeGraph.put(edge[0], new ArrayList<>());
            }
            edgeGraph.get(edge[0]).add(edge);
        }
    }
    
    public void addEdge(int[] edge) {
        if (!this.edgeGraph.containsKey(edge[0])) {
            this.edgeGraph.put(edge[0], new ArrayList<>());
        }
        edgeGraph.get(edge[0]).add(edge);
    }
    
    public int shortestPath(int node1, int node2) {
        int[] distances = new int[this.size];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[node1] = 0;

        Queue<MyPair> heap = new PriorityQueue<>(Comparator.comparing(MyPair::getKey));
        heap.add(new MyPair(0, node1));

        while (!heap.isEmpty()) {
            MyPair curr = heap.remove();
            int currDist = curr.getKey();
            int node = curr.getValue();
            
            if (currDist > distances[node]) {
                continue;
            }


            if (this.edgeGraph.containsKey(node)){
                for (int[] edge: this.edgeGraph.get(node)) {
                    int nei = edge[1];
                    int weight = edge[2];
                    int dist = currDist + weight;
                    
                    if (dist < distances[nei]) {
                        distances[nei] = dist;
                        heap.add(new MyPair(dist, nei));
                    }
                }
            }
        }

        return distances[node2] == Integer.MAX_VALUE ? -1 : distances[node2];
    }
}

/**
 * Your Graph object will be instantiated and called as such:
 * Graph obj = new Graph(n, edges);
 * obj.addEdge(edge);
 * int param_2 = obj.shortestPath(node1,node2);
 */