package test;

import java.util.Stack;

public class Test {
    public static void main (String args[]){
        combination(new int[]{1,3,4,5,6234,324234,234},0,3,new Stack<Integer>());
    }

    public static void combination(int[] array,int currentIndex, int depth, Stack<Integer> current){
        if (depth == current.size()){
            System.out.println(current.toString());
        } else {
            for (int i =currentIndex; i < array.length;i ++){
                current.push(array[i]);
                combination(array,i+1, depth, current);
                current.pop();
            }
        }
    }
}
