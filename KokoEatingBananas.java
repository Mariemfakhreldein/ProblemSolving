import java.util.Arrays;
import java.util.Collections;

public class KokoEatingBananas {

    public static void main(String[] args) {
            int[] piles = new int[]{3,6,7,11};
            int h = 8, res = h;

            int lo = 1 , hi = Arrays.stream(piles).max().getAsInt();
            while(lo <= hi){

                int mid = (hi-lo)/2 + lo;
                System.out.println("mid : "+mid);

                if(eatWithSpeedK(mid, piles.clone(), h)){
                    res = mid;
                    hi = mid-1;
                }else{
                    lo = mid+1;
                }

            }
        System.out.println(res);
    }

    private static boolean eatWithSpeedK(int k, int[] piles, int h){
        int i = 0;
        long cnt = 0;
//        System.out.println("");
        while(i<piles.length){

            cnt += piles[i]/k + (piles[i]%k==0?0:1);

            ++i;
        }
        System.out.println(k + "  " + cnt);
        System.out.println();
        return cnt <= h;
    }

}
