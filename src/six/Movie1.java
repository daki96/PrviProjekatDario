package six;
// PRAKSA U JAVI JE INACE DA ATRIBUTI ILI SVOJSTVA TJ POLJA BUDU POD MODIFIKATOROM VIDLJIVOSTI PRIVATE
// A do njih se doseze preko get i set funkcija, get i set funkcije lakse mozemo izvuc preko Generate opcije s desnim klikom
// inace ubacivanje vrijednosti treba da ide preko "set" a dohvacanje preko "get"


// kada je u pitanju this funkcija
// this.review je polje klase tj njega boldira razvojno okruzenje kada oznacimo ga
// dok rezultat taj tj = review je parametar funkcije ; sve zajedno daju this.review = review;

//

import static six.Movie.counter;

public class Movie1 {

    private String title;
    private String director;
    private int review;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        if (review >= 1 && review <= 10){
        this.review = review;
    }

}


    }
