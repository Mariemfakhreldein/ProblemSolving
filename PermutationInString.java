public class PermutationInString {
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "aaaaaaaaaaaaa"));
    }


    public static boolean checkInclusion(String s1, String s2) {

        int[] frequencyArrayOfS1 = buildFrequencyArrayForString(s1);
        int permutationLength = s1.length();
        System.out.println(permutationLength);

        int leftPointer = 0, rigthPointer = 0, matchingSubstringLength = 0;

        while(leftPointer < s2.length() && rigthPointer < s2.length()){

            System.out.println(s2.charAt(leftPointer) + "  " + s2.charAt(rigthPointer) + "  " + matchingSubstringLength);

            int indexOfCharInFreqArray = s2.charAt(rigthPointer) - 'a';
            if(frequencyArrayOfS1[indexOfCharInFreqArray] > 0){
                System.out.println("update right");
                matchingSubstringLength++;
                rigthPointer++;
                frequencyArrayOfS1[indexOfCharInFreqArray]--;
            }
            else if(leftPointer == rigthPointer){
                leftPointer = ++rigthPointer;
            }else {
                System.out.println("advance left");
                frequencyArrayOfS1[s2.charAt(leftPointer) - 'a']++;
                matchingSubstringLength--;
                leftPointer++;
            }

//            if(leftPointer == rigthPointer)

            if(matchingSubstringLength == permutationLength)
                return true;
        }

        return false;
    }

    public static int[] buildFrequencyArrayForString(String string){
        int[] freqArray = new int[26];
        for(char c: string.toCharArray()){
            freqArray[c-'a']++;
        }
        return freqArray;
    }

}
