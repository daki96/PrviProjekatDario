package five;

import java.util.Scanner;
 // Pravimo program koji je ce nam reci koliko puta se slovo p pojavljuje u tekstu
public class ContinueDemo2 {
    public static void main(String[] args) {
        System.out.println("Unesi neki tekst: ");
        String text = new Scanner(System.in).nextLine(); //kod brojeva nextInt a ovdje je nextLine
        char[] nizSlova = text.toCharArray(); // .toCharArray nam dopusta da od String varijable konvertujemo u niz slova
        char slovo = 'p';
        int brojacP = 0;
        for (int i = 0; i < nizSlova.length; i++) {
            char slovoNiza = nizSlova[i];
            if(slovo != slovoNiza) {  // ako je slovo razlicito od slova niza nemoj izvrsavat ovu liniju
                continue; //skipaj korak ove petlje, ako je uslov zadovoljen continue nam nece dati da nastavimo prema dole
                // tj prema brojacP++, vec ce nas vratiti gore prema i++, skipat ce taj korak petlje.
                // tj continue koristimo kada zelimo skipat neki dio koda petlje

            }
            brojacP++;

        }
        System.out.println("Slovo p se ponavlja " + brojacP + " puta");
    }
}
