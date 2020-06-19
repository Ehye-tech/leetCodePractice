import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class BubbleSortTest {

    @Test
    public void testBubbleSort(){
        BubbleSort bubbleSort = new BubbleSort();
        assertThat(bubbleSort.bubbleSort(new int[] {4, 7, 2, 3, 8}), is(equalTo(new int[] {2, 3, 4, 7, 8})));
    }
}