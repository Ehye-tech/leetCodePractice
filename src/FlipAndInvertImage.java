class FlipAndInvertImage{
    public int[][] flipAndInvertImage(int[][] inputArr) {
        int[][] flipedImage;
        int left = 0;
        int right = inputArr.length - 1;
        int mid = (left + right) / 2;

        for (int i = 0; i < inputArr.length; i++) {
            //flip

            if (mid == left || mid == right) {
                continue;
            } else {
                flipedImage[i] = inputArr[right];
                right++;
                left++;
            }

            //invert
            if (flipedImage[i] == 1) {
                flipedImage[i] = 0;
            } else {
                flipedImage[i] = 1;
            }
        }
        return flipedImage;
    }
}
