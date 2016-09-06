package _84_Largest_Rectangle_in_Histogram;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by leo on 16/9/6.
 */
public class SolutionTest {

    private Solution mSolution;

    @org.junit.Before
    public void setUp() throws Exception {
        mSolution = new Solution();
    }

    @Test
    public void testLargestRectangleArea() throws Exception {
        int[] input = {2,1,5,6,2,3};
        System.out.println(mSolution.largestRectangleArea(input));

        int [] input2 = new int [20000];

        for (int i =0 ; i<input2.length;i++){
            input2[i]=i;
        }


        System.out.println(mSolution.largestRectangleArea(input2));
    }
}