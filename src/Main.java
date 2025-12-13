public class Main {

    /**
     * For two strings s and t, we say "t divides s" if and only
     * if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
     * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
     */
    public static void main(String[] args) {
        String str0 = "ABCABC", str1 = "ABC";
        String str2 = "ABABAB", str3 = "ABAB";
        String str4 = "LEET", str5 = "CODE";

        System.out.printf("\nString: %s \nString: %s \n-> %s\n",str0, str1, gcdOfStrings(str0, str1));
        System.out.printf("\nString: %s \nString: %s \n-> %s\n",str2, str3, gcdOfStrings(str2, str3));
        System.out.printf("\nString: %s \nString: %s \n-> %s\n",str4, str5, gcdOfStrings(str4, str5));
    }

    public static String gcdOfStrings(String string0, String string1) {
        if (!(string0 + string1).equals(string1 + string0)) {
            return "";
        }
        int gcdLen = gcd(string0.length(), string1.length());

        return string0.substring(0, gcdLen);
    }

    // Это я нашла алгоритм Евклида, вычисляющий нод двух чисел (самый большой общий делитель)
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}