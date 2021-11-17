package two;

/**
 * Unarni operatori
 * 1. +
 * 2. -
 * 3. ++   pre i post (increment)
 * 4. --   pre i post (decrement)
 * 5. !    operator negacije
 */

public class UnaryDemo {
    public static void main(String[] args) {
        int broj1 = +23;
        System.out.println("Broj 1 sa + : " + broj1);
        broj1 = -broj1;
        System.out.println("Broj 1 sa - :" + broj1);

        broj1 = 23;
        ++broj1; // ovo je PRE INCREMENT jer se nalazi ispred
        System.out.println("Pre INCREMENT : " + broj1); // ispast ce isto kao i sa post (24)

        broj1 = 23;
        System.out.println(++broj1); //sad ce bit 24 (pre increment) kaze uvecaj broj za 1 kad ga uvecas onda salji u konzolu

        broj1 = 23;
        broj1++; // broj1 = broj1 + 1 tako da je od 23 doslo do 24 ( ovo je POST INCREMENT ) jer se nalazi nazad tj broj1(++)
        // ++ se zove INCREMENT sto znaci UVECAJ ZA JEDAN (+1)
        System.out.println("Post INCREMENT: " + broj1);

        broj1 = 23;
        System.out.println(broj1++); //bit ce 23 zato sto kod post increment u println se desavaju dvije radnje, prvo posalji
        // u konzolu pa onda posle uvecaj za 1 tj u drugoj liniji ce bit uvecano i sad kad stavimo novi println
        System.out.println(broj1); // kao sto rekosmo u ovoj liniji ce se pojaviti vrijednost 24 bez ikakve operacije.

        // Post Decrement ( -- )

        broj1 = 23;
        System.out.println(broj1--); // 23 ce biti u ovoj liniji dok u donjoj ce biti 22 isto kao i kod post increment
        System.out.println(broj1); // 22 je rezultat jer prvo se mora poslat u konzolu na toj liniji to kaze jedan +
        // a drugi + kaze ispisi za -1 sto ce se desiti u drugoj liniji.

        // Pre Decrement ( -- )
        broj1 = 23;
        System.out.println(--broj1); // 22 je rezultat.

        boolean lav = false;
        System.out.println(!lav); // ovaj operator negacije( ! ) se obicno koristi da invertujemo vrijednost, tako da
        // ce u izvrsavanju programa umjesto false stojati true jer ga negacija invertuje.




    }
}
