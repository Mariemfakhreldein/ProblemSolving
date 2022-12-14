import java.util.*;
public class GeorgeTheDictator {

    int n, k;
    int[] inputNumbers;
    Map<Integer,Integer> frequancies = new HashMap<>();
    List<Integer> numbersNoDups = new ArrayList<>();
    
    private void readInput(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        inputNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            inputNumbers[i] = sc.nextInt();
        }
    }

    private void calculateFrequenciesAndRemoveDuplicates(){
        for(int num : inputNumbers){
            if(frequancies.containsKey(num)){
                frequancies.put(num, frequancies.get(num)+1);
            }else{
                frequancies.put(num, 1);
                numbersNoDups.add(num);
            }
        }


    }
    
    private long findSolution(){
        long sol = 0;
        int left = 0;
        int right = numbersNoDups.size()-1;

        while(left <= right){
            int currentSum = numbersNoDups.get(left) + numbersNoDups.get(right);
            if(currentSum == k){
                if(left == right){
                    int temp = numbersNoDups.get(left);
                    long count = frequancies.get(temp);
                    if(count > 1){
                        sol += (count*(count-1))/2;
                    }
                }else{
                    long leftCount = frequancies.get(numbersNoDups.get(left));
                    long rightCount = frequancies.get(numbersNoDups.get(right));
                    sol += leftCount*rightCount;
                }
                left++;
                right--;
            }
            else if(currentSum < k){
                left++;
            }else {
                right--;
            }

        }

        return sol;
    }

    public static void main(String[] args) {
        GeorgeTheDictator georgeTheDictator = new GeorgeTheDictator();
        georgeTheDictator.readInput();
        georgeTheDictator.calculateFrequenciesAndRemoveDuplicates();
        Collections.sort(georgeTheDictator.numbersNoDups);
        System.out.println(georgeTheDictator.findSolution());
    }

}
