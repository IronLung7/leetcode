package _12_Integer_to_Roman;

/**
 * Created by zhu on 2016/12/28.
 */
public class Solution {

    StringBuilder stringBuilder = new StringBuilder();

    public String intToRoman(int num) {
        num = step(num, 1000, "M");
        num = step(num, 900, "CM");
        num = step(num, 500, "D");
        num = step(num, 400, "CD");
        num = step(num, 100, "C");
        num = step(num, 90, "XC");
        num = step(num, 50, "L");
        num = step(num, 40, "XL");
        num = step(num, 10, "X");
        num = step(num, 9, "IX");
        num = step(num, 5, "V");
        num = step(num, 4, "IV");
        num = step(num, 1, "I");
        return stringBuilder.toString();
    }


    public void addString(String str, int times){
        while (times != 0) {
            stringBuilder.append(str);
            times--;
        }
    }

    public int step(int total, int number, String roman){
        int count = total/number;
        total = total - count*number;
        addString(roman,count);
        return total;
    }
}