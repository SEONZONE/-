package Programmers.level1;

import org.junit.Test;

import java.util.HashMap;

public class 성격_유형_검사하기 {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String[] result = new String[4];
        String[] mbti = {"RT", "CF", "JM", "AN"};
        int[] score = {0, 3, 2, 1, 0, 1, 2, 3};
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < survey.length; i++) {
            String first = String.valueOf(survey[i].charAt(0));
            String second = String.valueOf(survey[i].charAt(1));
            if (choices[i] >= 4) {
                map.put(second, map.getOrDefault(second, 0) + score[choices[i]]);
            } else {
                map.put(first, map.getOrDefault(first, 0) + score[choices[i]]);
            }
        }

        for (int i = 0; i < result.length; i++) {
            String first = String.valueOf(mbti[i].charAt(0));
            String second = String.valueOf(mbti[i].charAt(1));
            result[i] = map.getOrDefault(first, 0) >= map.getOrDefault(second, 0) ? first : second;
        }

        for (String word : result) {
            answer += word;
        }
        return answer;
    }

    @Test
    public void test() {

        // 점수 누적이 필요한 케이스
        // 예상결과: "RCJA"
        System.out.println(solution(new String[]{"RT", "RT", "RT"}, new int[]{2, 3, 2}));


    }
}
