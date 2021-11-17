package three;

import java.util.Scanner;

/**
 * ovo import java.util.Scanner je klasa koju su nam dali na koristenje autori programa, da bi koristili Scanner, moramo
 * prvo ubaciti klasu preko import.. Kad god nam treba Scanner mi cemo ga kreirat uz import java.until.Scanner
 * shortcut za import java.util.Scanner je Alt + Enter kada odemo kursorom na Scanner ako nismo klasu ubacili a kod jesmo
 * <p>
 * Operatori Poredjenja - njihov ishod je uvijek true ili false
 * (==) operator jednakosti (true ili false)
 * "IF" funkcija
 */

public class ComparisonDemo {
    public static void main(String[] args) {
        System.out.println("Unesi prvi cijeli broj: ");
        // Scanner mojSkener = new
        int number1 = new Scanner(System.in).nextInt();    // System.in (system input)
        System.out.println("Unesi drugi cijeli broj:  ");
        int number2 = new Scanner(System.in).nextInt();    // uz pomoc ovakvog koda mozemo dati korisniku pravo da unese broj.
        if (number1 == number2) {  // ovo nam kaze IF(ako) izaberes 23 i 23 mozes uc u ovaj moj blok koda
            System.out.println("hej unio si dva jednaka broja ");
        }
        if (number1 != number2) {
            System.out.println("hej unio si dva razlicita broja");
        }
        if (number1 > number2) {
            System.out.println("prvi broj je veci od drugog");
        }
        if (number1 >= number2) {
            System.out.println("prvi broj je veci ili jednak drugom");
        }
        if (number1 <= number2) {
            System.out.println("prvi broj je manji ili jednak drugom");
        }
        if (number1 < number2) {
            System.out.println("prvi broj je manji od drugog");
        }
    }
    }
