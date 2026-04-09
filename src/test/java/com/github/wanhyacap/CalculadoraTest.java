package com.github.wanhyacap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private Calculadora calc;

    @BeforeEach
    void setUp() {
        calc = new Calculadora();
    }

    @Test
    void testSomar() {
        assertEquals(5, calc.somar(2, 3));
    }

    @Test
    void testSubtrair() {
        assertEquals(1, calc.subtrair(3, 2));
    }

    @Test
    void testMultiplicar() {
        assertEquals(6, calc.multiplicar(2, 3));
    }

    @Test
    void testDividir() {
        assertEquals(2.5, calc.dividir(5, 2), 1e-9);
    }

    @Test
    void testDivisaoPorZero() {
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(1, 0));
    }
}
