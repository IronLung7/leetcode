package _84_Largest_Rectangle_in_Histogram;

import java.awt.print.Pageable;
import java.util.*;

public class Solution2020 {

    public static void main(String[] args){
        Solution2020 solution2020 = new Solution2020();
        int[] test = {5,4,1,2};
        System.out.println(solution2020.largestRectangleArea(test));
    }
    public int largestRectangleArea(int[] heights) {
        Map before = new LinkedHashMap<Integer,Integer>();
        int current;
        int maxSize = 0;
        for (int index = 0; index < heights.length; index++){
            current = heights[index];
            int max = getMax(before, current);
//            System.out.println(current +" "+before+ "    max:"+maxSize);
            if (max > maxSize) {
                maxSize = max;
            }
        }

        return maxSize;
    }

    public int getMax(Map<Integer,Integer> before, int current){
        Set<Integer> toRemoved = new LinkedHashSet<>();
        int currentMaxLength = 0;
        int maxSize = 0;

        if (current == 0) {
            before.clear();
            return 0;
        }
        for (Integer height : (Set<Integer>)before.keySet()){
            if (height > current) {
                toRemoved.add(height);
                if (before.get(height) + 1 > currentMaxLength){
                    currentMaxLength = before.get(height) + 1;
                }

            } else if (height <= current) {
                int currentLength = before.get(height)+1;
                before.put(height, currentLength);
                if (currentLength * height > maxSize) {
                    maxSize = currentLength * height;
                }
            }
        }

        if (!toRemoved.isEmpty()) {
            before.keySet().removeAll(toRemoved);
        }

        if (before.containsKey(current)) {
            if (currentMaxLength > before.get(current)) {
                before.put(current, currentMaxLength);
                if (currentMaxLength * current > maxSize) {
                    maxSize = currentMaxLength * current ;
                }
            }
        } else {
            int currentLength = currentMaxLength >1 ? currentMaxLength: 1;
            before.put(current, currentLength);
            if (currentLength * current > maxSize) {
                maxSize = currentLength * current ;
            }

        }

        return maxSize;
    }
}