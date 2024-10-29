package level2;

import org.junit.Assert;
import org.junit.Test;

public class JadenCase_문자열_만들기 {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isFirst = true;  // 첫 문자 여부를 판단하는 플래그

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                answer.append(c);
                isFirst = true;  // 공백 다음은 새로운 단어의 시작
            } else {
                if (isFirst) {
                    answer.append(Character.toUpperCase(c));
                    isFirst = false;
                } else {
                    answer.append(Character.toLowerCase(c));
                }
            }
        }

        return answer.toString();
    }

    @Test
    public void test() {
        // 기본 테스트
        Assert.assertEquals("3people Unfollowed Me", solution("3people unFollowed me"));
        Assert.assertEquals("For The Last Week", solution("for the last week"));

        // 공백이 여러 개인 경우
        Assert.assertEquals("For  The  Last  Week", solution("for  the  last  week"));

        // 문자열 끝에 공백이 있는 경우
        Assert.assertEquals("For The Last Week ", solution("for the last week "));

        // 문자열 시작에 공백이 있는 경우
        Assert.assertEquals(" For The Last Week", solution(" for the last week"));

        // 한 글자인 경우
        Assert.assertEquals("A", solution("a"));
        Assert.assertEquals("A", solution("A"));

        // 숫자로만 이루어진 경우
        Assert.assertEquals("123", solution("123"));

        // 공백으로만 이루어진 경우
        Assert.assertEquals("   ", solution("   "));
    }
}
