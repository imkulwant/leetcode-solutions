package com.kulsin.easy;

import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {

//    Runtime: 4 ms, faster than 56.11% of Java online submissions for Valid Parentheses.
//    Memory Usage: 42 MB, less than 47.84% of Java online submissions for Valid Parentheses.

    public boolean isValid(
            // '(', ')', '{', '}', '[' and ']'
            String s
    ) {
        Stack<String> stack = new Stack<>();

        char[] charArray = s.toCharArray();

        if (charArray.length % 2 != 0) {
            return false;
        }

        for (char c : charArray) {
            switch (c) {

                case '(':
                    stack.push("(");
                    break;

                case '{':
                    stack.push("{");
                    break;

                case '[':
                    stack.push("[");
                    break;

                case ')':
                    if (!stack.isEmpty() && stack.peek().equals("(")) {
                        stack.pop();
                        break;
                    } else {
                        return false;
                    }

                case '}':
                    if (!stack.isEmpty() && stack.peek().equals("{")) {
                        stack.pop();
                        break;
                    } else {
                        return false;
                    }

                case ']':
                    if (!stack.isEmpty() && stack.peek().equals("[")) {
                        stack.pop();
                        break;
                    } else {
                        return false;
                    }

                default:
                    System.out.println("Invalid input!");
                    return false;

            }
        }
        return stack.size() == 0;
    }

}
