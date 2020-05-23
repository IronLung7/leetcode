package Sort;

import java.util.Arrays;

public class QuickSort {

    public static void main (String args[]) {
        int [] array = new int[]{23,52,1,534,5,31,43,53345,543,40};
        quickSort(array, 0 ,array.length -1);
        System.out.println(Arrays.toString(array));

    }


    public static void quickSort(int[] array, int start, int end){
        if (start<end){
            int l =start, r= end, value = array[start];

            while (l < r) {
                while(l < r && value <= array[r])
                    r --;
                array[l] = array[r];

                while (l < r && value >= array[l])
                    l ++;
                array[r] = array[l];
            }

            array[l] = value;
            quickSort(array, start, l -1 );
            quickSort(array, l +1 , end );
        }

    }
}
