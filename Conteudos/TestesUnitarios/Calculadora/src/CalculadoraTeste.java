import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTeste {

    @Test
    public void deveraSomarDoisNumerosPositivos(){
        Calculadora calc = new Calculadora();
        int soma = calc.Somar(7, 3);

        assertEquals(10, soma);
    }

}
