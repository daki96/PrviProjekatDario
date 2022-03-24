package Modul7;

import java.util.Scanner;

public class SoftGreske2 {
    public static void main(String[] args) {
        int numberA;
        int numberB;
        double numberC = 0; // posto lokalne promjenjljive ne dobijaju podrazumjevane vrijednosti mi moramo dodjelit neku vrijednost npr 0

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesi broj A: ");
        numberA = scanner.nextInt();

        System.out.println("Unesi broj B: ");
        numberB = scanner.nextInt();

        try {
            numberC = numberA / numberB;
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException exc){ // Naveli smo ovako dva konkretna tipa Exceptiona
            System.out.println("Exception class: " + exc.getClass());
            System.out.println("Exception message: " + exc.getMessage());
        }finally { // Blok koda koji ce se izvrsiti doslo do greske ili ne
            System.out.println("Code to always execute");
        }


        try {
            numberC = numberA / numberB;
        }catch (Exception exc){  // moze se i zamijeniti tip klase Exception za konkretan tip (ArithmeticException exc)
            // Exception je generalni tip dok ArithmeticException je konkretni tip koji pripada Exception
            // Ako unesemo neki konkretni tip izuzetka do kojeg nece doci onda se nece to u kodu ni obraditi Arrayindexoutofbounds je primjer
            System.out.println("Exception class: " + exc.getClass());
            System.out.println("Exception message: " + exc.getMessage());
        }

        System.out.println(numberC);

    }
}
