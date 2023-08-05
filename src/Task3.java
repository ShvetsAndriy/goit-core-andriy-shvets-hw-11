
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5"};

        String output = Stream.of(array)
                .flatMap(s -> Stream.of(s.split(", ")))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .sorted()
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(", "));

        System.out.println(output);
    }
}
