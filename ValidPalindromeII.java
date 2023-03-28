public class ValidPalindromeII {

    public static boolean validPalindrome(String s) {

        int l =0, r = s.length()-1;
        while(l < r){
            if(s.charAt(l) == s.charAt(r)){
                l++;
                r--;
            }else{
                return isValidPalindrome(s.substring(l+1,r+1)) || isValidPalindrome(s.substring(l,r));
            }
        }
        return true;
    }

    public static boolean isValidPalindrome(String s){
        int l = 0, r = s.length()-1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(validPalindrome("abccbbba"));
    }

}
