package six;
// void funkcija - nema nikakav rezultat tj nema povratnu vrijednost
// Konvencija za imenovanje funkcija ili metoda je da ime mora oznacavati neku radnju, kao npr dajOcjenu,setReview, setThis,getThat
// Metoda je blok koda koji se poziva kad ga neko pozove

// Vlastiti ili slozeni tipovi nam trebaju da bi prevazisli ogranicenja koje imaju nizovi da svi moraju biti istog tipa
// unutar niza

// 1. polja ili atributi
// 1.1 ona su vezana u ovom slucaju za movie, movie1, instance ili varijable u SixDemo
// 1.2 Staticka polja

// 2. Konstruktor- za njega ne vezemo nikad static vec je on vezan sa objektom

// 3. Funkcije ili metode
// 3.1 instancne
// 3.2 Staticke

// 4. inner class

public class Movie {
    public String title;
    public String director;
    private int review;
    public static int counter = 0; // ovo staticko polje mozemo gledati kao dijeljeno polje tj globalno
    // samo konstruktor uvecava u ovom slucaju counter varijablu
    // Staticki elementi su vezani za sve primjerke, svi objekti dijele staticke elemente

    public Movie() {
        System.out.println("Konstruktor se pozvao........");
        counter++;

    }
    public Movie (String title, String director, int review){ // mozemo mi stvoriti konstruktora koliko zelimo a broj parametara u main klasi ce nam odredjivat
        // koji ce se konstruktor pozvati
        this.title = title;
        this.director = director;
        this.review = review;
    }

    public Movie(String title) {
        System.out.println("Konstruktor se pozvao sa jednim parametrom");
        counter++;
    }
    public Movie (String title, String director){ // Kao sto vidimo imamo ovdje dva primjera konstruktora sa istim brojem parametara,medjutim oni su tacni
                                                  // jer im nisu skroz isti parametri unutar konstruktora tj tipovi pod. Samo je greska ako je sve isto,
                                                  // ovo se zove OVERLOADING po broju parametara strucno, a kada gledamo String i int ,pa String i String
                                                  // onda se to naziva OVERLOADING po tipu podatka
                                                  // OVERLOADING po tipu tacno je konstruktor sa String i int ,   int pa String
        this.title = title;
        this.director = director;
    }
    public Movie (String title, int review){
        this.title = title;
        this.review = review;
    }



    public void setReview(int ocjena) { // posto je void ona ne vraca nikakvu vrijednost u main vec se samo izvrsava svoj blok koda
        if (ocjena >= 1 || ocjena <= 10) { // tj vrijednost onda mozemo dodavati u main funkciji kao npr setReview (9)
            review = ocjena;
        }
    }

    public int getReview() {
        return review;
    }

    public static void print() {
        System.out.println("Counter: " + counter);
    }

    @Override
    public String toString() {
        return title;
    }
}