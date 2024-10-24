package level1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class 숫자_짝꿍 {
    public String solution(String X, String Y) {
        int[] xCount = new int[10];  // 0~9까지의 숫자 카운트
        int[] yCount = new int[10];
        ArrayList<Integer> common = new ArrayList<>();

        for(char c : X.toCharArray()) {
            xCount[c - '0']++;
        }

        for(char c : Y.toCharArray()) {
            yCount[c - '0']++;
        }

        for(int i = 0; i < 10; i++) {
            int commonCount = Math.min(xCount[i], yCount[i]);
            for(int j = 0; j < commonCount; j++) {
                common.add(i);
            }
        }

        if(common.size() == 0) {
            return "-1";
        }

        common.sort(Collections.reverseOrder());

        if(common.get(0) == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for(int num : common) {
            result.append(num);
        }

        return result.toString();
    }
    @Test
    public void test(){
        System.out.println(solution("100","2345"));
        System.out.println(solution("100","203045"));
        System.out.println(solution("100","123450"));
        System.out.println(solution("12321","42531"));
        System.out.println(solution("5525","1255"));
    }
}
