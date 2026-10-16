package br.com.senai;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcIMCTeste {

    @Test
    void testarCalcularIMC() {
        CalcIMC calc = new CalcIMC();
        double resultado = calc.calcularIMC(70.0, 1.75);
        assertEquals(22.857, resultado, 0.001);
    }
}