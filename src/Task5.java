import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {
        Stream<String> first = Stream.of("A", "B", "C");
        Stream<String> second = Stream.of("1", "2", "3", "4");

        Stream<String> result = zip(first, second);
        System.out.println(result.collect(Collectors.toList()));
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iteratorFirst = first.iterator();
        Iterator<T> iteratorSecond = second.iterator();
        List<T> result = new ArrayList<>();

        while (iteratorFirst.hasNext() && iteratorSecond.hasNext()) {
            result.add(iteratorFirst.next());
            result.add(iteratorSecond.next());
        }

        return result.stream();
    }
}
