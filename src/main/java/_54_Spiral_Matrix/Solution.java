package _54_Spiral_Matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leo on 16/9/4.
 */
public class Solution {
    int mStart = 0;
    int mEnd = 0;
    int nStart = 0;
    int nEnd = 0;

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        int m = matrix.length;
        if (m == 0){
            return list;
        }
        int n = matrix[0].length;

        mStart = 0;
        mEnd = m - 1;
        nStart = 0;
        nEnd = n - 1;

        while (true){
            if (!method0(matrix, list)){
                break;
            }
            if (!method1(matrix, list)) {
                break;
            }
            if (!method2(matrix, list)) {
                break;
            }
            if (!method3(matrix, list)) {
                break;
            }
        }
        return list;
    }

    public boolean method0(int[][] matrix, List<Integer> list) {
        if (mStart <= mEnd) {
            int[] toAdd = matrix[mStart];
            for (int i = nStart; i <= nEnd; i++) {
                list.add(toAdd[i]);
            }
            mStart++;
            return true;
        }
        return false;
    }


    public boolean method1(int[][] matrix, List<Integer> list) {
        if (nStart <= nEnd && mStart <= mEnd) {
            for (int i = mStart; i <= mEnd ; i ++){
                list.add(matrix[i][nEnd]);
            }
            nEnd--;
            return true;
        }
        return false;
    }

    public boolean method2(int[][] matrix, List<Integer> list) {
        if (nStart <= nEnd && mStart <= mEnd){
            for (int i = nEnd ; i>= nStart ; i--) {
                list.add(matrix[mEnd][i]);
            }
            mEnd--;
            return true;
        }
        return false;
    }

    public boolean method3(int[][] matrix, List<Integer> list) {
        if (mEnd >=mStart ){
            for (int i = mEnd ; i>= mStart ;i --){
                list.add(matrix[i][nStart]);
            }
            nStart ++;
            return true;
        }
        return false;
    }
}
