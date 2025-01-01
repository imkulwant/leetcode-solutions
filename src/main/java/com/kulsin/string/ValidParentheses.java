package com.kulsin.string;

import java.util.Stack;

/**
 * 20. Valid Parentheses
 * <p>
 * <a href="https://leetcode.com/problems/valid-parentheses">...</a>
 */
class ValidParentheses {

    /**
     * Runtime: 4 ms
     * Memory Usage: 42 MB
     */
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
