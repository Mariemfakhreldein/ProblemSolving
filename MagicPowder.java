import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class MagicPowder {

    long ingredients, magicPowder;
    long []ingredientGrams;
    long []recipeGrams;

    private Boolean checkNumberOfCookies(long numberOfCookies){

        double magicPowderNeeded = 0;
        for(int i = 0 ; i < ingredients ; ++i){
            long numberOfGramsNeeded = numberOfCookies*recipeGrams[i];

            if(numberOfGramsNeeded > ingredientGrams[i]){
                magicPowderNeeded += (numberOfGramsNeeded-ingredientGrams[i]);
            }
        }


        return magicPowderNeeded <= magicPowder;
    }


    private long calculateNumberOfCookies() {
        long min = 0L, max = (long) (2e9+1), result =0L;

        while(min <= max){

            long suggestedCookies = (min+max)/2;
            if(checkNumberOfCookies(suggestedCookies)){
                result = suggestedCookies;
                min = suggestedCookies + 1;
            }else{
                max = suggestedCookies - 1;
            }
        }


        return result;
    }


    private void readData(){
        Scanner sc = new Scanner(System.in);
        ingredients = sc.nextLong();
        magicPowder = sc.nextLong();

        ingredientGrams = new long[(int) ingredients];
        recipeGrams  = new long[(int) ingredients];

        for (int i = 0; i < ingredients; i++) {
            recipeGrams[i] = sc.nextLong();
        }

        for (int i = 0; i < ingredients; i++) {
            ingredientGrams[i] = sc.nextLong();
        }


    }




    public static void main(String[] args) {

        MagicPowder magicPowder = new MagicPowder();
        magicPowder.readData();
        System.out.println(magicPowder.calculateNumberOfCookies());

    }
}
