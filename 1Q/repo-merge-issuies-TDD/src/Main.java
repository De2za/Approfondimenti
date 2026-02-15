import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, n4, n5, n6;
        SessioneCalcolo sessione = new SessioneCalcolo();


        System.out.println("PRIMA DIVISIONE: ");
        System.out.println("inserisci numero uno: ");
        n1 = sc.nextDouble();
        System.out.println("inserisci numero due: ");
        n2 = sc.nextDouble();

        System.out.println("SECONDA DIVISIONE: ");
        System.out.println("inserisci numero uno: ");
        n3 = sc.nextDouble();
        System.out.println("inserisci numero due: ");
        n4 = sc.nextDouble();


        System.out.println("PRIMA RADICE QUADRATA");
        System.out.println("inserisci numero: ");
        n5 = sc.nextDouble();

        System.out.println("SECONDA RADICE QUADRATA");
        System.out.println("inserisci numero: ");
        n6 = sc.nextDouble();





        sessione.eseguiDivisione( n1, n2);
        sessione.eseguiDivisione(n3, n4);


        sessione.computeSqrt(n5);
        sessione.computeSqrt(n6);


        System.out.println("Storico operazioni:");
        for (Object operazione : sessione.getStorico()) {
            System.out.println(operazione);
        }
    }
}
