package Modul6.Tekst;

import java.util.Locale;

public class Tekst3 {
    public static void main(String[] args) {
       // Utvrdjivanje duzine Stringa

        String word = "Hello";
        //System.out.println(word.length()); // 5 - ovaj String ima 5 karaktera

        // Pretvaranje Stringa u niz karaktera

        char[] chars = word.toCharArray(); // Sa ovom metodom ce ovaj gore String biti razbijen u pojedinacne karaktere
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        // UPPER CASE - ovom metodom sva slova u Stringu pretvaramo u velika slova

        String str = "Welcome to ITA";
        System.out.print("Return Value: ");
        System.out.println(str.toUpperCase());
        // LOWER CASE - po identicnom principu funkcionise samo sto je u malim slovima
        System.out.println(str.toLowerCase());

        // TRIM METODA - unistava prazna mjesta ispred teksta i nakon
        String str1 = "       Welcome to ITA         ";
        System.out.println("Original String: " + str1);
        System.out.println("Final string: " + str1.trim());






    }
}
