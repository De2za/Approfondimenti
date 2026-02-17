package repo.merge.issuies.tdd;

import java.util.Scanner;
import repo.merge.issuies.tdd.SessioneCalcolo;

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

        double n7, n8, n9, n10, n11, n12;

        System.out.println("PRIMA SOMMA: ");
        System.out.println("inserisci numero uno: ");
        n7 = sc.nextDouble();
        System.out.println("inserisci numero due: ");
        n8 = sc.nextDouble();

        System.out.println("PRIMA SOTTRAZIONE: ");
        System.out.println("inserisci numero uno: ");
        n9 = sc.nextDouble();
        System.out.println("inserisci numero due: ");
        n10 = sc.nextDouble();

        System.out.println("PRIMA MOLTIPLICAZIONE: ");
        System.out.println("inserisci numero uno: ");
        n11 = sc.nextDouble();
        System.out.println("inserisci numero due: ");
        n12 = sc.nextDouble();


        sessione.eseguiDivisione( n1, n2);
        sessione.eseguiDivisione(n3, n4);


        sessione.computeSqrt(n5);
        sessione.computeSqrt(n6);

        sessione.eseguiSomma(n7, n8);
        sessione.eseguiSottrazione(n9, n10);
        sessione.eseguiMoltiplicazione(n11, n12);


        System.out.println("Storico operazioni:");
        for (Object operazione : sessione.getStorico()) {
            System.out.println(operazione);
        }
    }
}
