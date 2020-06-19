import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class testFlipAndInvertImageTest {

    @Test
    public void testFlipAndInvertImageTest(){
        FlipAndInvertImage flipAndInvertImage
                = new FlipAndInvertImage();
        assertThat(flipAndInvertImage.flipAndInvertImage(
                new int[][]{{1,1,0},{1,0,1},{0,0,0}}),
        is(equalTo(new int[] {{0,0,1},{0,1,0},{1,1,1}})));
    }

    //Input: [[1,1,0],[1,0,1],[0,0,0]]
    //Output: [[1,0,0],[0,1,0],[1,1,1]]
}