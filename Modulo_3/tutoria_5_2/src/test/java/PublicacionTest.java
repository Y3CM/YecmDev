import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import com.devsenior.yecm.Publicacion;

public class PublicacionTest {

    private Publicacion publicacion;

    @BeforeEach
    public void setUp() {
        publicacion = new Publicacion();
    }

    @Test
    public void newPublicacionTest() {
        assertEquals(0, publicacion.getMeGusta());
    }

    @Test
    public void testDarMeGusta() {
        publicacion.darMeGusta();
        assertEquals(1, publicacion.getMeGusta());
    }

    @Test
    public void testDarMeGusta2() {
        publicacion.darMeGusta();
        publicacion.darMeGusta();
        assertEquals(2, publicacion.getMeGusta());
    }
}
