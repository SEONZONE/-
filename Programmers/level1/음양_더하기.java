package Programmers.level1;

import org.junit.Test;

public class 음양_더하기 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0; i<absolutes.length; i++){
            if(!signs[i]){
                absolutes[i] = absolutes[i] * -1;
            }
            answer += absolutes[i];
        }
        return answer;
    }

    @Test
    public void test() {
        System.out.println(solution(new int[]{4,7,12},new boolean[]{true,false,true}));
    }
}
