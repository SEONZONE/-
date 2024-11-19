package Programmers.level1;

import org.junit.Test;


public class 없는_숫자_더하기 {
    public int solution(int[] numbers) {
        int answer = 45;
        for(int i=0; i<numbers.length; i++){
            answer -= numbers[i];
        }
        return answer;
    }

    @Test
    public void test() {
        System.out.println(solution(new int[]{1,2,3,4,6,7,8,0}));
        System.out.println(solution(new int[]{5,8,4,0,6,7,9}));
    }
}
