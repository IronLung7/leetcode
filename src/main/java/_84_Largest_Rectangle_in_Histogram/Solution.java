package _84_Largest_Rectangle_in_Histogram;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by leo on 16/9/6.
 */
public class Solution {

    int mMaxArea = 0;

    public int largestRectangleArea(int[] heights) {
        if (heights.length == 0) {
            return 0;
        }
//        Set heightSet = getHeight(heights);
//        Iterator<Integer> iterator = heightSet.iterator();
//        System.out.println(heightSet.toString());
//        while (iterator.hasNext()) {
        for (int i = 0; i < heights.length; i++) {

            int height = heights[i];
            int maxNum = getMaxNumber(height, heights);
            int area = height * maxNum;
            if (area > mMaxArea) {
                mMaxArea = area;
            }
        }
        return mMaxArea;
    }

//    public Set getHeight(int[] height) {
//        Set set = new HashSet<Integer>();
//        for (int i = 0; i < height.length; i++) {
//            set.add(height[i]);
//        }
//        return set;
//    }

    public int getMaxNumber(int height, int[] heights) {
        int[] temp = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] >= height) {
                temp[i] = 1;
            }
        }

        int maxNum = 0;
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            if (count > maxNum) {
                maxNum = count;
            }
        }
        return maxNum;
    }
}
