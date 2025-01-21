class Solution {
    public long gridGame(int[][] grid) {
        long firstSum=0;
        long secondSum=0;
        for(int i=0;i<grid[0].length;i++){
            firstSum+=grid[0][i];
        }long minIndex=Long.MAX_VALUE;
        for(int turn=0;turn<grid[0].length;turn++){
            firstSum-=grid[0][turn];
            minIndex=Math.min(minIndex,Math.max(firstSum,secondSum));
            secondSum+=grid[1][turn];
        }return minIndex;
    }
}