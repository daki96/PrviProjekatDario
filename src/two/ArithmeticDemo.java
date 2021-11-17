/**
 * Operatori :
 * 1. Dodjele
 * 2. Aritmeticki
 * 3. Unarni operatori
 * <p>
 * Aritmeticki :
 * (+) Additive (sabiranje)
 * (-) Subtraction (oduzimanje)
 * (*) Multiplication (mnozenje)
 * (/) Division (dijeljenje)
 * (%) Modulo operator
 */

package two;

public class ArithmeticDemo {
    public static void main(String[] args) {
        int broj1 = 23;
        int broj2 = 13;
        // Additive ( sabiranje )
        int result = broj1 + broj2;
        System.out.println("Result is: " + result);

        // Subtraction ( oduzimanje )
        result = result - 3;
        System.out.println("Oduzimanje : " + result);
        // Multiplication (mnozenje)
        result = result * 2;
        System.out.println("Mnozenje :" + result);
        // Division ( Djeljenje )
        result = result / 3;
        System.out.println("Djeljenje :" + result);
        // Modulo
        result = result % 7; // 22/7=3 ostatak je 1 a to je i rezultat, rezultat ovog operatora je ono sto ostane od djeljenja
        //NPR ako stavimo %6  -  22/6=3 ostatak je 4 jer 18 + 4 je 22 tako da je rezultat 4
        System.out.println("Modulo result: " + result);

        char singCharacter = 'w';
        String ime = "Dario"; //String nije prost ali se tako ponasa, def je da je String niz karaktera(slova ili brojeva)
        String prezime = "Prezime";
    }
}
