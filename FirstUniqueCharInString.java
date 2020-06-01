class FirstUniqueCharInString {
    public int firstUniqChar(String s) {

        int[] counter = new int[26];
        int uniqueChar = 0;

        for(int i = 0 ; i < s.length() ; i++){

            counter[s.charAt(i) - 'a']++;

        }

        for(int i = 0 ; i < s.length() ; i++){

            if(counter[s.charAt(i) - 'a']==1){

                return i;

            }

        }


        return -1;

    }
}