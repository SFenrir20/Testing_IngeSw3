package test;

import app.calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculadoraTest {

    @Test
    void testSumar(){
        calculadora calc = new calculadora();
        assertEquals(5, calc.sumar(2,3));
    }

    @Test
    void testRestar(){
        calculadora calc = new calculadora();
        assertEquals(1, calc.restar(3,2));
    }
}

