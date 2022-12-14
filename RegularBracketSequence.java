import java.util.Scanner;

public class RegularBracketSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String seq = sc.nextLine();

        int open = 0;

        int maxLength = 0;

        for(char c: seq.toCharArray()){
            if(c == '('){
                open++;
            }else{
                if(open > 0){
                    open--;
                    maxLength += 2;
                }
            }
        }
        System.out.println(maxLength);
    }
}
