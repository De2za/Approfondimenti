public class Main {

    public static void main(String[] args) {

        SessioneCalcolo sessione = new SessioneCalcolo();

        sessione.eseguiDivisione(10, 5);
        sessione.eseguiDivisione(5, 0);


        sessione.computeSqrt(16);
        sessione.computeSqrt(-4);


        System.out.println("Storico operazioni:");
        for (Object operazione : sessione.getStorico()) {
            System.out.println(operazione);
        }
    }
}
