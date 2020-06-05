class ReverseInteger {
    public int reverseInteger(int x) {
        boolean negative = false;
        //negative or positive nums
        int reversedNum = 0;

        if (x < 0) {
            negative = true;
            x *= -1;
        }
        while (x > 0) {
            reversedNum = (reversedNum * 10) + (x % 10);
            x /= 10;
            //123%10 =3 12, 30 + 2 1, 320 + 1 =321
            //-123*-1 = 123, 123%10 = 3 same as above
            //120%10 = 0 12, 0*10=0 + 2 1, 20+1 =21
        }
        if (negative) {
            reversedNum *= -1;
        }
        return reversedNum;
    }
}