package br.com.senai;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcPotenciaTest {

    @Test
    void testarCalcularPotencia() {
        CalcPotencia calc = new CalcPotencia();
        double potencia = calc.calcularPotencia(220.0, 5.0);
        assertEquals(1100.0, potencia, 0.001);
    }

    @Test
    void testarPotenciaSemCorrente() {
        CalcPotencia calc = new CalcPotencia();
        double potencia = calc.calcularPotencia(127.0, 0.0);
        assertEquals(0.0, potencia, 0.001);
    }
}