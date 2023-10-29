class Solution {
    // create a map of seen coords, so mapping [x,y] to true or false

    // go through every element, if that element hasnt been seen, then add 1 to island count, and mark all bfs neighbors as seen.

    final static int X_COORD = 0;
    final static int Y_COORD = 1;

    public int numIslands(char[][] grid) {
        Set<String> visited = new HashSet<>();
        Queue<int[]> q = new LinkedList<>();
        int islandCount = 0;

        for (int i=0; i<grid.length; i++) {
            for (int k=0; k<grid[0].length; k++) {
                if (!visited.contains(i+","+k) && (grid[i][k] == Character.valueOf('1'))) {
                    islandCount++;
                    q.add(new int[]{i,k});
                }
                
                while(!q.isEmpty()) {
                    final int size = q.size();
            
                    for(int j=0; j<size; j++) {
                        int[] coord = q.poll();
                        int x = coord[X_COORD];
                        int y = coord[Y_COORD];
                        if (visited.contains(x+","+y)){
                            continue;
                        }
                        visited.add(x+","+y);

                        if (grid[x][y] == Character.valueOf('1')) {
                            if(x-1 >= 0 && !visited.contains((x-1)+","+y)) {
                                q.add(new int[]{x-1, y});
                            }
                            if(x+1 < grid.length && !visited.contains((x+1)+","+y)) {
                                q.add(new int[]{x+1, y});
                            }
                            if(y-1 >= 0 && !visited.contains(x+","+(y-1))) {
                                q.add(new int[]{x, y-1});
                            }
                            if(y+1 < grid[0].length && !visited.contains(x+","+(y+1))) {
                                q.add(new int[]{x, y+1});
                            }
                        }
                    }
                }
            }
        }

        // for (String x : visited) {
        //     System.out.println(x);
        // }
        return islandCount;
    }
}