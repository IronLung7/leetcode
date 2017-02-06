package _11_Container_With_Most_Water;

/**
 * Created by zhu on 2017/1/30.
 */
public class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int startHeight=height[start];
        int endHeight=height[end];
        int maxArea = (end-start)* Math.min(startHeight,endHeight);
        while (start < end) {
            if(startHeight < height[start] || endHeight < height[end]){
                startHeight = Math.max(startHeight, height[start]);
                endHeight = Math.max(endHeight, height[end]);
                int size = (end-start)* Math.min(startHeight,endHeight);
                maxArea = Math.max(size,maxArea);
            }

            if (startHeight>endHeight) {
                end --;
            } else {
                start ++;
            }
        }

        return maxArea;
    }
}
