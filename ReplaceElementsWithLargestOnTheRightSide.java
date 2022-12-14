import java.util.Arrays;

public class ReplaceElementsWithLargestOnTheRightSide {

    public static void main(String[] args) {
        Arrays.stream(replaceElements(new int[]{1})).forEach(System.out::println);
    }

    public static int[] replaceElements(int[] arr) {
        int max = arr[arr.length-1];
        arr[arr.length-1] = -1;
        for(int i = arr.length-2 ; i >= 0 ; --i)
        {
            if(arr[i] > max){
                int tempMax = arr[i];
                arr[i] = max;
                max = tempMax;
            }else{
                arr[i] = max;
            }
        }
        return arr;
    }

}
