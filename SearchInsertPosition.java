public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length -1, sol = nums.length;
        while(l<=r){
            int mid = (r-l)/2 +l;
            if(nums[mid] >= target){
                sol = mid;
                r = mid-1;
            } else{
                l = mid +1;
            }
        }

        return sol;
    }
}
