package Programmers.level2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;


public class 최댓값과_최솟값 {
    public String solution(String s) {
        String answer = "";
        ArrayList<Integer> num = new ArrayList<>();
        int length = s.split(" ").length;
        for(int i=0; i< length; i++){
            num .add(Integer.parseInt( s.split(" ")[i]));
        }
        num.sort(Comparator.reverseOrder());
        return String.valueOf(num.get(length-1))+" "+String.valueOf(num.get(0));
    }

    @Test
    public void test() {
        System.out.println(solution("1 2 3 4"));
        System.out.println(solution("-1 -2 -3 -4"));
        System.out.println(solution("-1 -1"));
    }
}
