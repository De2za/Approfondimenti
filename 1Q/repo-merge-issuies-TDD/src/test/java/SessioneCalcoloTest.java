import Exeptions.NumeroNegativoExeption;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class SessioneCalcoloTest {

    @Test
    void eseguiDivisione_shouldAddResultToStorico_forValidDivision() {
        SessioneCalcolo session = new SessioneCalcolo();
        session.eseguiDivisione(10.0, 2.0);
        List storico = session.getStorico();
        assertEquals(1, storico.size());
        assertTrue(storico.get(0).toString().contains("Divisione: 10.0 / 2.0 = 5.0"));
    }

    @Test
    void eseguiDivisione_shouldAddErrorToStorico_whenDividingByZero() {
        SessioneCalcolo session = new SessioneCalcolo();
        session.eseguiDivisione(10.0, 0.0);
        List storico = session.getStorico();
        assertEquals(1, storico.size());
        assertTrue(storico.get(0).toString().contains("Errore: divisione per zero"));
    }

    @Test
    void computeSqrt_shouldAddResultToStorico_forPositiveNumber() {
        SessioneCalcolo session = new SessioneCalcolo();
        session.computeSqrt(9.0);
        List storico = session.getStorico();
        assertEquals(1, storico.size());
        assertTrue(storico.get(0).toString().contains("Radice quadrata: 9.0 = 3.0"));
    }

    @Test
    void computeSqrt_shouldAddErrorToStorico_forNegativeNumber() {
        SessioneCalcolo session = new SessioneCalcolo();
        session.computeSqrt(-4.0);
        List storico = session.getStorico();
        assertEquals(1, storico.size());
        assertTrue(storico.get(0).toString().contains("Errore: radice di numero negativo"));
    }

    @Test
    void getStorico_shouldReturnEmptyList_initially() {
        SessioneCalcolo session = new SessioneCalcolo();
        assertTrue(session.getStorico().isEmpty());
    }
}
