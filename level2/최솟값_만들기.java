package level2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class 최솟값_만들기 {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        ArrayList<Integer> arrA = new ArrayList<>();
        ArrayList<Integer> arrB = new ArrayList<>();

        for(int i=0; i<A.length; i++){
            arrA.add(A[i]);
            arrB.add(B[i]);
        }

        Collections.sort(arrA);
        Collections.sort(arrB,Collections.reverseOrder());

        for(int i=0; i<A.length; i++){
            answer += (arrA.get(i) * arrB.get(i));
        }


        return answer;
    }
    @Test
    public void test(){
        System.out.println(solution(new int[]{1, 4, 2},new int[]{5, 4, 4}));
        System.out.println(solution(new int[]{1,2},new int[]{3,4}));
    }
}
