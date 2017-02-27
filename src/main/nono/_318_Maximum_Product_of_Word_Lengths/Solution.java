package _318_Maximum_Product_of_Word_Lengths;


/**
 * Created by apple on 2017/2/27.
 */

import java.util.ArrayList;

/**
 * 题中word只包含小写字母，只有26位，可以用32位的int中的后26位对应26个字母
 * 若为1，说明对应位置的字母出现过，每个单词可以由一个int数字表示
 * 如果两个数字 与 操作结果为0，则没有共同字母。
 * 神TM想得到。。。
 */

public class Solution {
    public int maxProduct(String[] words) {
        if (words == null || words.length <= 1)
            return 0;
        int[] mask = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (char c : words[i].toCharArray()) {
                mask[i] |= (1 << c - 'a');
            }
        }

        int maxProduct = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (((mask[i] & mask[j]) == 0) && words[i].length() * words[j].length() > maxProduct) {
                    maxProduct = words[i].length() * words[j].length();
                }
            }
        }

        return maxProduct;


    }
}
