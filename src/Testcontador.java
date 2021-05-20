import static org.junit.Assert.*;
import org.junit.*;

public class Testcontador {

    @Test
    public void testtcon() {
        Calcular cal = new Calcular(0, 1, 2);
        assertNotNull(cal);
    }

    @Test
    public void testigual() {
        Calcular cal = new Calcular(0, 1, 20);
        Calcular cal2 = new Calcular(0, 10, 2);
        assertSame(cal, cal2);
    }

    @Test
    public void testtcontador() {

        Calcular cal = new Calcular(0, 10, 1);
        assertEquals(true, cal.compro());
    }

    @Test
    public void testtincrem() {
        Calcular cal = new Calcular(0, 10, 1);
        cal.incrementuodesbordar();

        assertEquals(true, cal.incrementuodesbordar());
    }

    @Test
    public void testtincremdesbor() {
        Calcular cal = new Calcular(0, 10, 5);
        cal.incrementuodesbordar();
        cal.incrementuodesbordar();
        cal.incrementuodesbordar();

        assertEquals(true, cal.incrementuodesbordar());
    }

    @Test

    public void testreset() {
        Calcular cal = new Calcular(2, 10, 5);
        cal.resetear();
        assertEquals(true, cal.resetear());
    }

}
