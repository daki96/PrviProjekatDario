package nine;

import eight.collection.Person;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tester2 {
    public static void main(String[] args) {
        PersonReader2 personReader2 = new PersonReader2();
//        List<Person12> person12List = personReader2.upitNaBazu(); // Lista a sad pogledaj dole Hashset
//        for (Person12 person12 : person12List){
//            System.out.println(person12);
//        }
//        for (int i = 0; i < person12List.size(); i++) {
//            Person12 person12 = person12List.get(i);
//            System.out.println(person12);
//
//        }
        // U HashSet konstruktor sad ubacujemo ovu (personReader2.upitNaBazu()) da bi pretvorili ovu listu u set
        // tj ovako u Javi mozemo listu pretvorit u Set kao i Set u List samo ubacivanjem u konstruktor
        // ovo dole pripada tipu Set, Collection, Iterable, Hashset
        Set<Person12> personCollection = new HashSet<>(personReader2.upitNaBazu()) ;
        for (Person12 person12 : personCollection){
            System.out.println(person12);

            //            Person12 person12 = personCollection.get(i);ovo ne valja jer Set ne prima indekse tj get(i) nije uredu
//            System.out.println(personCollection); vec nam treba Enhanced for loop
        }

    }
}
