public class LongestRepeatingCharacterReplacement {

    static int[] frequencies = new int[26];

    public static void main(String[] args) {
        System.out.println(characterReplacement("ABAB", 2));
    }


    public static int characterReplacement(String s, int k) {
        int maxWindowLength = 0;

        int l = 0, r = 0;
        while(r < s.length() && l < s.length() ){
            frequencies[s.charAt(r)-'A']++;
            r++;
            int highestFrequencyInWindow = findMaximumFrequency();
            int windowLength = r-l;

            if(windowLength-highestFrequencyInWindow <= k){
                maxWindowLength = Math.max(maxWindowLength, windowLength);
            } else {
                frequencies[s.charAt(l)-'A']--;
                l++;
            }
        }




        return maxWindowLength;
    }


    private static int findMaximumFrequency(){
        int maxFrequency =  0;
        for (int frequency: frequencies){
            maxFrequency = Math.max(maxFrequency, frequency);
        }
        return maxFrequency;
    }

}


