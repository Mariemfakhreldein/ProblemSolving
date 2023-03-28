public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int l = 0 , r = nums.length-1, sol = 10000;
        while(l<=r){
            int mid = (r-l)/2 + l;
            if(nums[mid] <= nums[r]){
                r = mid-1;
                sol = Math.min(nums[mid], sol);
            }else{
                l = mid+1;
            }
        }
        return sol;
    }
}
