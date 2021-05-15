package co.eltiempo.prueba.suma;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PruebaSumaTest {

    @Test
    public void testSuma(){
        int a =2;
        int b =4;

        Assertions.assertEquals(a+b,6);
    }
}
