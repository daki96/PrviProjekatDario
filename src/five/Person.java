package five;  // package five je deklaracija klase

/**
 * Modifikatori vidljivosti:
 * 1. public
 * 2. private
 * 3. protected
 * 4. bez kljucne rijeci - paketna vidljivost (tj mozemo izbrisat public da ostane samo class)
 *
 *  Klasa outer(vanjska)tj nasa klasa (public class Person) --> moze imati samo public i paketnu vidljivost
 *  Pristup ovoj klasi ce imati samo klase unutar istog paketa tj package "five"
 *  Klasa moze imati
 *  1. Atribute ili polja ili properties
 *  2. Konstruktor
 *  3. Funkcije ili metode
 *  Klasa je šablon po cijem šablonu se kreiraju varijable,
 */
public class Person { // ova klasa ne moze imati ni private ni protected modifikator vidljivosti tj samo public ili bez kljucne rijeci

    public String name; // atribut ili svojstvo (String), moze primiti sve 4 modifikatora vidljivosti tj moze bit i
    public String surname; // moze bit i "private String name;" ili "protected String name;" ili bez icega ili public
    public int age;

    public Person() {  // Ovo je konstruktor
        System.out.println("Konstruisana instanca...");
    }

}

