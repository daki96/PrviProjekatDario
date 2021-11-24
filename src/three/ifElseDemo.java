package three;

import java.util.Scanner;

// primjer kontrole toka sa if else
public class ifElseDemo {
    public static void main(String[] args) {
        // profesor unosi broj poena ostvarenih na ispitu
        System.out.println("Profa unesite broj poena nakon pregledanog ispita");
        int brojPoena = new Scanner(System.in).nextInt();
        char ocjena;
        if (brojPoena >= 90) {
            ocjena = 'A';

        } else if (brojPoena >= 80) {
            ocjena = 'B';
        } else if (brojPoena >= 70) {
            ocjena = 'C';
        } else if (brojPoena >= 60) {
            ocjena = 'D';
        } else if (brojPoena >= 50) {
            ocjena = 'E';
        } else {
            ocjena = 'F';
    }
        System.out.println("Zasluzena ocjena je : " + ocjena);

}
    }
