package repo.merge.issuies.tdd;

import repo.merge.issuies.tdd.Exeptions.NumeroNegativoExeption;
import repo.merge.issuies.tdd.Calcolatrice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcolatriceTest {

    @Test
    void divide_shouldReturnCorrectResult_forPositiveNumbers() {
        Calcolatrice calculator = new Calcolatrice();
        assertEquals(2.0, calculator.divide(4.0, 2.0));
    }

    @Test
    void divide_shouldThrowArithmeticException_whenDividingByZero() {
        Calcolatrice calculator = new Calcolatrice();
        assertThrows(ArithmeticException.class, () -> calculator.divide(10.0, 0.0));
    }

    @Test
    void sqrt_shouldReturnCorrectResult_forPositiveNumber() throws NumeroNegativoExeption {
        Calcolatrice calculator = new Calcolatrice();
        assertEquals(2.0, calculator.sqrt(4.0));
    }

    @Test
    void sqrt_shouldThrowNumeroNegativoExeption_forNegativeNumber() {
        Calcolatrice calculator = new Calcolatrice();
        assertThrows(NumeroNegativoExeption.class, () -> calculator.sqrt(-1.0));
    }

    @Test
    void add_shouldReturnCorrectResult() {
        Calcolatrice calculator = new Calcolatrice();
        assertEquals(5.0, calculator.add(2.0, 3.0));
        assertEquals(-1.0, calculator.add(2.0, -3.0));
    }

    @Test
    void subtract_shouldReturnCorrectResult() {
        Calcolatrice calculator = new Calcolatrice();
        assertEquals(1.0, calculator.subtract(3.0, 2.0));
        assertEquals(5.0, calculator.subtract(2.0, -3.0));
    }

    @Test
    void multiply_shouldReturnCorrectResult() {
        Calcolatrice calculator = new Calcolatrice();
        assertEquals(6.0, calculator.multiply(2.0, 3.0));
        assertEquals(-6.0, calculator.multiply(2.0, -3.0));
        assertEquals(0.0, calculator.multiply(0.0, 5.0));
    }
}
