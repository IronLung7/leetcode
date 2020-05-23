package _20_Valid_Parentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();

        for (int i = 0 ; i < s.length() ; i ++) {
            char c = s.charAt(i);
            if (!stack.empty()) {
                if (c == ')') {
                    if (stack.pop() != '(')
                        return false;
                    else
                        continue;
                }
                if (c == ']') {
                    if (stack.pop() != '[')
                        return false;
                    else
                        continue;
                }

                if (c == '}') {
                    if (stack.pop() != '{')
                        return false;
                    else
                        continue;
                }
                stack.push(c);

            } else {
                if (c == ')' || c == ']' || c == '}')
                    return false;
                else
                    stack.push(c);
            }
        }
        if (stack.empty())
            return true;
        else
            return false;
    }
}
