import org.junit.Test;

import static org.junit.Assert.*;

public class HighestScoringWordTest {

    @Test
    public void findHighestScoringWord() {
        HighestScoringWord highestScoringWord = new HighestScoringWord();
        assertEquals("f", highestScoringWord.findHighestScoringWord("a b c d e f"));
    }
}