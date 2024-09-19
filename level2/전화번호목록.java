package level2;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class 전화번호목록 {
    public boolean solution(String[] phone_book) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        for(int i=0;i<phone_book.length; i++){
            hashMap.put(phone_book[i],i);
        }

        for(int i=0;i<phone_book.length; i++){
            for(int j=0; j<phone_book[i].length(); j++){
                if(hashMap.containsKey(phone_book[i].substring(0,j))){
                    return false;
                }
            }
        }
        return true;
    }

    @Test
    public void test() {
        Assert.assertEquals(false,solution(new String[]{"119", "97674223", "1195524421"}));
        Assert.assertEquals(true,solution(new String[]{"123", "456", "789"}));
        Assert.assertEquals(false, solution(new String[]{"12", "123", "1235", "567", "88"}));
    }
}
