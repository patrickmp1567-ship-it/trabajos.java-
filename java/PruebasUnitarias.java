package main.test.com.eam.app;

import main.java.com.eam.app.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        assertEquals(5.0, Calculadora.sumar(2.0, 3.0));
    }

    @Test
    public void testRestar() {
        assertEquals(1.0, Calculadora.restar(3.0, 2.0));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6.0, Calculadora.multiplicar(2.0, 3.0));
    }

    @Test
    public void testDividir() {
        assertEquals(2.0, Calculadora.dividir(6.0, 3.0));
    }
}