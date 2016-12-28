package _4_Median_of_Two_Sorted_Arrays;

/**
 * Created by zhu on 2016/12/27.
 */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        if (size % 2 == 1 ){
            int i = 0;
            int j = 0;
            int max = 0;
            int index = 0;
            while (index != size / 2 + 1 ) {
                if (i < nums1.length && j < nums2.length) {
                    if (nums1[i] <= nums2[j]){
                        max = nums1[i];
                        i ++;
                    } else {
                        max = nums2[j];
                        j++;
                    }
                } else if (i < nums1.length){
                    max = nums1[i];
                    i ++;
                } else {
                    max = nums2[j];
                    j ++;
                }
                index ++;
            }
            return max;
        } else {
            int i = 0;
            int j = 0;
            int max = 0;
            int number = 0;
            int index = 0;
            while (index != size / 2 + 1 ) {
                if (i < nums1.length && j < nums2.length) {
                    if (nums1[i] <= nums2[j]){
                        number = max;
                        max = nums1[i];
                        i ++;
                    } else {
                        number = max;
                        max = nums2[j];
                        j++;
                    }
                } else if (i < nums1.length){
                    number = max;
                    max = nums1[i];
                    i ++;
                } else {
                    number = max;
                    max = nums2[j];
                    j ++;
                }
                index ++;
            }
            return ((double)(max+number))/2;
        }
    }
}
