package eight;

import java.util.ArrayList;
// DINAMICKI NIZ DOLE
public class Main {
    public static void main(String[] args) {
        //Polja niza su jedinstveno indeksirana, dok polja klase su jedinstveno imenovana tj ne mozemo imat dva puta names[0], names[0]
        // Niti mozemo imat dva polja private String name; private String name;
        // OGRANICENJE KOD String NIZA : svi moraju biti String
        // Ogranicenje 2 : Fiksna duzina niza... se prevazilazi uz pomoc dinamickih nizova
        String [] names = new String[3];
        names[0] = "Nedim";
        names[1] = "Jasna";
        names[2] = "Neila";

        Person person = new Person();
        person.setName("Kerima");
        person.setSurname("Grabovic");
        person.setAge(13);

        // names, person -> sirovi slozeni tipovi podataka

        Box<Person> box = new Box<Person>();
        box.setField(person); // Tipa varijable person

        Box<String>box1 = new Box<>();
        box1.setField("Tekst"); // Tipa String

        // SIROVI RAW TYPE - Ovo ne treba radit - ostavljena je mogucnost da se ovako pravi zbog backward compability
        Box box2 = new Box();
        box2.setField(new Object()); // Ovo je sada tipa Object

        Box<Integer> box3 = new Box<>();
        box3.setField(22);

        // DINAMICKI NIZ - Parametrizirani slozeni tip
        ArrayList<Person> persons = new ArrayList<>();


    }
}
