package level2;

import org.junit.Test;

public class 가장_큰_수 {
    public String solution(int[] numbers) {
        String answer = "";
        int factorial = 1;
        for(int i=0; i<numbers.length; i++){
            factorial *= (numbers.length - i);
        }

        int[] result = new int[factorial];

        for(int i=0; i<numbers.length; i++){
        }
        return answer;
    }

    @Test
    public void test() {
        System.out.println(solution(new int[]{6, 10, 2}));
    }
}
