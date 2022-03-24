package eight.collection;

import eight.Person;

import java.util.*;

/**
 * Karakteristike listi : 1. Pamti redoslijed elemenata
 * 2. Moze indeksiran pristup
 * 3. Prima duplikate
 *
 * Karakteristike seta : 1. Ne pamti redoslijed elemenata
 * 2. Ne moze indeksiran pristup
 * 3. Ne prima duplikate
 */

public class Tester {
    public static void main(String[] args) {
        // List<String> names = new LinkedList<>(); na izvrsavanju su iste i Linkedlist i Arraylist
        List<String> names = new ArrayList<>(); // Prednost zasto stoji List na pocetku je zbog poliformizma, posle bi mogli
        // promjeniti ovu listu u Linkedlist<> kao dole sto cete vidjeti jer da stoji Arraylist<String> names = new Arraylist<> ne bi moglo a mi npr promjenili varijablu u LinkedList<>
        //names = new LinkedList<>();
         // Veoma je vazno da znamo tip podatka
        // names je ovdje tipa podatka List a ne String vec je List parametrizovan sa String
        names.add("Omer");
        names.add("Omer");
        names.add("Omer");
        names.add("Neila");
        names.add("Ismar");
        names.add("Ismar");
        names.add("Ismar");
        for (String element : names){
            System.out.println(element);
        }

        Person person = new Person(); // Kada hocemo pozvati neku funkciju moramo se zapitati kojeg je tipa podatka ta funkcija
        //Integer.parseInt(person); // parseInt je String funkcija i samo String prima zbog toga je person netacno

        // HASHSET
        Collection<String> names1 = new HashSet<>(); // Evo isto sve kao i gore samo ovdje sa Hashset
        // izvrsavanje nam izbacuje Neila, Ismar, Omer - tj nema duplikata, nema redoslijed
        names.add("Omer");
        names.add("Omer");
        names.add("Omer");
        names.add("Neila");
        names.add("Ismar");
        names.add("Ismar");
        names.add("Ismar");
        for (String element1 : names1){
            System.out.println(element1);
        }

        // LinkedHashSet

        Collection<String> names2 = new LinkedHashSet<>(); // Evo isto sve kao i gore samo ovdje sa LinkedHashset
        // izvrsavanje nam izbacuje Omer, Neila, Ismar - tj nema duplikata, ima redoslijed tj Omer,Neila,Ismar
        names.add("Omer");
        names.add("Omer");
        names.add("Omer");
        names.add("Neila");
        names.add("Ismar");
        names.add("Ismar");
        names.add("Ismar");
        for (String element2 : names2){
            System.out.println(element2);
        }

        // TREESET
        Collection<String> names3 = new TreeSet<>(); // Evo isto sve kao i gore samo ovdje sa Treeset
        // izvrsavanje nam izbacuje Neila, Ismar, Omer - tj nema duplikata, abecedni redoslijed tj Ismar, Neila, Omer
        names.add("Omer");
        names.add("Omer");
        names.add("Omer");
        names.add("Neila");
        names.add("Ismar");
        names.add("Ismar");
        names.add("Ismar");
        for (String element3 : names3){
            System.out.println(element3);
        }
    }
}
