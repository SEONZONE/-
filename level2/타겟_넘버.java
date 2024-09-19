package level2;

import org.junit.Assert;
import org.junit.Test;

public class 타겟_넘버 {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(0,numbers,target,0);
        return answer;
    }

    public void dfs(int depth,int[] numbers,int target,int sum){
        if(depth==numbers.length){
            if(sum == target){
                answer ++;
            }
            return;
        }
        dfs(depth+1,numbers,target,sum+numbers[depth]);
        dfs(depth+1,numbers,target,sum - numbers[depth]);
    }

    @Test
    public void test() {
        Assert.assertEquals(5,solution(new int[]{1, 1, 1, 1, 1}, 3));
        Assert.assertEquals(2,solution(new int[]{4, 1, 2, 1}, 2));

    }
}
