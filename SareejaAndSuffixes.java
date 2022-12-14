import java.util.*;

public class SareejaAndSuffixes {
    int n,m;
    int[] numbers;
    int[] distinctCount;
    boolean [] numbersFreq = new boolean[100009];
//    Set<Integer> distinctCheck = new HashSet<>();
    Scanner sc = new Scanner(System.in);

    private void readInput(){
        n = sc.nextInt();
        m = sc.nextInt();
        numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        distinctCount = new int[n];
    }

    private void processInput(){
        distinctCount[n-1] = 1;
        numbersFreq[numbers[n-1]] = true;
        int cnt = 1;
        for(int i = n-2 ; i >= 0 ; --i){
            if(!numbersFreq[numbers[i]]){
                cnt++;
                distinctCount[i] = cnt;
                numbersFreq[numbers[i]] = true;
            }else{
                distinctCount[i] = cnt;
            }
        }
    }
    public static void main(String[] args) {
        SareejaAndSuffixes sareejaAndSuffixes = new SareejaAndSuffixes();
        sareejaAndSuffixes.readInput();
        sareejaAndSuffixes.processInput();

        int index;
        while(sareejaAndSuffixes.m > 0){
            index = sareejaAndSuffixes.sc.nextInt();
            System.out.println(sareejaAndSuffixes.distinctCount[index-1]);
            sareejaAndSuffixes.m--;
        }

    }


}
