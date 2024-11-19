package Programmers.level1;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> set = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            set.put(participant[i], set.getOrDefault(participant[i], 0) + 1);
        }

        for (int i = 0; i < completion.length; i++) {
            set.put(completion[i], set.get(completion[i]) - 1);
        }

        for (int i = 0; i < participant.length; i++) {
            if (set.get(participant[i]) > 0) {
                answer = participant[i];
            }
        }

        return answer;
    }

    @Test
    public void test() {

        Assert.assertEquals("leo", solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
        Assert.assertEquals("vinko", solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}));
        Assert.assertEquals("mislav", solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
    }
}


