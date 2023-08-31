import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {

//        Stream<String> first = Stream.of("A", "B", "C");
//        Stream<String> second = Stream.of("1", "2", "3", "4");

        Supplier<Stream<String>> streamSupplier1 = () -> Stream.of("A", "B", "C");
        Supplier<Stream<String>> streamSupplier2 = () -> Stream.of("1", "2", "3", "4");

        //first variant
        Stream<String> result = zip(streamSupplier1.get(), streamSupplier2.get());
        System.out.println(result.collect(Collectors.toList()));

        // second variant (from mentor)
        Stream<String> result2 = zip2(streamSupplier1.get(), streamSupplier2.get());
        System.out.println(result2.collect(Collectors.toList()));
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
    public static <T> Stream<T> zip2(Stream<T> first, Stream<T> second){
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();
        Stream.Builder<T> builder = Stream.builder();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            builder.add(firstIterator.next());
            builder.add(secondIterator.next());
        }
        return builder.build();
    }
}
