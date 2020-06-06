import java.util.ArrayList;
import java.util.List;

public class HighestScoringWord {
    public String findHighestScoringWord (String sentence){
        String theHighestScoredWord = null;
        int max = 0;
        List<Integer> container = new ArrayList();
        for(String word : sentence.split(" ")) { //break down word by word
            int sum = 0;
            for (int j = 0; j < word.length(); j++) {
                sum += word.charAt(j) - 'a' + 1;
            }
            container.add(sum);
            if (sum > max) {
                max = sum;
                theHighestScoredWord = word;
            }
        }
        return theHighestScoredWord;
    }
}
