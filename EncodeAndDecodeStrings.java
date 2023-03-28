import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {
    public void encode(List<String> strs) {
        StringBuilder tempString = new StringBuilder();

        for (String currString : strs) {
            tempString.append(currString.length()).append("#").append(currString);
        }
        System.out.println(tempString);
    }


    public List<String> decode(String str) {
        List<String> decodedList = new ArrayList<>();

        for(int i = 0; i < str.length();){
            StringBuilder length = new StringBuilder();
            int j = i;

            while(str.charAt(j) != '#'){
                length.append(str.charAt(j));
                j++;
            }

            decodedList.add(str.substring(j+1, j + Integer.parseInt(length.toString()) +1));

            i += Integer.parseInt(length.toString())+length.length()+1;
        }

        return decodedList;
    }
    public static void main(String[] args) {
        EncodeAndDecodeStrings en = new EncodeAndDecodeStrings();
        en.encode(List.of("hellokljdlfjljfls", "thzzzzzzzzzzzzzzzzzzzzzzzzzzzzzere", "what", "up**", "  *", "* "," *"));
        System.out.println(en.decode("17#hellokljdlfjljfls34#thzzzzzzzzzzzzzzzzzzzzzzzzzzzzzere4#what4#up**3#  *2#* 2# *"));
    }
}
