public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));
    }

    public static int arrangeCoins(int n) {

        int row = 1, cnt = 0;
        while(n > 0){
            n -= row++;
            cnt++;
        }

        if (n < 0) {
            cnt--;
        }
        return cnt;
    }
}
