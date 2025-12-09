public class Main {

    /**
     * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
     * and removing all non-alphanumeric characters, it reads the same forward and backward.
     * Alphanumeric characters include letters and numbers.
     * Given a string s, return true if it is a palindrome, or false otherwise.
     */
    public static void main(String[] args) {
        String str1 = "A man, a plan, a canal: Panama";
        String str2 = "race a car";
        String str3 = " ";

        boolean result = isPalindrome(str2);
        System.out.println(result);
    }

    public static boolean isPalindrome(String str) {
        if (str != null ) {

            String mod1 = str.replaceAll("[^A-Za-zА-Яа-я]", "");
            String mod2 = mod1.toLowerCase();
            String reverseStr = new StringBuilder(mod2).reverse().toString();

            if (reverseStr.equals(mod2)) {
                return true;
            }
        }
        return false;
    }

}