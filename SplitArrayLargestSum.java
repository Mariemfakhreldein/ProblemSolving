public class SplitArrayLargestSum {

    public static int splitArray(int[] nums, int k) {

        int l = 0, r = 1000000000, sol = -1;

        while(l <= r){

            int mid = (r-l)/2+l;

//            System.out.println( "Mid : " + mid);
            if(NumberOfPartsArrayCanBeSplitInto(mid, nums) <= k){
                sol = mid;
                r = mid -1;
            }else if(NumberOfPartsArrayCanBeSplitInto(mid, nums) > k){
                l = mid +1;
            }

//            System.out.println("l :" + l + "*** r :" + r);
        }

        return sol;
    }

    private static int NumberOfPartsArrayCanBeSplitInto(int mid, int[] nums) {

        int kCount = 1, sumSoFar = 0;

        for (int i = 0; i < nums.length; ++i){
            if(nums[i] > mid)
                return 100;

            if(sumSoFar + nums[i] > mid){
                sumSoFar = 0;
                kCount ++;
                sumSoFar = nums[i];
            }else{
                sumSoFar += nums[i];
            }

        }

//        System.out.println("kcount : " + kCount);
        return kCount;
    }

    public static void main(String[] args) {
        System.out.println(splitArray(new int[]{1,1,1,1,1}, 4));
    }
}
