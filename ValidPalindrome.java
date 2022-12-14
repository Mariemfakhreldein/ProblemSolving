public class ValidPalindrome {

    private boolean isPalidrome(String s){
        StringBuilder newString = new StringBuilder();

        for(int i = 0; i < s.length(); ++i){
            char c = s.charAt(i);
            if ((c>='a' && c <='z') || (c>='0' && c <= '9') || (c >= 'A' && c <= 'Z')){
                newString.append(c);
            }
        }

        s = new String(newString);
        s = s.toLowerCase();


        int l = 0 , r = s.length()-1;
        boolean palindrome = true;
        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                palindrome = false;
                break;
            }

            l++;
            r--;
        }

        return palindrome;
    }

}
