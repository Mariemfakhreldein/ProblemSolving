import java.util.*;

public class AssiutSummerCamp {
    Map<Integer, String> indexPerson = new HashMap<>();

    private void mapPersonToIndex(){
        indexPerson.put(1, "Hussien");
        indexPerson.put(2, "Atef");
        indexPerson.put(3, "Karemo");
        indexPerson.put(4, "Ezzat");
    }

    public static void main(String[] args) {
        AssiutSummerCamp assiutSummerCamp = new AssiutSummerCamp();
        assiutSummerCamp.mapPersonToIndex();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int maxNum = -1, secondMax = -1, maxNumIndex = -1, secondMaxIndex = -1;
            for(int i = 1; i <=4 ; ++i ){
                int temp = sc.nextInt();

                if(temp > maxNum){
                    secondMax = maxNum;
                    secondMaxIndex = maxNumIndex;
                    maxNum = temp;
                    maxNumIndex = i;
                }else if(temp > secondMax){
                    secondMax = temp;
                    secondMaxIndex = i;
                }
            }

            System.out.println(assiutSummerCamp.indexPerson.get(maxNumIndex) + " " + assiutSummerCamp.indexPerson.get(secondMaxIndex));
        }

    }

}
