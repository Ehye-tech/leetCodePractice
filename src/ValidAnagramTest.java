import org.junit.Test;

import static org.junit.Assert.*;

public class ValidAnagramTest {
    //두가지 다른 타입 가능

    @Test
    public void checkValidAnagramTest1(){
        ValidAnagram validAnagram = new ValidAnagram();
        boolean actual = validAnagram.isAnagram("anagram", "nagaram");
        assertEquals(true,actual);
    }

    @Test
    public void checkValidAnagramTest2(){
        ValidAnagram validAnagram = new ValidAnagram();
        assertEquals(true,validAnagram.isAnagram("anagram", "nagaram"));
    }
}