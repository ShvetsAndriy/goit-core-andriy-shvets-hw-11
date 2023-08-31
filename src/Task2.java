import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Ivan", "Peter", "Andriy", "Oleksiy", "Katerina", "Irina", "Olga", "Nataliya", "Zoya");

        //first variant
        List<String> output = input.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(output);

        // second variant (from mentor) - with new method toList() in Java19
//        System.out.println(sortedList(input));
    }

//    static List<String> sortedList(List<String> names){
//        return names.stream().map(String::toUpperCase).sorted(Comparator.reverseOrder()).toList();
//    }
}
