import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {

        if(t.length() > s.length())
            return "";

        String solution = "";
        int minWindowLength = Integer.MAX_VALUE;

        Map<Character, Integer> freqT = new HashMap<>();
        Map<Character, Integer> freqS = new HashMap<>();

        for(char c: t.toCharArray()){
            freqT.put(c, freqT.getOrDefault(c,0)+1);
        }


        int matchCount = 0;
        int l = 0;
        for(int r = 0; r < s.length(); ++r){
            //advance right
            if(matchCount < t.length()){
                char rChar = s.charAt(r);

                freqS.put(rChar, freqS.getOrDefault(rChar, 0) +1);

                if(freqT.containsKey(rChar) && freqS.get(rChar) <= freqT.get(rChar)){
                    matchCount++;
                }

            }

            //minimize window
            while (matchCount == t.length() && l < s.length()){
                int currWindowLength = r-l+1;

                if(currWindowLength < minWindowLength){
                    minWindowLength = currWindowLength;
                    solution = s.substring(l, r+1);
                }

                char lChar = s.charAt(l);
                freqS.put(lChar, freqS.get(lChar)-1);

                if(freqT.containsKey(lChar) && freqS.get(lChar) < freqT.get(lChar)){
                    matchCount--;
                }
                l++;
            }
        }

        return solution;
    }
    public static void main(String[] args) {
        System.out.println(minWindow("AbcxyzXXXZZZadsafd","xyZ"));
    }
}
