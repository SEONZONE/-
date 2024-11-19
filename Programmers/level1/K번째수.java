package Programmers.level1;

import org.junit.Test;

import java.util.Arrays;

public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int k = commands[i][2] - 1;

            int[] subArray = new int[end - start];
            for (int j = 0; j < subArray.length; j++) {
                subArray[j] = array[start + j];
            }

            Arrays.sort(subArray);

            result[i] = subArray[k];
        }

        return result;
    }
    @Test
    public void test(){
        System.out.println(Arrays.toString(solution(new int[] {1, 5, 2, 6, 3, 7, 4},new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
    }
}
