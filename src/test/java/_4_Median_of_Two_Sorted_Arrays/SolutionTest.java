package _4_Median_of_Two_Sorted_Arrays;


/**
 * Created by zhu on 2016/12/25.
 */
public class SolutionTest {

    private Solution mSolution;


    @org.junit.Before
    public void setUp() throws Exception {
        mSolution = new Solution();
    }

    @org.junit.Test
    public void addTwoNumbers() throws Exception {

//        System.out.println(mSolution.findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
        System.out.println(mSolution.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
    }
}
