class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();

        for(int i=0; i<grid.length; i++ ){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 0)
                    q.offer(new int[]{i,j});
            }
        }

        int[][] directions = { {0,1}, {0,-1}, {1,0}, {-1,0}};

        while(!q.isEmpty()){
            int[] cell = q.poll();
            int r = cell[0];
            int c = cell[1];

            for(int[] direction: directions){
                int nr = r + direction[0];
                int nc = c + direction[1];

                if (nr<0 || nr>=grid.length || nc<0 || nc>=grid[0].length)
                    continue;
                if (grid[nr][nc] != Integer.MAX_VALUE)
                    continue;

                grid[nr][nc] = grid[r][c] + 1;
                q.offer(new int[]{nr, nc});
            }
        }
    }
}
