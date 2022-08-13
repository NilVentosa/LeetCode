package xyz.ventosa.leetcode.problems;

import java.util.*;

public class ValidParentheses {

    public boolean isValid(String s) {

        if (s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                if (stack.peek() == '(' && c == ')' || stack.peek() == '[' && c == ']' || stack.peek() == '{' && c == '}') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public boolean isValidOne(String s) {

        if (s.length() == 0) {
            return true;
        }

        if (s.length() % 2 != 0) {
            return false;
        }

        Map<Character, Boolean> isOpener = new HashMap<>();
        isOpener.put('(', true);
        isOpener.put(')', false);
        isOpener.put('[', true);
        isOpener.put(']', false);
        isOpener.put('{', true);
        isOpener.put('}', false);

        if (!isOpener.get(s.charAt(0))) {
            return false;
        }

        Deque<Character> list = new LinkedList<>();

        for (char c: s.toCharArray()) {
            if(isOpener.get(c)) {
                list.add(c);
            } else if (list.isEmpty()) {
                return false;
            }
            else {
                char last = list.peekLast();
                if (last == '(' && c == ')' || last == '[' && c == ']' || last == '{' && c == '}') {
                    list.removeLast();
                } else {
                    return false;
                }
            }
        }
        return list.isEmpty();
    }
}
