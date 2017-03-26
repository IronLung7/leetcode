package _64_Minimum_Path_Sum;

import java.util.Arrays;

/**
 * Created by apple on 2017/3/21.
 */
public class Solution {
    public int minPathSum(int[][] grid) {
        if (grid.length == 0)
            return 0;
        int rows = grid.length;
        int cols = grid[0].length;

        int[][] data = new int[rows][cols];
        data[0][0] = grid[0][0];
        for (int i = 1; i < rows; i++) {   //初始化第一行和第一列
            data[i][0] = data[i - 1][0] + grid[i][0];
        }

        for (int j = 1; j < cols; j++) {
            data[0][j] = data[0][j - 1] + grid[0][j];
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < rows; j++) {
                data[i][j] = Integer.min(data[i - 1][j], data[i][j - 1]) + grid[i][j];  //对于i,j 选择min((i-1,j),(i,j-1))
            }
        }

        return data[rows-1][cols-1];
    }

    public int minPathSum2(int[][] grid){  //优化额外空间，m*n->2*m 只记录第i-1行
        if(grid.length == 0)
            return 0;
        int rows = grid.length;
        int cols = grid[0].length;
        int[] pre = new int[cols];
        int[] cur = new int[cols];

        pre[0] = grid[0][0];
        for(int i=1;i<cols;i++){
            pre[i] = pre[i-1] + grid[0][i];
        }

        for(int i=1;i<rows;i++){
            cur[0] = grid[i][0] + pre[0];
            for(int j=1;j<cols;j++){
                cur[j] = Integer.min(cur[j-1],pre[j])+grid[i][j];
            }
            pre = cur;
        }
        return pre[cols-1];
    }

    public int minPathSum3(int[][] grid){ //只用O(n)的空间
        if(grid.length == 0)
            return 0;
        int rows = grid.length;
        int cols = grid[0].length;

        int[] pre = new int[cols];
        pre[0] = grid[0][0];
        for(int i=1;i<cols;i++){
            pre[i] = pre[i-1]+grid[0][i];
        }
        int cur;
        for(int i=1;i<rows;i++){
            cur = pre[0] + grid[i][0];
            pre[0] = cur;
            for(int j=1;j<cols;j++){
                cur = Integer.min(cur,pre[j]) + grid[i][j];
                pre[j] = cur;
            }

        }

        return pre[cols-1];
    }

    public static void main(String[] args){
        int[][] grid = {{10,5,7,4},{9,11,12,16},{1,2,4,9},{15,1,1,2}};
        Solution solution = new Solution();
        System.out.println(solution.minPathSum3(grid));
    }
}
