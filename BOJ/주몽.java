package BOJ;

import java.util.Scanner;

public class 주몽 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int sum = sc.nextInt();
        int count = 0;
        int[] numList = new int[amount];
        for(int i=0; i<numList.length; i++){
            numList[i] = sc.nextInt();
        }

        for(int i=0; i<amount; i++){
            for(int j=i+1; j<amount; j++){
                if(numList[i]+numList[j] == sum) count ++;
            }
        }

        System.out.println(count);


    }
}
