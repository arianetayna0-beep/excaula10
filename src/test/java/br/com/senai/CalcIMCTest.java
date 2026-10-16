package br.com.senai;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcIMCTest {

    @Test
    void testarCalcularIMC() {
        CalcIMC calc = new CalcIMC();
        double resultado = calc.calcularIMC(70.0, 1.75);
        assertEquals(22.857, resultado, 0.001);
    }
        @Test
    void testarCalcularIMCExato() {
        CalcIMC calc = new CalcIMC();
        double resultado = calc.calcularIMC(80.0, 2.0);
        assertEquals(20.0, resultado, 0.001);
    }
}