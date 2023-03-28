public class LongestLastWord {

    public static int lengthOfLastWord(String s) {
        String[] sArray = s.trim().split(" ");

        return sArray[sArray.length-1].length();
    }

    public static void main(String[] args) {

    }
}
