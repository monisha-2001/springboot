package Programming;

import java.util.List;

public class FP03LambdaExpression {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,12,35,67,4,6,2,8);

        printEvenNumbersInListFunctional(numbers);
    }


//    private static boolean isEven(int number){
//        return number%2==0;
//    }

    private static void printEvenNumbersInListFunctional(List<Integer> number) {
//        numbers.stream().filter(FP02aFunctionalUsing::isEven).forEach(System.out::println);
        number.stream().filter(num->num%2==0).forEach(System.out::println);
    }
}
