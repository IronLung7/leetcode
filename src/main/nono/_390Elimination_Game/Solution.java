package _390Elimination_Game;

import java.util.ArrayList;

/**
 * Created by apple on 2017/5/9.
 */
public class Solution {
    public int lastRemaining(int n) {
        if (n <= 0)
            return 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int loop = 1;
        while (list.size() > 1) {
            if (loop % 2 == 1) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(i) + " ");
                    list.remove(i);
                }
                loop++;
            } else {
                for (int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(list.size() - i - 1) + " ");
                    list.remove(list.size() - i - 1);
                }
                loop++;
            }
            System.out.println();
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.lastRemaining(9);
        System.out.println("result"+result);
    }
}
