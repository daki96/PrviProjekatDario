package Modul6.Nizovi;

import java.util.Arrays;

public class NizoviKopiranje {
    public static void main(String[] args) {
        int [] numbers = {2, 4, 5, 7, 2, 1};
        int [] numbers2 = {12,13,14};

        // Ako zelimo da dodamo elemente varijable numbers2 {12,13,14} ovom nizu gore iznad tj pod varijablom numbers
        // Onda se kreira novi treci niz, te se sadrzaji ovih nizova prekopiraju u taj novi niz i onda se dobija niz
        // koji ce imati sve ove elemente u sebi
        // EVO KAKO SE TO RADI
        int [] destArray = new int[numbers.length + numbers2.length];
        System.arraycopy(numbers, 0, destArray, 0, numbers.length);
        System.arraycopy(numbers2,0,destArray,numbers.length, numbers2.length);

        System.out.println(Arrays.toString(destArray));

        /**
         * Da pojasnimo ovo iznad,
         * System.arraycopy(numbers, srcPos: 0, destArray,desPos: 0, numbers.length);
         * 1. Prvo dodajemo varijablu numbers prvog niza, 2. nakon toga pocetni indeks tog niza " 0 " , 3. zatim odredisni niz
         * dodamo tj niz u koji se salju vrijednost " destArray " , 4. zatim pocetni niz u odredisnom nizu tj u " destArray "
         *  tj " 0 " , 5. i onda broj clanova koji ce biti kopirani tj posto cemo mi dodati sve clanove niza onda dodajemo
         *  " numbers.lenght ".
         *
         *  Sad da se pojasni drugi niz
         *  System.arraycopy(numbers2,0,destArray,numbers.length, numbers2.length);
         *  1. Prvo dodajemo varijablu niza numbers2, 2.nakon toga pocetni indeks tog niza " 0 " , 3. nakon toga odredisni niz
         *  tj "destArray", 4. zatim pocetni niz u odredisnom nizu tj ne mozemo staviti 0 jer bi se prepisali preko ovih brojeva
         *  iz prvog niza, zato stavljamo da pocinje od "numbers.lenght" pa da nastavi dalje da se ne bi preklopilo,
         *  5. i onda broj clanova koji ce biti kopirani tj posto cemo mi dodati sve clanove niza onda dodajemo
         *          *  " numbers2.lenght ".
         *
         *   Onda nakon svega ide  System.out.println(Arrays.toString(destArray)); za ispis kopiranih nizova
         *
         *
         */


    }
}
