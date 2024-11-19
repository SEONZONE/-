package Programmers.level1;

import org.junit.Assert;
import org.junit.Test;

public class 비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String n2 = "%0"+n+"d";
        for(int i=0; i<arr1.length; i++){
            String arrStr1 = String.format(n2,Long.parseLong(Integer.toBinaryString(arr1[i])));
            String arrStr2 = String.format(n2,Long.parseLong(Integer.toBinaryString(arr2[i])));
            String ansStr = "";
            for(int j=0; j<n; j++){
                if(arrStr1.charAt(j) == '0'  && arrStr2.charAt(j) == '0'){
                    ansStr += " ";
                }else{
                    ansStr += "#";
                }
            }
            answer[i] = ansStr;
        }
        return answer;
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(new String[]{"#####","# # #", "### #", "#  ##", "#####"},solution(5,new int[]{9, 20, 28, 18, 11},new int[]{30, 1, 21, 17, 28}));
        Assert.assertArrayEquals(new String[]{"######", "###  #", "##  ##", " #### ", " #####", "### # "},solution(6,new int[]{46, 33, 33 ,22, 31, 50},new int[]{27 ,56, 19, 14, 14, 10}));
    }
}
