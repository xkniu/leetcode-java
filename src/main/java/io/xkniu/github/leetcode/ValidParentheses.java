package io.xkniu.github.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * #20, https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    deque.addFirst(s.charAt(i));
                    break;
                case ')':
                    if (deque.isEmpty() || deque.remove() != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (deque.isEmpty() || deque.remove() != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (deque.isEmpty() || deque.remove() != '{') {
                        return false;
                    }
                    break;
            }
        }
        return deque.isEmpty();
    }

    public boolean isValid1(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        char[] pairs = new char[]{ '(', ')', '[', ']', '{', '}' };
        Deque<Character> deque = new ArrayDeque<>(s.length());
        for (int i = 0; i < s.length(); ++i) {
            int pairsIndex = 0;
            for (int j = 0; j < pairs.length; ++j) {
                if (pairs[j] == s.charAt(i)) {
                    pairsIndex = j;
                    break;
                }
            }
            if ((pairsIndex & 1) == 0) {
                deque.push(pairs[pairsIndex]);
            } else {
                if (deque.isEmpty() || deque.pop() != pairs[pairsIndex - 1]) {
                    return false;
                }
            }
        }
        return deque.isEmpty();
    }
}
