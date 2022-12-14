import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {



    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
    }

}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> existingCharacters = new HashSet<>();
        int longestSubstring = 1;
        int left = 0, right = 0, bound = s.length();
        while(right < bound && left < bound){
            if(existingCharacters.add(s.charAt(right))){
                right += 1;
            }else{
                longestSubstring = Math.max(longestSubstring, right-left);
                existingCharacters.remove(s.charAt(left));
                left +=1;
            }
        }

        longestSubstring = Math.max(longestSubstring, right-left);

        return longestSubstring;
    }
}