public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(808201));

    }

    public static boolean isPerfectSquare(int num) {
        long l = 1, r = num/2;
        while(l <= r){
            long mid = (r-l)/2 + l;
            System.out.println(mid);
            if(mid*mid == num) return true;
            else if(mid*mid > num) r = mid-1;
            else l = mid +1;

            System.out.println("***" + mid + "  " + l + "  " + r);
        }
        return false;
    }
}
