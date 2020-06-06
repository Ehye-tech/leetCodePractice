import org.junit.Test;

import static org.junit.Assert.*;

public class GreaterNumbersTest {
    @Test
    public void checkNumbersOfSmallNums1(){
        GreaterNumbers greaterNumbers = new GreaterNumbers();
        assertEquals(3, greaterNumbers.findGreaterNumbers(new int[]{1,2,3}));
    }
    @Test
    public void checkNumbersOfSmallNums2(){
        GreaterNumbers greaterNumbers = new GreaterNumbers();
        assertEquals(4, greaterNumbers.findGreaterNumbers(new int[]{6,1,2,7}));
    }
    @Test
    public void checkNumbersOfSmallNums3(){
        GreaterNumbers greaterNumbers = new GreaterNumbers();
        assertEquals(0, greaterNumbers.findGreaterNumbers(new int[]{5,4,3,2,1}));
    }

}