package Programmers.level1;


//함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
// 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

import org.junit.Assert;
import org.junit.Test;

public class x만큼_간격이_있는_n개의_숫자 {
    public long[] solution(int x, int n) {
        long[] answer = {};
        answer = new long[n];
        long temp = 0;

        for(int i=0; i<n; i++){
            temp += x;
            answer[i] = temp;

        }
        return answer;
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(new long[]{2, 4, 6, 8, 10},solution(2,5));
        Assert.assertArrayEquals(new long[]{4,8,12},solution(4,3));
        Assert.assertArrayEquals(new long[]{-4,-8},solution(-4,2));
    }
}
