package Programming;

import java.util.List;


//traditional approach
public class FP01Structured {
    public static void main(String[] args) {
        printAllNumbersInListStructured(List.of(12,9,13,4,6,2,4,12,5,7,8));

    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        for (int number:numbers){
            System.out.println(number);
        }

    }

}
