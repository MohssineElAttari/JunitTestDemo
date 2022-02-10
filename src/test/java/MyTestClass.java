import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class MyTestClass {
    @Test
    public void test1(){
//        assertTrue((10 * 2) ==30); // false
        assertTrue((10 * 2) ==20); // true

    }
    @ParameterizedTest
    @ValueSource(ints = 8)
    public void test2(int nbr){
        //test length
        assertEquals(nbr,"mohssine".length());
    }
    @ParameterizedTest
    @ValueSource(ints = {10,10})
    public void test3(int nbr){
        assertTrue((nbr * 2) ==20); // true
    }
}
