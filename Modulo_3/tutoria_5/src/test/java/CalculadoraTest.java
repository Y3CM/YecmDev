import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.devsenior.yecm.Calculadora;

public class CalculadoraTest {

    private Calculadora calculadora;
    @BeforeEach
    void setup() {
        calculadora = new Calculadora();
    }

@Test
    public void testSuma() {
        
        int resultado = calculadora.sumar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    public void testResta() {
        int resultado = calculadora.restar(5, 3);
        assertEquals(2, resultado);
    }

    @Test
    public void testMultiplicacion() {
        int resultado = calculadora.multiplicar(2, 3);
        assertEquals(6, resultado);
    }

    @Test
    public void testDivision() {
        int resultado = calculadora.dividir(10, 2);
        assertEquals(5, resultado);
    }

    @Test
    public void testDivisionPorCero() {
       Exception exception = assertThrows(ArithmeticException.class, () -> {
           calculadora.dividir(10, 0);
       });

       assertEquals("No se puede dividir por cero", exception.getMessage());
    }
    
}
