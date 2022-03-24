package six;

/**
 * Modifikatori vidljivosti :
 * 1. public
 * 2. package private - nista ne stavimo ispred class
 * 3. protected
 * 4. private
 *
 * OUTER KLASA ( SixDemo ) moze imati -> public i package private
 *
 * Klasa moze imati :
 * 1. nestaticka polja ili Atributi - za pristupanje ovim poljima moramo imati objekat
 *2. staticka polja ili atributi  -  za pristupanje ovim poljima nam ne treba objekat vec mozemo i klasno pristupiti(cak se ono u drugoj memoriji skladisti tj u globalnom polju)
 *
 * 3. VAZNOO ! isto nam je i za funkcije ili metode ako su nestaticke treba nam objekat dok ako su staticke onda nam ne treba objekat vec moze i klasno pristupanje
 */

public class SixDemo {  // Klasa koja predstavlja fajl tj ova SixDemo klasa se naziva OUTER KLASA tj ona predstavlja SixDemo.java
    public static void main(String[] args) {
        Movie.print();// Ovako pristupamo statickoj metodi print (public static void print() ) dok njoj takodjer mozemo pristupiti i preko
        // imena objekta tj movie1.print(); je tacno
        // VAZNO Poziv staticke funkcije ili metode mozemo uciniti preko varijable objekta ili klase

        System.out.println(Movie.counter);// 0     - Pravilniji je ovaj pristup statickom polju tj atributu nego preko
        // varijable iz objekta kao dole sto je (movie1.counter)

        Movie movie = new Movie();
        movie.title = "Djanko";
        movie.director = "Tarantino";
        movie.setReview(9);
        System.out.println(movie.counter); // ispis ce biti 1 radi toga sto je ovo iz prvog objekta kao i counter++ u konstruktoru

        int review1 = movie.getReview();

        Movie movie1 = new Movie();
        movie1.director = "Steven Spielberg";
        movie1.setReview(6);
        movie1.title = "E.T.";
        System.out.println(movie1.counter);// ispis ce biti 2 jer je iz drugog objekta


        Movie movie2 = new Movie("Nicija zemlja");
        System.out.println(movie2.counter);// ispis je 3 radi toga sto je ovo treci objekat
        System.out.println(movie.counter);// ispis je 3 jer se opet radi o naravno 3 objektu

        Movie1 movie11 = new Movie1();
        movie11.setDirector("Steven");
        movie11.setReview(6);
        System.out.println(movie11.getReview());// gore odma iznad smo preko setReview stavili vrijednost a dobijamo je preko
                                                  // getReview
        movie11.setDirector("Steven");

        // Movie1.setDirector("Steven") - da bi ovu metodu pozvali preko klase Movie1 onda je moramo uciniti statickom da bi bila tacna
        // a ako ne zelimo da bude staticka vec samo void onda je pozivamo preko imena objekta tjj movie11.setDirector(); ovo je tacno

        // VAZNO tj ako zelimo da pozovemo funkciju a da ne moramo pravit objekat vec je mozemo pozvat preko klase onda je pravimo statickom!!!!


        Movie movie3 = new Movie("Mrtav ladan", "Steven", 4);
    }
}
