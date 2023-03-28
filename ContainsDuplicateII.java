import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> numberPrevIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(numberPrevIndex.containsKey(nums[i]) && i - numberPrevIndex.get(nums[i]) <= k){
                return true;
            } else {
                numberPrevIndex.put(nums[i], i);
            }

        }
        return false;
    }

    public static void main(String[] args) {

    }
}
