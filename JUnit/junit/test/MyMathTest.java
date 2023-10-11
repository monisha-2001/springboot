import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    private MyMath math=new MyMath();

    @Test
    void calculateSum_ThreeMemberArray() {
        assertEquals(5, math.calculateSum(new int[]{1, 2, 3}));
    }

        //step 03
        @Test
        void calculateSum_ZeroLengthArray() {
            assertEquals(0, math.calculateSum(new int[]{}));
    }
}