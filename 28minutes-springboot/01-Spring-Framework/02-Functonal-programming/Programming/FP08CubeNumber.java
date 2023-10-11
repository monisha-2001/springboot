package Programming;

import java.util.List;

public class FP08CubeNumber {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9);

        PrintListOfCube(numbers);
    }

    private static void PrintListOfCube(List<Integer> numbers) {
        numbers.stream()
                .filter(number->number%2==1)
                .map(number->number*number*number)
                .forEach(System.out::println);
    }
}
