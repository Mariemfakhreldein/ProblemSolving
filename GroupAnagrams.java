import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strings = new String[]{"hello", "world"};
        Map<String, List<String>> sol = new HashMap<>();

        for(String str:strings){
            List<Character> stringToList = str
                    .chars()
                    .mapToObj(e -> (char)e)
                    .sorted()
                    .collect(Collectors.toList());;

            String key = stringToList.stream().map(String::valueOf).collect(Collectors.joining());

            if(!sol.containsKey(key)){
                sol.put(key,new ArrayList<>());
            }
            sol.get(key).add(str);
        }

        sol.forEach((k,v) -> {
            System.out.println( " ***" + k);
            v.forEach(System.out::println);
        });

         List<List<String>> solution = new ArrayList<>(sol.values());

    }


}
