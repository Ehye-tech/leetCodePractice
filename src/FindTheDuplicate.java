import java.util.HashMap;

public class FindTheDuplicate {

    public static int findTheDuplicateNumbers(int[] arr) {
        HashMap<Integer, Integer> duplicatedNum = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            duplicatedNum.put(arr[i], duplicatedNum.getOrDefault(arr[i], 0)+1);
            if (duplicatedNum.get(arr[i]) > 1) {
                return arr[i];
            }
        }
        return -1;
    }
}