import java.util.Arrays;

public class Live {

    public static void main(String[] args) {
        int[] piles = new int[]{3,6,7,11};
        int h = 8;


        int lo = 1 , hi = Arrays.stream(piles).max().getAsInt();
        int res = 0;
        while(lo <= hi){
            int mid = (hi-lo)/2 + lo;
            if(checkEatingSpeed(mid, piles, h)){
                res = mid;
                hi = mid-1;
            }else{
                lo = mid +1;
            }
        }

        System.out.println(res);
    }

    private static boolean checkEatingSpeed(int mid, int[] piles, int h) {
        long count = 0;
        for(int i =0 ; i< piles.length ; ++i){
            count += piles[i]/mid + (piles[i]%mid == 0?0:1);
        }
        return count <= h;
    }
}
