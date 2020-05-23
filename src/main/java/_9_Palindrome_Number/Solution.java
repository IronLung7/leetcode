package _9_Palindrome_Number;

import java.util.Arrays;

public class Solution {
    public static void main(String [] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome2(112211));
        System.out.println(solution.getNumber(12345,2));
    }

    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int origin = x;
        int high = 0;
        int revert = 0;
        int count = 0;
        while (x >0 ) {
            x = x /10;
            high ++;
        }
        high = (""+x).length();

        x = origin;
        while (x > 0) {
            int num = x % 10;
//            System.out.println("revert："+revert + "   pow:"+num * Math.pow(10, high - count - 1)) ;
            revert += num * Math.pow(10, high - count - 1);
            if (revert == Integer.MAX_VALUE)
                return false;
//            System.out.println("after:"+ revert);
            count ++;
            x = x /10;
        }

        if (origin == revert) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPalindrome2(int x) {
        if (x < 0)
            return false;
        int high = 0;
        int origin = x;
        while (x >0 ) {
            x = x /10;
            high ++;
        }

        int numbers[] = new int[high];
        int index = 0 ;
        x = origin;
        while (x > 0 ) {
            numbers[high - 1 - index] = x %10;
            x = x /10;
            index ++;
        }
        System.out.println(Arrays.toString(numbers));

            for (int i = 0; i < high/2 ; i ++) {
                if (numbers[i] != numbers[high - i -1]){
                    return false;
                }
            }
            return true;


    }

    public int getNumber(int num, int index) {
        return (int) (num / Math.pow(10, index) % 10);
    }
}
