import java.util.Arrays;

public class BoatsToSavePeople {

    public int numRescueBoats(int[] people, int limit) {

        int boatsNumber = 0;
        Arrays.sort(people);
        int l = 0, r = people.length-1;
        while(l<=r){
            if(people[l] + people[r] <= limit)
            {
                r--;
                l++;
            } else {
                r--;
            }
            boatsNumber++;
        }
        return boatsNumber;
    }
    public static void main(String[] args) {

    }
}
