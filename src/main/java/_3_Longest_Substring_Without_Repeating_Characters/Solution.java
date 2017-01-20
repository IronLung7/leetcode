package _3_Longest_Substring_Without_Repeating_Characters;

/**
 * Created by zhu on 2017/1/15.
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int head=0,end =0; //head and end pointer of the current substring
        int maxLength = 1;
        while (true) {
            end ++;
            if (end >= s.length()){
                //reach the end of string s
                break;
            }
            //check if last char has duplicate one in substring
            // if so, reset head pointer
            head = getHead(head, end,s);
            if (end - head + 1> maxLength){
                maxLength = end - head + 1;
            }
        }

        return maxLength;
    }

    public int getHead(int head, int end,String s) {
        int returnIndex = head;
        char endChar = s.charAt(end);
        for (int i = head; i <end; i ++){
            if (s.charAt(i) == endChar){
                returnIndex = i+1;
            }
        }
        return returnIndex;
    }
}