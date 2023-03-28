public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int numsLength = nums.length;
        int l = 0, r = numsLength-1;
        int [] sol = new int[numsLength];
        int insertPos = r;
        while(l <= r){
            if( Math.abs(nums[r]) > Math.abs(nums[l]) ){
                sol[insertPos--] = nums[r]*nums[r];
                r--;
            }else{
                sol[insertPos--] = nums[l]*nums[l];
                l++;
            }
        }
        return sol;
    }
}
