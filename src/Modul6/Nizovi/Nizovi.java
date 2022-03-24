package Modul6.Nizovi;

import java.util.Arrays;

public class Nizovi {
    public static void main(String[] args) {
//        int[] numbers = new int[] {4,4,2,5,2,6,8};

        Object[] numbers = {4,4,2,5,8.2,6,8, "Hello"}; // Posto niz prima samo jedan tip podatka a ne kombinaciju mi ne mozemo uvrstiti
        // npr neki decimalan broj npr 6.4 vec moramo dodati jednu kljucnu rijec Object [] koja prima sve
        // sada vidimo da ova kljucna rijec Object dozvoljava da 8.2 pripada nizu
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(numbers[4]);
//        System.out.println(numbers.length);

        // OSNOVNI PRISTUP ZA PROLAZAK KROZ NIZ JESTE UZ POMOC PETLJI

        for (int i = 0; i < numbers.length; i++) { // Sve dok je "i" manje od duzine niza izvrsavat ce se blok koda
            System.out.println(numbers[i]); // Ovako ispisujemo vrijednost na poziciji indeksa ciju vrijednost trenutno
                                            // ima brojač petlje, tj bit ce ispisani ovi brojevi gore u zagradi viticastoj
                                            // isti samo sto ce biti jedno ispod drugog
        }
        // FOR ENHANCED

        for (Object number : numbers) { // Samo razvojno okruzenje nam nudi Enhanced For petlju kada predjemo kursorom preko for kljucne rijeci
            System.out.println(number);
        }



    }
}
