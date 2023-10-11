package Programming;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FP10Optional {
    public static void main(String[] args) {
        List<String> fruits=List.of("apple","banana","mango");

        Predicate<? super String> Predicate=fruit->fruit.startsWith("c");
        Optional<String> optional=fruits.stream()
            .filter(Predicate)
                .findFirst();

        System.out.println(optional);
        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());
        System.out.println(optional.get());
    }

}
