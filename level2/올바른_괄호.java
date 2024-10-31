package level2;

import org.junit.Assert;
import org.junit.Test;


public class 올바른_괄호 {
    boolean solution(String s) {
        int open = 0;
        for (int i = 0; i < s.length(); i++) {
            open += s.charAt(i) == '(' ?  1 : -1;
            if(open < 0 ) return false;
        }

        return open != 0 ? false : true;
    }

    @Test
    public void test() {
        Assert.assertEquals(true, solution("()()")); // true
        Assert.assertEquals(true, solution("(())()")); // true
        Assert.assertEquals(false, solution(")(")); // false
        Assert.assertEquals(false, solution("())")); // false
        Assert.assertEquals(false, solution(")()(")); // false
        Assert.assertEquals(false, solution("()))((()")); // false
    }
}
