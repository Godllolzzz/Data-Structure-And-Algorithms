class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int r = maze.length;
        int c = maze[0].length;

        int[][] dirs = {{1, 0}, {0, 1}, {-1, 0},{0, -1}};

        Queue<int[]> q = new LinkedList<>();
        maze[entrance[0]][entrance[1]] = '+';
        q.offer(new int[]{entrance[0], entrance[1], 0});

        while(!q.isEmpty()){
            int carr[] = q.poll();
            int cr = carr[0];
            int cc = carr[1];
            int cd = carr[2];
            for(int dir[] : dirs){
                int nr = cr + dir[0];
                int nc = cc + dir[1];
                if(0 <= nr && nr < r && 0 <= nc && nc < c && maze[nr][nc] == '.'){
                    if(nr == 0 || nr == r - 1 || nc == 0 || nc == c - 1) return cd + 1;
                maze[nr][nc] = '+';
                q.offer(new int[]{nr, nc, cd + 1});
                }
            }
        }
        return -1;
    }
}
