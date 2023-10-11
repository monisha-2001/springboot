package Programming;

import java.util.List;

public class FP02bNotusingprintmethod {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9,10);

        funtion(numbers);

    }
    private static void funtion(List<Integer> number){
        number.stream().forEach(System.out::println);
    }

}

