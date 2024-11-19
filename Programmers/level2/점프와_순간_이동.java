package Programmers.level2;

import org.junit.Test;

public class 점프와_순간_이동 {
    public int solution(int n) {
        int result = 0;
        while(n != 0 || n >= 1000000000){
            if(n % 2 ==0){
                n /= 2;
            }else{
                n--;
                result++;
            }
        }
        return result;
    }

    @Test
    public void test(){
        System.out.println(solution(5));
        System.out.println(solution(6));
        System.out.println(solution(5000));
    }
}
