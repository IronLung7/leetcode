package _62_Unique_Paths;

import java.math.BigInteger;

class Solution {
    public static void main (String args []) {
        Solution solution = new Solution();
        System.out.println(solution.uniquePaths(10,10));
    }

    public int helper(int m,int n,int[][] cache){
        if(m==0 || n==0)
            return 1;
        if(cache[m][n]!=0)
            return cache[m][n];
        int x = helper(m-1,n,cache);
        int y = helper(m,n-1,cache);
        cache[m][n]=x+y;
        System.out.println("HELPER");
        return x+y;
    }
    public int uniquePaths(int m, int n) {
        if(m==0 && n==0)
            return 0;
        if(m==0 || n==0)
            return 1;
        int[][] cache = new int[m][n];
        return helper(m-1,n-1,cache);
    }

    public int uniquePaths2(int m, int n) {
        if (m ==0 || n == 0){
            return 0;
        }
        m --;
        n --;
        int sum = n + m;
        int min = Math.min(m,n);
        if (m > 0 && n > 0) {
            return get(sum , sum - min +1).divide(get(min)).intValue();
        } else {
            return 1;
        }
    }

    public BigInteger get(int n  , int end) {
//        System.out.println(n+ "  "+ end);
        BigInteger ret = new BigInteger(n+"");
        while (n > end) {
            n -- ;
            ret = ret.multiply(new BigInteger(n+""));
//            System.out.println(n);
        }
//        System.out.println(ret);
        return ret;
    }
    public BigInteger get(int n ) {
        BigInteger ret = new BigInteger(n+"");
        while (n>1) {
            n -- ;
            ret = ret.multiply(new BigInteger(n+""));
//            System.out.println("*"+n);
        }
//        System.out.println(ret);
        return ret;
    }

    public int steps(int m, int n){
        if (m > 0 && n > 0 ) {
            return steps(m - 1, n) + steps(m, n - 1);
        }else if (m == 0 && n == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}