import java.util.*;

public class TheyAreEverywhere {
    public static void main(String[] args) {
        //System.out.println((int)'a');

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

//        System.out.println(n +"----" + s);
        int distinctCount = 0;
        boolean [] letterExists = new boolean[150];
        int [] pokemonFreq = new int [150];

        int i;

        for( i = 0 ; i<s.length(); ++i){
            letterExists[s.charAt(i)] = true;
        }

        for (i='a' ; i <= 'z' ; ++i){
            if (letterExists[i]){
                distinctCount++;
            }
        }

        for (i='A' ; i <= 'Z' ; ++i){
            if (letterExists[i]){
                distinctCount++;
            }
        }

        //now right the two pointer code

        int l = 0, r = 0, limit = s.length(), currentDistinctCount = 0, minLength = 2000000;
        while(l < limit && r < limit){

            if(currentDistinctCount < distinctCount){

                if(pokemonFreq[s.charAt(r)] == 0){
                    currentDistinctCount++;
                }
                pokemonFreq[s.charAt(r)]++;
                r++;
            }else{
                minLength = Math.min(minLength, r-l);

                if(pokemonFreq[s.charAt(l)] == 1){
                    currentDistinctCount--;
                }
                pokemonFreq[s.charAt(l)]--;
                l++;
            }



//            System.out.println(r + "  " + l +"  " + minLength + " " + currentDistinctCount);

        }

        while (currentDistinctCount == distinctCount && l < limit){
            minLength = Math.min(minLength, r-l);
            if(pokemonFreq[s.charAt(l)] == 1){
                currentDistinctCount--;
            }
            pokemonFreq[s.charAt(l)]--;
            l++;
        }

//        System.out.println(minLength);
        System.out.println(minLength == 2000000? 1 : minLength);
    }
}
