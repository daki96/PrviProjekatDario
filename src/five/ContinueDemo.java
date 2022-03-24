package five;

import java.util.Scanner;

/**
 * Pravimo program koji ce nam reci koliko puta se pojavljuje slovo p u tekstu
 */
public class ContinueDemo {
    public static void main(String[] args) {
        System.out.println("Unesi neki tekst: ");
        String text = new Scanner(System.in).nextLine();
        char[] nizSlova = text.toCharArray(); // .toCharArray nam dopusta da od String varijable konvertujemo u niz slova
        char slovo = 'p';
        int brojacP = 0;
        for (int i = 0; i < nizSlova.length; i++) {
            char slovoNiza = nizSlova[i];
            if(slovo == slovoNiza) {
                brojacP++;
            }

        }
        System.out.println("Slovo p se ponavlja " + brojacP + " puta");

    }
}
