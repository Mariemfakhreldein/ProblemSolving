public class SearchA2DMatrix {
    static int width;

    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 12));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        width = matrix[0].length;
        int length = matrix.length;
        int l = 0, r = width * length - 1;
        while (l <= r) {
            int mid = (r - l) / 2 + l;
            int value = matrix[getOuterIndex(mid)][getInnerIndex(mid)];
            System.out.println(value);

            if (value == target)
                return true;
            else if (value < target) l = mid + 1;
            else r = mid - 1;

        }
        return false;
    }

    static int getOuterIndex(int linearIndex) {
        return linearIndex / width;
    }

    static int getInnerIndex(int linearIndex) {
        return linearIndex % width;
    }


//    public static int searchRows(int[][] matrix, int target){
//        int l = 0, r = matrix.length-1, mid, targetRowIndex = -1;
//        while(l <= r){
//            mid = (r-l)/2 + l;
//            if(matrix[mid][0] <= target){
//                targetRowIndex = mid;
//                l =
//            }
//        }
//    }

}
