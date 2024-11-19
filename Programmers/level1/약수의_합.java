package Programmers.level1;

import org.junit.Test;

public class 약수의_합 {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                answer += i;
            }
        }
        return answer;
    }

    @Test
    public void test() {
        System.out.println(solution(12));
        System.out.println(solution(5));
    }
}


