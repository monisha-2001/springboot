package Programming;

import java.util.List;

public class FP04OddNumbers {
    public static void main(String[] args) {

        List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9);

        ListOfOddNumbers(numbers);
    }

    private static void ListOfOddNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(number->number%2==1).forEach(System.out::println);
    }


}
