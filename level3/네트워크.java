package level3;

import org.junit.Assert;
import org.junit.Test;

public class 네트워크 {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] check = new boolean[n];
        for(int i=0; i<n; i++){
            if(!check[i]){
                dfs(computers,i,check);
                answer++;
            }

        }
        return answer;
    }

    public boolean[] dfs(int[][] computers,int n,boolean[] check){
        check[n] = true;
        for(int i=0; i< computers.length; i++){
            if(i != n && check[i] == false && computers[n][i] == 1){
                dfs(computers,i,check);
            }
        }
        return check;
    }

    @Test
    public void test() {
        Assert.assertEquals(2,solution(3,new int[][]{{1, 1, 0},{1, 1, 0},{0, 0, 1}}));
    }
}
