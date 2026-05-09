package extras;

import java.util.*;

public class StreamsExemplo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
//        List<String> filteredNames = new ArrayList<>();
//
//        for (String name : names) {
//            if (name.length() > 3) {
//                filteredNames.add(name.toUpperCase());
//            }
//        }
//
//        Collections.sort(filteredNames);

        List<String> filteredNames = names.stream().filter(name -> name.length() > 3).map(String::toUpperCase).sorted().toList();

        for (String filteredName : filteredNames) {
            System.out.println(filteredName);
        }
    }
}
