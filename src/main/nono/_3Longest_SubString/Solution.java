package _3Longest_SubString;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by apple on 2017/7/5.
 */
public class Solution {
//    public int lengthOfLongestSubstring(String s) {
//        int max = 0;
//        for (int i = 0; i < s.length(); i++) {
//            HashSet<String> set = new HashSet<>();
//            set.add(String.valueOf(s.charAt(i)));
//            for (int j = i + 1; j < s.length(); j++) {
//                if (set.contains(String.valueOf(s.charAt(j))))
//                    break;
//                set.add(String.valueOf(s.charAt(j)));
//            }
//            if (max < set.size())
//                max = set.size();
//        }
//        return max;
//    }

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.equals(""))
            return 0;
        int head = 0, end = 0;
        int maxLength = 1;
        while (true) {
            end++;
            if (end >= s.length())
                break;
            head = getHead(head, end, s);
            if (end - head + 1 > maxLength) {
                maxLength = end - head + 1;
            }

        }
        return maxLength;
    }

    public int getHead(int head, int end, String s) {
        for (int index = head; index < end; index++) {
            if (s.charAt(index) == s.charAt(end))
                return ++index;
        }
        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String test = "pwwkew";
        System.out.println(solution.lengthOfLongestSubstring(test));
    }
}
