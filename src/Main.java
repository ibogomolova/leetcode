public class Main {

    /**
     * You are given two strings word1 and word2.
     * Merge the strings by adding letters in alternating order, starting with word1.
     * If a string is longer than the other, append the additional letters onto the end of the merged string.
     * Return the merged string.
     * ex
     * word1:  a   b   c
     * word2:    p   q   r
     * merged: a p b q c r
     */
    public static void main(String[] args) {
        String word1 = "ab", word2 = "pqrs";

        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int maxLen = Math.max(len1, len2);
        StringBuilder mergeString = new StringBuilder();
        for (int i = 0; i < maxLen; i++) {
            if (i < len1) {
                mergeString.append(word1.charAt(i)) ;
            }
            if (i < len2) {
                mergeString.append(word2.charAt(i));
            }
        }
        return mergeString.toString();
    }
}