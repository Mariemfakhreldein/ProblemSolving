public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {

        int sItr = 0;
        for(int i = 0; i < t.length() && sItr < s.length(); i++){
            if(s.charAt(sItr) == t.charAt(i))
                sItr++;
        }

        return sItr == s.length();
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "afksbdjfclkjfabc"));
    }
}
