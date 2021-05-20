import static org.junit.Assert.*;
import org.junit.*;

public class Testcontador {

    @Test
    public void testtcon() {
        Calcular cal = new Calcular(0, 1, 2);
        assertNotNull(cal);
    }

    @Test
    public void testtcontador() {

        Calcular cal = new Calcular(0, 10, 1);
        assertTrue(cal.compro());
    }

    @Test
    public void testtincrem() {
        Calcular cal = new Calcular(0, 10, 1);
        cal.incrementuodesbordar();

        assertEquals(1, cal.incrementuodesbordar());
    }

    @Test
    public void testtincremdesbor() {
        Calcular cal = new Calcular(1, 3, 2);
        cal.incrementuodesbordar();
        cal.incrementuodesbordar();




        assertEquals(0 , cal.incrementuodesbordar());
    }

    @Test

    public void testreset() {
        Calcular cal = new Calcular(2, 10, 5);
        cal.resetear();
        assertTrue(cal.resetear());
    }

}
