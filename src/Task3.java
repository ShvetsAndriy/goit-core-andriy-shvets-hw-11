
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Collection;

public class Task3 {
    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5"};

        //first variant
        String output = Stream.of(array)
                .flatMap(s -> Stream.of(s.split(", ")))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .sorted()
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(", "));

        System.out.println(output);

        // second variant (from mentor)
        System.out.println(sortNumbers(array));
    }

    static String sortNumbers(String[] numbers) {
        return Arrays.stream(numbers)
                .map(x -> Arrays.asList(x.split(", ")))
                .flatMap(Collection::stream)
                .sorted()
                .collect(Collectors.joining(", "));
    }
}
