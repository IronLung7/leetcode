package _343Integer_Break;

/**
 * Created by apple on 2017/5/9.
 */
public class Solution {

    public int integerBreak(int n) {
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;
        if (n == 4)
            return 4;
        int threes = n / 3;
        int left = n % 3;
        if (left == 0) {
            return (int) Math.pow(3, threes);
        } else if (left == 1)
            return (int) Math.pow(3, threes - 1) * 4;
        else {
            return (int) Math.pow(3, threes) * left;
        }
    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        System.out.println(solution.integerBreak(6));
    }
}
