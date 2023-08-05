import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Ivan", "Peter", "Andriy", "Oleksiy", "Katerina", "Irina", "Olga", "Nataliya", "Zoya");
        AtomicInteger number = new AtomicInteger(1);
        String output = input.stream()
                .map(name -> {
                    if ((number.get() % 2) != 0) {
                        return number.getAndIncrement() + ". " + name;
                    } else {
                        number.getAndIncrement();
                        return "";
                    }
                })
                .filter(name -> !name.isEmpty())
                .collect(Collectors.joining(", "));
        System.out.println(output);
    }
}
