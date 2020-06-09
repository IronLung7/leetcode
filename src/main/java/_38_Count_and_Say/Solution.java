package _38_Count_and_Say;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countAndSay(6));
    }
    public String countAndSay(int n) {
        String num = "1";
        for (int i = 1 ; i < n ; i ++) {
            num = generate(num);
        }

        return num;
    }

    public String generate(String num) {
        StringBuilder sb = new StringBuilder();
        String sub;
        int index = 0;
        while (index < num.length()){
            int count = 1;
            char c = num.charAt(index);
            index ++;
            for (int i = index; i < num.length(); i ++){
                if (num.charAt(i) == c) {
                    count ++;
                    index ++;
                } else {
                    break;
                }
            }
            sb.append(count);
            sb.append(c);
        }
        return sb.toString();
    }
}
