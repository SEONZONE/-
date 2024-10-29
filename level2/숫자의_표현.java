package level2;

import org.junit.Assert;
import org.junit.Test;

public class 숫자의_표현 {


    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {    // 1부터 시작
            int sum = 0;
            for (int j = i; j <= n; j++) { // j도 n까지만
                sum += j;
                if (sum == n) {
                    answer++;
                    break;
                }
                if (sum > n) {             // 합이 n보다 커지면 더 이상 계산할 필요 없음
                    break;
                }
            }
        }

        return answer;
    }

    @Test
    public void test() {
//        Assert.assertEquals(4, solution(15));
//        Assert.assertEquals(1, solution(1));
//        Assert.assertEquals(1, solution(2));
        Assert.assertEquals(2, solution(3));
//        Assert.assertEquals(2, solution(10));
    }

}
