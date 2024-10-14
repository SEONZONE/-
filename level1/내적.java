package level1;

import org.junit.Assert;
import org.junit.Test;

public class 내적 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i=0; i<a.length; i++){
            answer += (a[i]*b[i]);
        }
        return answer;
    }

    @Test
    public void test() {
        Assert.assertEquals(3,solution(new int[]{1,2,3,4},new int[]{-3,-1,0,2}));
        Assert.assertEquals(-2,solution(new int[]{-1,0,1},new int[]{1,0,-1}));
    }

}
