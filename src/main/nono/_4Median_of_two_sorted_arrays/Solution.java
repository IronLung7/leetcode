package _4Median_of_two_sorted_arrays;

/**
 * Created by apple on 2017/7/5.
 */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;

        int i = 0, j = 0;
        int median = 0;
        int index = 0;
        int median2 = 0;

        while (index < size / 2 + 1) {
            if (size % 2 == 0 && index == size / 2) {
                median2 = median;
            }
            if (i == nums1.length) {
                median = nums2[j];
                j++;
                index++;
                continue;
            }
            if (j == nums2.length) {
                median = nums1[i];
                i++;
                index++;
                continue;
            }
            if (nums1[i] < nums2[j]) {
                median = nums1[i];
                i++;
            } else {
                median = nums2[j];
                j++;
            }
            index++;
        }

        if (size % 2 == 0)
            return (double) (median + median2) / 2;
        return (double) median;

    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        Solution solution = new Solution();
        System.out.println(solution.findMedianSortedArrays(nums1, nums2));
    }
}
