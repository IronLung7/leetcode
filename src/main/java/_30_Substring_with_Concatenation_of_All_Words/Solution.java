package _30_Substring_with_Concatenation_of_All_Words;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by zhu on 2017/1/8.
 */
public class Solution {
    int  totalSize = 0;
    public List<Integer> findSubstring(String s, String[] words) {
        List result = new LinkedList<Integer>();
        if (s == null || words == null ||words.length ==0) {
            return result;
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (String word: words){
            totalSize += word.length();
            if (map.containsKey(word)){
                map.put(word,map.get(word)+1);
            } else {
                map.put(word,1);
            }
        }
        if (totalSize > s.length()){
            return result;
        }
        String[] keys = new String[map.size()];
        int[] keyShow = new int[map.size()];

        int count = 0;
        for (String string :map.keySet()){
            keys[count] = string;
            keyShow[count] = map.get(string);
            count++;
        }

        int minIndex = getMinIndex(0,  s,  keys);
        while (minIndex != -1) {
            if (canMatch(minIndex,s,keys,keyShow)){
                result.add(minIndex);
            }
            minIndex =getMinIndex(minIndex + 1 , s, keys);
        }

        return result;
    }

    public int getMinIndex(int fromIndex, String s, String[] words){
        int minIndex = -1;
        int maxIndex = -1;
        for (String word :words){
            int index = s.indexOf(word, fromIndex);
            if (index == -1) {
                return index;
            } else {
                if (minIndex == -1 || index <minIndex){
                    minIndex = index;
                }
                if (index >maxIndex){
                    maxIndex = index;
                }
            }
        }

        return minIndex;
    }

    public boolean canMatch(int index, String s, String[] keys, int [] keyShow){
        boolean end = true;
        for (int show :keyShow) {
            if (show != 0){
                end =false;
                break;
            }
        }
        if (end){
            return true;
        }

        for (int i =0 ;i <keys.length ; i ++) {
            String word = keys[i];

            if (keyShow[i] != 0 && s.indexOf(word, index) == index) {

                int [] newKeyShow = Arrays.copyOf(keyShow, keyShow.length);
                newKeyShow[i] = newKeyShow[i] - 1;
                if (canMatch(index + word.length(), s, keys ,newKeyShow)) {
                    return true;
                }
            }
        }

        return false;
    }
}