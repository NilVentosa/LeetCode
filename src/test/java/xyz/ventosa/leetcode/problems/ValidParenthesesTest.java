package xyz.ventosa.leetcode.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

    @Test
    void valid() {
        Assertions.assertTrue(new ValidParentheses().isValid("()"));
        Assertions.assertTrue(new ValidParentheses().isValid("({{{}}})"));
        Assertions.assertTrue(new ValidParentheses().isValid("{}[]()"));
        Assertions.assertTrue(new ValidParentheses().isValid(""));
    }

    @Test
    void invalid() {
        Assertions.assertFalse(new ValidParentheses().isValid("("));
        Assertions.assertFalse(new ValidParentheses().isValid(")"));
        Assertions.assertFalse(new ValidParentheses().isValid("()()("));
        Assertions.assertFalse(new ValidParentheses().isValid(")()()("));
        Assertions.assertFalse(new ValidParentheses().isValid(")()()("));
        Assertions.assertFalse(new ValidParentheses().isValid("(]"));
        Assertions.assertFalse(new ValidParentheses().isValid("(("));
    }
}