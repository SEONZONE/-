package Programmers.level1;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class 폰켓몬 {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxCount = nums.length / 2;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        if(set.size()>maxCount){
            return maxCount;
        }
        return set.size();
    }

    @Test
    public void test(){
//        System.out.println(solution(new int[]{3,1,2,3}));
        Assert.assertEquals(2, solution(new int[]{3,1,2,3}));
        Assert.assertEquals(3, solution(new int[]{3,3,3,2,2,4}));
        Assert.assertEquals(2, solution(new int[]{3,3,3,2,2,2}));
    }
}
