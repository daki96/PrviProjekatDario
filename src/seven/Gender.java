package seven;

/**
 * 1. polja
 * 2. konstruktor   --> MORA BITI PRIVATE -  Ne moze biti public kod ENUMA dok kod CLASS moze
 * Najvazniji izuzetak ENUMA je konstruktor koji mora biti privatne vidljivosti
 * 3. funkcije ili metode
 *
 * KOD ENUMA OBJEKTE KREIRAMO UNUTAR TE ISTE ENUM KLASE TJ NE TREBA NAM POSEBNA MAIN FUNKCIJA
 * Sve ispod objekata su njegova polja i metode
 *
 * IMENOVANJE VARIJABLE U ENUMU -- KONVENCIJA NALAZE DA BUDU SVE VELIKA SLOVA !!!!!!
 */
public enum Gender {
    FEMALE ("Zenski", "Njezniji rod"),  // OVAKO IZGLEDAJU OBJEKTI ENUMA
    MALE ("Muski", "Grublji rod"),
    UNKNOWN ("Nepoznato", "Nepoznat opis")



    ;
    private  String name;
    private String description;

    private Gender (String n, String d){ // ovaj konstruktor je koristan samo unutar samog ENUMA u kome se nalazi
    this.name = n;
    this.description = d;

    }

    public String getName() {  // MOZEMO IMATI I FUNKCIJE U ENUMU
        return name;
    }

    public String getDescription() {
        return description;
    }
}
