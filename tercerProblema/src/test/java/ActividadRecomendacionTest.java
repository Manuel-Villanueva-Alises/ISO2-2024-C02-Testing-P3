import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActividadRecomendacionTest {

    @Test
    public void testCaso1() {
        assertEquals("Quédate en casa", ActividadRecomendacion.recomendarActividad(true, -10, 13, true, true, true, true));
    }

    @Test
    public void testCaso2() {
        assertEquals("No puede realizar ninguna actividad", ActividadRecomendacion.recomendarActividad(false, 14, 40, false, false, false, true));
    }

    @Test
    public void testCaso3() {
        assertEquals("Quédate en casa", ActividadRecomendacion.recomendarActividad(true, 20, 65, true, false, true, false));
    }

    @Test
    public void testCaso4() {
        assertEquals("No puede realizar ninguna actividad", ActividadRecomendacion.recomendarActividad(false, 27, 0, false, true, true, true));
    }

    @Test
    public void testCaso5() {
        assertEquals("Quédate en casa", ActividadRecomendacion.recomendarActividad(true, 40, 14, true, true, true, false));
    }

    @Test
    public void testCaso6() {
        assertEquals("No puede realizar ninguna actividad", ActividadRecomendacion.recomendarActividad(false, 0, 15, false, false, false, true));
    }

    @Test
    public void testCaso7() {
        assertEquals("Quédate en casa", ActividadRecomendacion.recomendarActividad(true, 1, 59, true, false, true, true));
    }

    @Test
    public void testCaso8() {
        assertEquals("No puede realizar ninguna actividad", ActividadRecomendacion.recomendarActividad(false, 15, 60, false, true, true, false));
    }

    @Test
    public void testCaso9() {
        assertEquals("Quédate en casa", ActividadRecomendacion.recomendarActividad(true, 16, 13, true, true, false, true));
    }


	@Test
	public void testCaso10() {
	    assertEquals("No puede realizar ninguna actividad", ActividadRecomendacion.recomendarActividad(false, 24, 40, false, true, false, false));
	}

    @Test
    public void testCaso11() {
        assertEquals("Quédate en casa", ActividadRecomendacion.recomendarActividad(true, 25, 65, true, true, true, true));
    }

    @Test
    public void testCaso12() {
        assertEquals("No puede realizar ninguna actividad", ActividadRecomendacion.recomendarActividad(false, 35, 14, false, false, false, false));
    }
}