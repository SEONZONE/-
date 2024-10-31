package level2;

import org.junit.Test;

public class 다음_큰_숫자 {
    public int solution(int n) {
        int answer = 0;
        int oNum = oneNumber(Integer.toBinaryString(n));
        for(int i=n+1; i<1000000; i++){
            if(oneNumber(Integer.toBinaryString(i)) == oNum){
                answer = i;
                break;
            }
        }
        return answer;
    }

    public int oneNumber(String bit){
        int count = 0;
        for(int i=0; i<bit.length(); i++){
            if(bit.charAt(i) == '1') count ++;
        }
        return count;
    }

    @Test
    public void test() {
        System.out.println(solution(78));
        System.out.println(solution(15));
    }
}


