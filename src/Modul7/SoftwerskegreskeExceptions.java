package Modul7;

import java.util.Scanner;

/**
 * Imamo 3 vrste gresaka: Sintaksne , Runtime i Logicke greske
 */
public class SoftwerskegreskeExceptions {
    public static void main(String[] args) {
        int numberA;
        int numberB;
        double numberC = 0; // posto lokalne promjenjljive ne dobijaju podrazumjevane vrijednosti mi moramo dodjelit neku vrijednost npr 0

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesi broj A: ");
        numberA = scanner.nextInt();

        System.out.println("Unesi broj B: ");
        numberB = scanner.nextInt();

        // try je blok u koji trebamo da navedemo neki kod koji moze postati izuzetak tj pokusaj i ukoliko dodje do prob onda se aktivira
        // blok koda " catch "
        try {
            numberC = numberA / numberB;
        }catch (Exception exc){ // Blok catch prihvata parametar koji se odnosi na promjenjljivu koja ce da bude upotpunjena objektom izuzetka
            System.out.println("There is an error");
        }


        //numberC = numberA / numberB;// Da ne bi morali zaustavljat izvrsavanje programa sa greskom onda ubacujemo exception
        //u blokove koda naredbi "try" i "catch"

        System.out.println(numberC);

    }
}
