import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TopKFrequentElements {
    public static void main(String[] args) {
        topKFrequent(new int[] {1,1,1,2,2,2,3,3}, 2);
    }

    public static int[] topKFrequent(int[] nums, int k) {

        int[] freqArray = new int[20_005];
        for (int i = 0; i < nums.length; i++) {
            freqArray[nums[i]+10_000] ++;
        }

        List<Integer>[] freqIndexedArray = new ArrayList[nums.length+1];

        for (int i = 0; i < freqIndexedArray.length; i++) {
            freqIndexedArray[i] = new ArrayList<>();
        }

        for (int i = 0; i < freqArray.length; i++) {
            if (freqArray[i] > 0){

                    freqIndexedArray[freqArray[i]].add(i-10_000);
            }
        }

        int[] solution = new int[k];
        int solInd = 0;
        for (int i = freqIndexedArray.length-1 ; i >= 0; i--) {
            for (int j = 0; j < freqIndexedArray[i].size() && solInd < k; j++) {
                solution[solInd++] = freqIndexedArray[i].get(j);
            }
        }

        return solution;
    }
}
