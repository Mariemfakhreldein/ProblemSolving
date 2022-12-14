import java.util.Arrays;

public class CeaserCipher {
    public static void main(String[] args) {
        System.out.println(caesarCipher("middle-Outz", 2));
    }

    public static String caesarCipher(String s, int k) {
        // Write your code here

        //a - z ---->

        StringBuilder res = new StringBuilder();
        for (char c:
             s.toCharArray()) {
            if ( c >= 'a' && c<= 'z')
                c = (char)((c - 'a' + k) % 26 + 'a');
            else if ( c >= 'A' && c<= 'Z')
                c = (char)((c - 'A' + k) % 26 + 'A');

            res.append(c);

            System.out.println(c);
        }

        return res.toString();
    }
}
