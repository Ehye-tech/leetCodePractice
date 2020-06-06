
import java.util.*;
class TranslateGoatLatin{
    public String toGoatLatin(String S) {

        Set<Character> vowel = new HashSet();
        for(char c : "aAiIUeEoO".toCharArray()){    //make vowel set
            vowel.add(c);
        }

        int t = 1;

        StringBuilder ans = new StringBuilder();

        for(String word : S.split(" ")) { //break down word by word
            char first = word.charAt(0);

            if (vowel.contains(first)) {  //check contained key

                ans.append(word);

            } else {

                ans.append(word.substring(1));
                //put the first digit for non-vowel

                ans.append(word.substring(0, 1));

            }

            ans.append("ma");   //put ma to the end of the word

            for (int i = 0; i < t; i++) {
                ans.append("a");
            }
            t++;
            ans.append(" ");

        }

        ans.deleteCharAt(ans.length() - 1);   //fencepost error

        return ans.toString();


    }
}
