package level1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 개인정보_수집_유효기간 {
    public int[] solution(String today, String[] terms, String[] privacies) {
        HashMap<String, Integer> termsMap = new HashMap<>();
        ArrayList<Integer> answerList = new ArrayList<>();

        // terms 처리
        for (String term : terms) {
            String[] keyValue = term.split(" ");
            termsMap.put(keyValue[0], Integer.parseInt(keyValue[1]));
        }

        // today 날짜를 일수로 변환
        String[] todayArr = today.split("\\.");
        int todayDays = (Integer.parseInt(todayArr[0]) * 12 * 28) +
                (Integer.parseInt(todayArr[1]) * 28) +
                Integer.parseInt(todayArr[2]);

        // privacies 처리
        for (int i = 0; i < privacies.length; i++) {
            String[] privacyArr = privacies[i].split(" ");
            String[] dateArr = privacyArr[0].split("\\.");

            // 수집일자를 일수로 변환하고 유효기간 추가
            int days = (Integer.parseInt(dateArr[0]) * 12 * 28) +
                    (Integer.parseInt(dateArr[1]) * 28) +
                    Integer.parseInt(dateArr[2]) +
                    (termsMap.get(privacyArr[1]) * 28) - 1;

            if (days < todayDays) {
                answerList.add(i + 1);
            }
        }

        return answerList.stream().mapToInt(i -> i).toArray();
    }

    @Test
    public void test() {
//        System.out.println(Arrays.toString(solution("2022.05.19", new String[]{"A 6", "B 12", "C 3"}, new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"})));
        System.out.println(Arrays.toString(solution("2020.01.01", new String[]{"Z 3", "D 5"}, new String[]{"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"})));
    }
//    168
}
