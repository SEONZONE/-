package Programmers.level2;

import org.junit.Test;

import java.util.Stack;

public class 짝지어_제거하기 {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }

    @Test
    public void test() {
        System.out.println(solution("baabaa")); // 1
        System.out.println(solution("cdcd"));   // 0
    }
}