import java.util.List;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int lo = 0, hi = nums.length - 1, res = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] == target) {
                res = mid;
                break;
            } else if (nums[mid] > target) {
                hi = mid-1;
            } else {
                lo = mid+1;
            }
        }

        System.out.println(res);
    }


}
