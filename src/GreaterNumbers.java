import java.lang.Integer;

public class GreaterNumbers {
    public static int findGreaterNumbers(int[] arr) {
        //num1.compareTo(num3)
        // {1,2,3}
        // 1, 2
        // 1, 3
        // 2, 3

        Integer biggerNum = arr.length - 1;
        int container = 0;
        for (int i = biggerNum - 1; i >= 0; i--) {
            Integer result = Integer.compare(arr[biggerNum], arr[i]);
            if (result == 1) {
                container++;
            }
        }

        return container;
    }


}
