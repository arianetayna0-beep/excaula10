package br.com.senai;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcPotenciaTeste {

    @Test
    void testarCalcularPotencia() {
        CalcPotencia calc = new CalcPotencia();
        double potencia = calc.calcularPotencia(220.0, 5.0);
        assertEquals(1100.0, potencia);
    }
}
