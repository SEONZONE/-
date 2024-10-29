package level2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class 이진_변환_반복하기 {
    int totalCount = 0;
    int chg = 0;
    private int[] answer = new int[2];

    public int[] solution(String s) {

        int oneCount = 0;
        int zerCount = 0;

        if (!s.equals("1")) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '0') {
                    oneCount++;
                } else {
                    zerCount++;
                }
            }
        }


        if (oneCount <= 0) {
            answer[0] = chg;
            answer[1] = totalCount;
            totalCount = 0;
            chg = 0;

        } else {
            chg++;
            totalCount += zerCount;
            solution(Integer.toBinaryString(oneCount));
        }

        return answer;
    }


    @Test
    public void test() {
        // 기본 테스트
        Assert.assertArrayEquals(new int[]{3, 8}, solution("110010101001"));
        Assert.assertArrayEquals(new int[]{3, 3}, solution("01110"));
        Assert.assertArrayEquals(new int[]{4, 1}, solution("1111111"));

    }
}
