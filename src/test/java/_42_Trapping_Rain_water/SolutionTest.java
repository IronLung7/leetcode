package _42_Trapping_Rain_water;

import _23_Merge_k_Sorted_Lists.*;

/**
 * Created by zhu on 2017/3/19.
 */
public class SolutionTest {
    private Solution mSolution;


    @org.junit.Before
    public void setUp() throws Exception {
        mSolution = new Solution();
    }

    @org.junit.Test
    public void getTrap() throws Exception {
//        System.out.println(mSolution.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
        System.out.println(mSolution.trap(new int[]{0,5,6,4,6,1,0,0,2,7}));
    }
}
