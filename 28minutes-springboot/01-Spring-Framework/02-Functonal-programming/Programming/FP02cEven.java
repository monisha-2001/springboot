package Programming;

import java.util.List;

public class FP02cEven {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 12, 35, 67, 4, 6, 2, 8);

        EvenFunction(numbers);

    }
    private static boolean even(int number){
        return number%2==0;
    }
    private static void EvenFunction(List<Integer> number){
        number.stream().filter(FP02cEven::even).forEach(System.out::println);
    }


}
