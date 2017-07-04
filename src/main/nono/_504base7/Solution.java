package _504base7;

/**
 * Created by apple on 2017/2/28.
 */
public class Solution {
    public String convertToBase7(int num) {
        if (num == 0)
            return "0";
        boolean flag = (num > 0) ? true : false;
        num = (num > 0) ? num : num * (-1);
        String result = "";
        int tmp;
        while (num != 0) {
            tmp = num % 7;
            num /= 7;
            result = String.valueOf(tmp) + result;
        }
        if (!flag) {
            result = "-" + result;
        }
        return result;

    }
}
