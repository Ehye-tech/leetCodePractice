
class BubbleSort{


    public static int[] bubbleSort(int[] arr){
        int[] output = new int[arr.length];
        int arrLen = arr.length-1 ; // last unsorted
        boolean isSorted = false;

        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arrLen; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                    output[i] = arr[i];
                    isSorted = false;
                }
            }
            arrLen--;

        }

        return arr;
    }



}


