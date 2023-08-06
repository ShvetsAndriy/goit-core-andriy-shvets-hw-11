
import java.util.stream.Stream;

public class Task4 {

    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);
        long seed = 0;

        Stream<Long> randomLongNumbers = Stream.iterate(seed, (n) -> linearCongruentGenerator(a, c, m, n));
        randomLongNumbers
                .limit(10)
                .peek(System.out::println)
                .count();
    }

    static long linearCongruentGenerator (long a, long c, long m, long randomNumber) {
        return (a * randomNumber + c) % m;
    }
}
