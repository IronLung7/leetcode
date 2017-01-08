package _29_Divide_Two_Integers;

/**
 * Created by zhu on 2017/1/8.
 */
public class Solution {
    public int divide(int dividend, int divisor) {

        int negative = 1;
        if (dividend <0 && divisor >0 || dividend >0 && divisor <0) {
            negative = -1;
        }
        long dividendL = dividend;
        dividendL = Math.abs(dividendL);
        long divisorL = divisor;
        divisorL = Math.abs(divisorL);

        long result = divideLong( dividendL, divisorL);

        if (result >= Integer.MAX_VALUE){
            if (negative == -1){
                return Integer.MIN_VALUE;
            }else {
                return Integer.MAX_VALUE;
            }
        }else {
            return (int)result * negative;
        }

    }

    public long divideLong(long dividendLong, long divisorLong) {
        if (dividendLong < divisorLong) {
            return 0;
        }

        long result = 1;
        long sum = divisorLong;
        while (sum + sum <= dividendLong) {
            sum += sum;
            result += result;
        }

        return result + divideLong(dividendLong - sum, divisorLong);
    }
}