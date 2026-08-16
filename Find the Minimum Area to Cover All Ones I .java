class Solution {
    public int minimumArea(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int minR=Integer.MAX_VALUE, maxR=Integer.MIN_VALUE;
        int minC=Integer.MAX_VALUE, maxC=Integer.MIN_VALUE;
        for (int i=0;i < r;i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 1) {
                    if(i<minR) minR=i;
                    if(j<minC) minC=j;
                    if(i>maxR) maxR=i;
                    if(j>maxC) maxC=j;
                }
            }
        }
        int h=maxR-minR+1;
        int w=maxC-minC+1;
        return (h*w);
    }
}