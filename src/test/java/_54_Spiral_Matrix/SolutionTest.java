package _54_Spiral_Matrix;

import org.junit.Assert;

/**
 * Created by leo on 16/9/4.
 */
public class SolutionTest {

    private Solution mSolution;

    @org.junit.Before
    public void setUp() throws Exception {
        mSolution = new Solution();
    }

    @org.junit.Test
    public void testSpiralOrder() throws Exception {

//        int [][] input = new inputnt[4][5];
        int [][]input = {{1,2,3},
                         {4,5,6},
                         {7,8,9}};
        System.out.println(mSolution.spiralOrder(input).toString());



        int [][]input2 = {{1,2,3}};
        System.out.println(mSolution.spiralOrder(input2).toString());



        int [][]input3 = {{1},{2}};
        System.out.println(mSolution.spiralOrder(input3).toString());

        int [][]input4 = {{1},{2},{3}};
        System.out.println(mSolution.spiralOrder(input4).toString());
//        Assert.assertNull(mSolution.spiralOrder(input));
    }
}
