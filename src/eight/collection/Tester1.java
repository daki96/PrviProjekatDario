package eight.collection;

import java.util.*;

// VAZNO -  Kada bi pokusali indeksiranim pristupom tipu Set ne bi radilo tj bila bi greska jer Set konstrukcija nema indeksiran pristup
// preko for petlje vrsimo indeksirani pristup
public class Tester1 {
    public static void main(String[] args) {

        // INDEKSIRAN PRISTUP
        List<String> names = new LinkedList<>();
        names.add("Omer");
        names.add("Omer");
        names.add("Omer");
        names.add("Neila");
        names.add("Ismar");
        names.add("Ismar");
        names.add("Ismar");
        for (int i = 0; i < names.size(); i++) {
            String element = names.get(i);
            System.out.println(element);

        }

        // TreeSet
        Set<String> names1 = new TreeSet<>();
        names1.add("Omer");
        names1.add("Omer");
        names1.add("Omer");
        names1.add("Neila");
        names1.add("Ismar");
        names1.add("Ismar");
        names1.add("Ismar");
        //names1.forEach(name -> System.out.println(name)); // Ovo je moderniji pristup kako svemu da pristupimo iz Jave 8
        for(String name: names1) {
            System.out.println(name);
        }
    }
}
