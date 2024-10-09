package level1;


//두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
//예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

import org.junit.Test;

public class 두_정수_사이의_합 {
    public long solution(int a, int b) {
        long answer = 0;
        int length ;
        int start;
        if(b - a >= 0){
            length = b;
            start = a;
        }else{
            length = a;
            start = b;
        }
        for(int i=start; i<=length; i++){
            answer += i;
        }
        return answer;
    }

    @Test
    public void teset(){
        System.out.println(solution(3,5));
        System.out.println(solution(3,3));
        System.out.println(solution(5,3));
    }
}
