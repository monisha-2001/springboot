package Programming;

import java.util.List;

public class FP02aFunctionalUsing {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,12,35,67,4,6,2,8);
        printAllNumbersInListFunctional(numbers);
    }

    private static void print(int number){
        System.out.println(number);
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream().forEach(FP02aFunctionalUsing::print);

    }
}
