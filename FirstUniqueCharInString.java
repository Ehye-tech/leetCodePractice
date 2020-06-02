class FirstUniqueCharInString {
    public int checkFirstUniqueCharacter(String word) {
        int[] counter = new int[26];
        for (int i = 0; i < word.length(); i++) {
            counter[word.charAt(i) - 'a']++;
        }

        for (int i = 0; i < word.length(); i++) {
            if (counter[word.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}