package six.abstraction;

// Apstraktna klasa moze imati sve stvari ko i normalna klasa ali i pored toga moze imati APSTRAKTNU funkciju ili METODU!!!

public abstract class Beverage {
    private String name;

    public Beverage (String name){ // ovaj konstruktor ce nametnuti standard svim pićima, tj kada npr
                                   //dodjete u kafic i trazite nesto da popijete morate navesti ime onoga sta cete pit
                                   // tu ovaj konstruktor vam namece da to morate ucinit
        this.name = name;
    }
    public String getName(){
        return name;
    }
    // Sustina funkcije ili metode jeste da bude pozvana da bi izvrsila svoj blok koda koji sadrzi
    // Jednu METODU ili FUNKCIJU opisuje
    // 1. Parametri koje dobija ta funkcija
    // 2. Blok koda koji se pozove
    // 3. Rezultat koji se ocekuje od te Metode
    // VAZNO Jedna od ove 3 stvari fali APSTRAKTNOJ funkciji, tj fali joj BLOK KODA
    // Ima parametre , ima rezultat al nema blok koda
    public  abstract void drink ();  // kao rezultat ne zelimo nista vec samo da popije pice
    public abstract double cost();  // dok ovdje rezultat zbog double ocekujemo neki rezultat kao npr 2.4


}
