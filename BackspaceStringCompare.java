public class BackspaceStringCompare {

    public static void main(String[] args) {
        System.out.println(backspaceCompare("bxj##tw","bxo#j##tw"));
    }
    public static boolean backspaceCompare(String s, String t) {

        int itrS = s.length()-1, itrT = t.length()-1;
        while(itrT >= 0 && itrS >= 0){
            if((s.charAt(itrS) >= 'a' && s.charAt(itrS) <= 'z') && (t.charAt(itrT) >= 'a' && t.charAt(itrT) <= 'z') ){
                if(s.charAt(itrS) != t.charAt(itrT))
                    return false;

                itrS--;
                itrT--;
            }else {
                itrS -= escapeWindowSize(itrS, s);
                itrT -= escapeWindowSize(itrT, t);

                System.out.println(itrS + " *** " + itrT);
            }

        }

        System.out.println(itrS + "  " + itrT);

        while(itrT >= 0){
            if(t.charAt(itrT) >= 'a' && t.charAt(itrT) <= 'z')
                return false;

            itrT -= escapeWindowSize(itrT, t);
        }

        while(itrS >= 0){
            if(s.charAt(itrS) >= 'a' && s.charAt(itrS) <= 'z')
                return false;

            itrS -= escapeWindowSize(itrS, s);
        }

        if(itrT < 0 && itrS < 0)
            return true;

        return false;
    }

    public static int escapeWindowSize(int itrPos, String str){
        int countHash = 0, windowSize = 0;

        while(itrPos >= 0 && (str.charAt(itrPos) == '#' || countHash > 0) ){
            if(str.charAt(itrPos) == '#'){
                countHash++;
            }else {
                countHash--;
            }

            itrPos--;
            windowSize++;
        }

        System.out.println( "window size = " + windowSize);
        return windowSize;
    }
}
