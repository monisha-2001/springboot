package Programming;

import java.util.List;

public class FP07SquareNumber {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9);

        PrintListOfSquareNumbers(numbers);
    }

    private static void PrintListOfSquareNumbers(List<Integer> number) {
        number.stream()
                .filter(num->num%2==0)
                .map(num->num*num)
                .forEach(System.out::println);
    }

}
