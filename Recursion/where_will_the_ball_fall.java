class Solution {
    int r;int c;
    int dfs(int i, int j, int[][] grid){
        if(i>=r) return j;
        
       if(j+1<c && grid[i][j]==1 && grid[i][j+1]==1){
            return dfs(i+1,j+1,grid);
        }
         else if(j-1>=0 && grid[i][j]==-1 && grid[i][j-1]==-1){
            return dfs(i+1,j-1,grid);
        }
        
        else return -1;
    }
    public int[] findBall(int[][] grid) {
        r=grid.length;
         c=grid[0].length;
        int ans[]=new int[c];
        for(int j=0;j<c;j++){
            ans[j]=dfs(0,j,grid);
        }
        return ans;
    }
}
