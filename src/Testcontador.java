import static org.junit.Assert.*;
import org.junit.*;

public class Testcontador {

    @Test
    public void testtcontador() {

        Calcular cal = new Calcular(0, 10, -1);
        assertEquals(true, cal.compro());

    }

}