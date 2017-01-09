package _22_Generate_Parentheses;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhu on 2017/1/9.
 */
public class Solution {
    int length = 0;
    List<String> results = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        length = n * 2;
        if (n < 1)
            return results;
        concat("", 0, n, 0);
        return results;
    }

    public void concat(String result, int index, int leftNum, int rightNum) {
        if (index >= this.length) {
            results.add(result);
        }
        if (rightNum > 0) {
            concat(result.concat(")"), index + 1, leftNum, rightNum - 1);
        }
        if (leftNum > 0) {
            concat(result.concat("("), index + 1, --leftNum, rightNum + 1);
        }
    }
}