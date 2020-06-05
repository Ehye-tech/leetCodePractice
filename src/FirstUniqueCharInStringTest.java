import org.junit.Test;

import static org.junit.Assert.*;

public class FirstUniqueCharInStringTest {

    @Test
    public void checkFirstUniqueCharacter() {
        // obj 하나 만들어주고
        FirstUniqueCharInString firstUniqueCharInString = new FirstUniqueCharInString();
        // 액츄얼 하나 만들어주는데, firstUniqueCharInString라는 오브젝트에 checkFirstUniqueCharacter
        // ( 헬로라는 내 결과값을 넣어서 ) 출력하는 액츄
        int actual = firstUniqueCharInString.checkFirstUniqueCharacter("hello");
        // 예상값 = 예상대로 나와줘야 되는 정
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void checkFirstUniqueCharacter2() {
        FirstUniqueCharInString firstUniqueCharInString = new FirstUniqueCharInString();
        int actual = firstUniqueCharInString.checkFirstUniqueCharacter("hello2");
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void addTest() {
        FirstUniqueCharInString firstUniqueCharInString = new FirstUniqueCharInString();
        int actual = firstUniqueCharInString.add("hello2");
        int expected = 2;
        assertEquals(expected, actual);
    }
}