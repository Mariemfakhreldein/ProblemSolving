import java.util.*;

public class FrequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] frequency = new int[m+1];
        for(int i = 0; i < n ; ++i){
            int x = sc.nextInt();
            frequency[x]++;
        }

        for (int i = 1; i <= m ; ++i){
            System.out.println(frequency[i]);
        }

    }
}
