import Exeptions.NumeroNegativoExeption;
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
}
