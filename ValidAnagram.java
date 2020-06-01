class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){

            return false;

        }

        //the num of alphabets = 26
        //counter
        int[] alphabet = new int[26];

        for(int i = 0 ; i < s.length() ; i++){

            //get char from the 0 index of s
            alphabet[s.charAt(i) - 'a']++;

            //get char from the 0 index of t
            alphabet[t.charAt(i) - 'a']--;

        }

        for(int i : alphabet){

            if(i != 0){

                return false;

            }
        }

        return true;

    }
}

