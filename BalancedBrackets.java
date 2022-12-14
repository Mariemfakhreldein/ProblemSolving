import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String s = "{[([])]}";
        Boolean balanced = true;

        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){
//            System.out.println(c);
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if(!stack.empty()){
                    if((c == ')' && stack.peek()=='(') || (c== ']' && stack.peek()=='[') || (c=='}' && stack.peek()=='{')){
                        stack.pop();
                    }else{
//                        System.out.println("first condition");
                        balanced = false;
                        break;
                    }
                }else{
//                    System.out.println("second condition");
                    balanced = false;
                    break;
                }
            }
        }
        System.out.println(balanced);
    }
}
