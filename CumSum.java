import java.util.Arrays;
import java.util.Scanner;

public class CumSum {
    int numberOfStones;
    Long []stoneCosts;
    Long []sortedStoneCosts;
    int numberOfQuestions;

    Scanner sc = new Scanner(System.in);
    private void readInput(){
        numberOfStones = sc.nextInt();
        stoneCosts = new Long[numberOfStones+1];
        stoneCosts[0] = 0l;
        for (int i = 1 ;i <= numberOfStones; ++i){
            stoneCosts[i] = sc.nextLong();
        }

        sortedStoneCosts = stoneCosts.clone();
        Arrays.sort(sortedStoneCosts);
        cumSumCalc();
        numberOfQuestions = sc.nextInt();
    }
    private void processQuestions(){
        int left, right, type;
        while(numberOfQuestions > 0){
            type = sc.nextInt();
            left = sc.nextInt();
            right = sc.nextInt();

            System.out.println(findAnswer(left,right,type));

            numberOfQuestions -= 1;
        }
    }

    private long findAnswer(int left, int right, int type) {
        if(type == 1){
            if (left == 1)
                return stoneCosts[right];
            return stoneCosts[right] - stoneCosts[left-1];
        }else{
            if (left == 1)
                return sortedStoneCosts[right];
            return sortedStoneCosts[right] - sortedStoneCosts[left-1];
        }
    }

    private void cumSumCalc(){
        for(int i = 2; i <= numberOfStones ; ++i){
            stoneCosts[i] = stoneCosts[i] + stoneCosts[i-1];
            sortedStoneCosts[i] = sortedStoneCosts[i] + sortedStoneCosts[i-1];
        }
    }

    public static void main(String[] args) {
        CumSum cumSum = new CumSum();
        cumSum.readInput();
        cumSum.processQuestions();
    }


}
