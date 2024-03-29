// https://leetcode.com/problems/max-area-of-island/


class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        boolean checked[][] = new boolean[grid.length][grid[0].length];
        int currentMax = 0;
        for(int x = 0; x < grid.length; x++) {
            for(int y = 0; y < grid[0].length; y++) {
                if(!checked[x][y] && grid[x][y] == 1) {
                    int size = search(grid, checked, x, y);
                    if(size == 0) size = 1;
                    if(size > currentMax) currentMax = size;
                }
            }
        }
        return currentMax;
    }
    
    private int search(int grid[][], boolean checked[][], int x, int y) {
        int counter = 0;
        if(x-1 >= 0) {
            if(!checked[x-1][y] && grid[x-1][y] == 1) {
                checked[x-1][y] = true;
                counter += 1 + search(grid, checked, x-1, y);
            }
            else {
                checked[x-1][y] = true;
            }
        }
        if(x+1 < grid.length) {
            if(!checked[x+1][y] && grid[x+1][y] == 1) {
                checked[x+1][y] = true;
                counter += 1 + search(grid, checked, x+1, y);
            }
            else {
                checked[x+1][y] = true;
            }
        }
        if(y-1 >= 0) {
            if(!checked[x][y-1] && grid[x][y-1] == 1) {
                checked[x][y-1] = true;
                counter += 1 + search(grid, checked, x, y-1);
            }
            else {
                checked[x][y-1] = true;
            }
        }
        if(y+1 < grid[0].length) {
            if(!checked[x][y+1] && grid[x][y+1] == 1) {
                checked[x][y+1] = true;
                counter += 1 + search(grid, checked, x, y+1);
            }
            else {
                checked[x][y+1] = true;
            }
        }
        checked[x][y] = true;
        return counter++;
        
        
    }
}
