package four.loop;

/**
 *  PETLJA - Blok koda koji se izvrsava sve dok je zadovoljen uslov petlje
 *  while (condition) {  blok koda   } // sve dok je moj uslov zadovoljen ides u moj blok koda
 */
public class WhileDemo {
    public static void main(String[] args) {
        //if (.....) kod if konstrukcije ide true ili false
        //while (.....) kod while konstrukcije takodjer ide true ili false
        //kod while ce se blok koda {}, izvrsavati sve dok je uslov u zagradi zadovoljen tj. sve dok je uslov true

       // while (true) {
            //System.out.println("Evo nas u petlji"); // posto je uslov zadovoljen tj true u zagradi onda ce se ovaj blok koda
            // izvrsavati bezbroj puta zato sto ga program izvrsi te se iteracijom vrati i vidi da je opet uslov zadovoljen te opet izvrsi

        int number = 1;

        while (number<=10) {
            System.out.println(number);   // ovdje ce se ispisivati samo jedinice beskonacno posto je jedinica kod int fiksirana
            number++;  // zbog toga dodajemo ++ da bi se vrijednost povecavala pri svakom ponavljanju
        }

    }
}
