import java.util.Scanner;

public class AntonAndDanic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int A = 0, D = 0;
//        System.out.println(s);
        for(char ch: s.toCharArray()){
            System.out.println(ch +1 );
            if(ch == 'A')
                A++;
            else
                D++;
        }
        if(A > D)
            System.out.println("Anton");
        else if(D>A)
            System.out.println("Danik");
        else
            System.out.println("Friendship");

    }
}
