import java.util.*;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int h = sc.nextInt();

        int minRoadWidth = 0;
        for(int i = 0; i < n; ++i){
            int x = sc.nextInt();
            if(x > h){
                minRoadWidth++;
            }
            minRoadWidth++;
        }
        System.out.println(minRoadWidth);
    }
}
