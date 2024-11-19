package Programmers.level1;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class 로또의_최고_순위와_최저_순위 {
    public int[] solution(int[] lottos, int[] win_nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(2,5);
        map.put(3,4);
        map.put(4,3);
        map.put(5,2);
        map.put(6,1);
        int min = 0;
        int max = 0;
        int zeroCnt = 0;

        for(int i=0; i<lottos.length; i++){
            if(lottos[i] != 0){
                for(int j=0; j<win_nums.length; j++){
                    if(lottos[i] == win_nums[j]) min ++;
                }
            }else{
                zeroCnt ++;
            }
        }

        max = min + zeroCnt;
        max = max < 2 ? 6 : map.get(max);
        min = min < 2 ? 6 : map.get(min);
        return new int[]{max,min};
    }

    @Test
    public void test(){
//        System.out.println(Arrays.toString(solution(new int[]{44, 1, 0, 0, 31, 25},new int[]{31, 10, 45, 1, 6, 19})));
        Assert.assertArrayEquals(new int[]{3,5},solution(new int[]{44, 1, 0, 0, 31, 25},new int[]{31, 10, 45, 1, 6, 19}));
        Assert.assertArrayEquals(new int[]{1,6},solution(new int[]{0, 0, 0, 0, 0, 0},new int[]{38, 19, 20, 40, 15, 25}));
        Assert.assertArrayEquals(new int[]{1,1},solution(new int[]{45, 4, 35, 20, 3, 9},new int[]{20, 9, 3, 45, 4, 35}));
    }
}
