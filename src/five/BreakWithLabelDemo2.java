package five;

import javax.swing.*;
// Petlja je blok koda koji se ponavlja sve dok je zadovoljen uslov;
// uslov u ovoj dole situaciji je i < numbers.lenght;
public class BreakWithLabelDemo2 {
    public static void main(String[] args) {
        int[][] numbers = {
                {23, 24, 32, 13},
                {12, 1012, 2000, 80, 50},  // OVO JE MATRICA
                {765, 345, 2, 123}
        };
        int uneseniBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj: ")); //Veliki brat Integer nam pomaze
        // da unesenu vrijednost bilo koju prenesemo u tekst (KONVERTOR U TEKST).parseInt znaci rasclani tekst i od njega
        // napravi broj i ubaci ga u Integer varijablu
        boolean foundIt = false;// zadnje je dodano i takodjer s ovim oznacavamo inicijalno i onda nastavak dole kod true
        MOJAPETLJA :for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                int brojUNizu = numbers[i][j];
                if(brojUNizu == uneseniBroj) {  // Provjeravamo da li je broj iz niza jednak unesenom
                    foundIt = true; // kada nadjemo vrijednost tj uslov se ispuni onda je foundIt true i prolazi kroz ovaj kod
                    System.out.format("Uneseni broj %s se nalazi na poziciji %s, %s",uneseniBroj,i,j );
                    // %s nebitan je karakter, ovo nam daje pozicije u tekstu a mi ih postavljamo tako sto nakon
                    // ispisa stavimo zarez pa varijable na pozicije koje mjenjaju sve %s
                    break MOJAPETLJA; // kada se postigne uslov break ce nas izbacit iz samo jedne petlje a drugu ce izvrsit
                    //tj ako stavimo 2000 nece se gledati 80,50 ali ce se gledati 765,345,2,123 jer je to drugi skup
                }
            }
            if(foundIt) {
                break MOJAPETLJA;  // ako je foundIt true bjezi iz obje petlje tj izadji da ne bi provjeravao 765,345,2,123 ako smo
                //ukucali 2000

        }    // Break sa LABELOM :MOJAPETLJA JE ZADNJE DODANO I ONO JE LAKSI NACIN IZLASKA IZ PETLJE,LAKSI OD BOOLEAN VERZIJE
            // STAVIMO PROIZVOLJNI TEKST KOD POCETKA// PETLJE TJ MOJAPETLJA: for...
            //  TE GDJE ZELIMO IZACI IZ NJE TJ KOD BREAK KAO NPR break MOJAPETLJA;


    }
}
    }
