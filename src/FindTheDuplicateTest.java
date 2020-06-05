import org.junit.Test;

import static org.junit.Assert.*;

public class FindTheDuplicateTest {

    @Test
    public void checkFindTheDuplicateNumbersTest1(){
        FindTheDuplicate findTheDuplicate1 = new FindTheDuplicate();
        int actual = findTheDuplicate1.findTheDuplicateNumbers(new int[]{1,2,1,4,3,12});
        assertEquals(1,actual);
    }
    @Test
    public void checkFindTheDuplicateNumbersTest2() {
        FindTheDuplicate findTheDuplicate2 = new FindTheDuplicate();
        int actual = findTheDuplicate2.findTheDuplicateNumbers(new int[]{6,1,9,5,3,4,9});
        assertEquals(9,actual);
    }
    @Test
    public void checkFindTheDuplicateNumbersTest3() {
        FindTheDuplicate findTheDuplicate3 = new FindTheDuplicate();
        int actual = findTheDuplicate3.findTheDuplicateNumbers(new int[]{2,1,3,4});
        assertEquals(-1,actual);
    }

}