package eight.collection;

import eight.Person;

import java.util.ArrayList;

public class CollectionExecutor {
    public static void main(String[] args) {
        // Svi unutar niza personArray su tipa Person
        String[] personsArray = new String[3];
        personsArray[0] = "Omer";
        personsArray[1] = "Ismar";
        personsArray[2] = "Berin";  // Ogranicenje ne da nijednu drugu vrijednost dodati osim ove tri
        //Enhanced for - Java kaze ne moramo mi voditi racuna o indeksima samo deklariraj varijablu tj String name u ovom slucaju
        // i kroz koji niz iteriramo tj personsArray
        for (String name : personsArray) {
            System.out.println(name);
        }
        System.out.println("........RAZLIKUJE OVA DVA NIZA");
        // Svi unutar objekta personArrayList su tipa Person
        // KOLEKCIJE
        ArrayList<String> personArrayList = new ArrayList<>();
        // UBACIVANJE ELEMENATA UNUTAR DINAMICKOG NIZA
        // Kolekcije mogu primiti koliko god hocemo elemenata tj samo se produzi niz
        personArrayList.add("Omer"); // add je nestaticka funkcija jer morali smo napravit gore instancu new ArrayList
        personArrayList.add("Ismar");
        personArrayList.add("Berin");
        personArrayList.add("Kerim");
        personArrayList.add("Neila");
        // Kako iterirati tj petlja
        for (int i = 0; i < personArrayList.size(); i++) { // Ovdje ne stavljamo .lenght kod dinamickog niza vec .size
            String name = personArrayList.get(i); // U dinamickom nizu uz pomoc funkcije get dolazimo do elementa "i"
            System.out.println(name);
        }
        System.out.println("............");
        // SVE ISTO SAMO STO JE OVO DOLE ENHANCED
        for (String name : personArrayList){
            System.out.println(name);
        }

        NaturalNumber naturalNumber = new NaturalNumber();
        for(Integer number : naturalNumber){
            System.out.println(number);
        }


    }
}
