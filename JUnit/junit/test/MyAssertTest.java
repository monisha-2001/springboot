import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyAssertTest {

    List<String> todos= Arrays.asList("AWS","SPRINGBOOT","MICROSERVICES");

    @Test
    void test() {
        boolean test=todos.contains("AWS");

        assertEquals(true,test);
        assertEquals(3,todos.size());

        assertTrue(test);
        assertEquals(3,todos.size(),"Error Message");

        assertArrayEquals(new int[]{1,2},new int[]{1,2});
    }
}