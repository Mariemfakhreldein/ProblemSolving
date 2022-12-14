import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TheUselessToy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String positions = sc.nextLine();
        int rotations = sc.nextInt();

        Map<Character, Integer> maps = new HashMap<>();
        maps.put('^',0);
        maps.put('>',1);
        maps.put('v',2);
        maps.put('<',3);

        int startingPos = maps.get(positions.charAt(0));
        int endingPos = maps.get(positions.charAt(2));

        if(((startingPos+(rotations%4)) % 4 == endingPos) && ((startingPos-(rotations%4)+4) % 4 == endingPos))
            System.out.println("undefined");
        else
        if((startingPos+(rotations%4)) % 4 == endingPos){
            System.out.println("cw");
        }else if((startingPos-(rotations%4)+4) % 4 == endingPos){
            System.out.println("ccw");
        }
    }
}
