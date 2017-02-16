package _7_Reverse_Integer;

import java.util.Stack;

/**
 * Created by zhu on 2017/1/20.
 */
public class Solution {
    public int reverse(int x) {
        boolean isNegative = false;
        if (x == Integer.MIN_VALUE){
            return 0;
        }
        if (x <0) {
            isNegative = true;
        }
        x = Math.abs(x);
        Stack<Integer> stack = new Stack<>();
        do {
            stack.add(x%10);
            x = x/10;
        } while (x != 0);

        double ret = 0;
        int i = 0;
        while(!stack.isEmpty()){
            double add = stack.pop() * Math.pow(10,i);
            ret += add;
            i++;
        }

        if (ret > Integer.MAX_VALUE){
            return 0;
        }

        if (isNegative){
            return (int)ret * -1;
        }
        return (int)ret;

    }
}
