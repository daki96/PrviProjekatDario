package Modul6.Brojevi;

public class Brojevi3Math2 {
    public static void main(String[] args) {

        // Metoda za zaokruzivanje brojeva

        System.out.println(Math.round(5.4));  // 5   - Kao i u skoli ako je 1,5 onda zaokruzimo 2 ako je manje onda stavimo 1
        System.out.println(Math.round(5.5));  // 6
        System.out.println(Math.round(5.6));  // 6

        System.out.println(Math.floor(5.4)); // 5.0 ova metoda prosledjuje prvi manji cio broj tj i sa 5.9 bi pisalo 5.0
        System.out.println(Math.floor(5.5)); // 5.0  sve dok ne bude pisalo 6
        System.out.println(Math.floor(5.6)); // 5.0

        System.out.println(Math.ceil(5.4)); // 6.0   - ovo je metoda koja prosledjuje kontra od .floor tj prvi veci cio broj
        System.out.println(Math.ceil(5.5)); //  6.0    da pise 5.1 opet ce biti 6
        System.out.println(Math.ceil(5.6)); // 6.0

        String str = "ita";

        char[] chars = str.toCharArray();
        System.out.println(chars);



    }
}

