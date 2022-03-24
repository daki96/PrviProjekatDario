package nine;

import seven.Gender;
import six.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

// Sta ako direktor kaze napravi mi izvjestaj svih uposlenika u preduzecu i onda mi znamo uradit upit na bazu
// Cilj nam je s jednom funkcijom postici rezultat svih funkcija, da ne bi morali stalno ici copy paste pa mjenjat logiku ko dole prikazano
public class Tester3 {
    public static void main(String[] args) {
        PersonReader2 personReader2 = new PersonReader2();
        List<Person12> person12List = personReader2.upitNaBazu();
        // To je ta funkcija uz pomocu koje cemo dolaziti do svakog od rezultata tj preko nje mozemo traziti bilo sta a da ne kreiramo ponovo for petju i sve kao dole
        printPeople(person12List,(person12)-> true); // Zadnje dodano- ovo je vrijednost koju ce primiti ova varijabla personTester
        //printPeople(person12List,(person12)-> person12.getGender().equals(Gender.MALE)); Evo primjera ako hocemo sve muskarce
        printPeople(person12List,(person12)-> person12.getAge()> 20); // evo i nacin da dobijemo osobe iznad 20 godina..
        // Evo i cak ako direktor trazi ispod 20 godina i takodjer muskarce samo da izlista
        printPeople(person12List,(person12)-> person12.getAge()< 20 && Gender.MALE.equals(person12.getGender()));
        // Evo izmedju 20 i 30 godina logika
        printPeople(person12List,(person12)-> person12.getAge() >= 20 && person12.getAge() <= 30);

        // PRINT ELEMENTS ZADNJE DODANO printElements funkcija s kojom bilo koji tip elemenata navodimo, ona moe preuzeti bilo koji tip
        printElements(person12List,(person12)-> person12.getAge()< 20 && Gender.MALE.equals(person12.getGender()));
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Prohujalo s vihorom"));
        movies.add(new Movie("Kum"));
        movies.add(new Movie("X-men"));
        printElements(movies, m->true); // Ovako kazemo isprintaj sve elemente

        //02.41.20 od ovog datog vremena smo ubacili ovu funkciju
        procesElements(person12List, p ->true, p-> System.out.println(p));
        procesElements(movies, m-> true, p-> System.out.println(p));







        printPersons(person12List);
        System.out.println("Older than");
        printPersonsOlderThan(person12List, 20); // stariji od ovog broja god
        printPersonsWithGender(person12List,Gender.MALE);
        printPersonsWithinAge(person12List,20,30);
        //Persontester4 persontester4 (Person12 p) ->p.getGender().equals(Gender.FEMALE);
    }

    // 02.39.06 od ove minute dodano interface koji mjenja Testable5 tj Predicate i Consumer koji mijenja ElementProcesor
    // nakon Consumer moramo postavit procesor.accept jer on sadrzi accept varijablu tj funkciju koja se poziva
    private static  <T> void procesElements (List<T> elements, Predicate<T> tester, Consumer<T> procesor){
        // Koristi elements moze u enhanced for loop jer je tipa List-Iterable i koristi objekat Iterator
        for(T element : elements){
            if(tester.test(element)){
                procesor.accept(element);
            }
        }
        // Spliterator - Stream funkcionalni nacin obrade elemenata ovo je lakse 02.50.20
        // procesiranje elemenata kaze Brian Goetz.
        // 1. svaka kolekcija je izvor nekog Stream-a
        // 2. medjuoperacije koje apliciras na svaki element unutar tog Stream objekta su takozvane Intermediate operations
        // 3. na kraju kad primjenis operacije dobijes opet stream pa onda terminiras operacije- Terminate operation Primjer
        elements.stream() // uci ce svi elementi
                .filter(tester) // samo elementi koji zadovolje test
                .forEach(procesor); // konzumirani.. terminirajuca operacija;

    }

    // Zadnje dodano Testable5 Pravimo funkciju s kojom cemo moci isprintati kolekciju osoba, kolekciju i listu Dog elemenata tj bilo koju listu
    private static <T> void printElements (List<T> elements, Testable5<T> tester){
       for (T element : elements){
           if(tester.test(element)){
               System.out.println(element);
           }
       }
    }

    private static void printPeople (List<Person12> person12List, Persontester4 persontester4){ // Zadnje dodano
        for(Person12 person12 : person12List){
            if(persontester4.test(person12)){ // .test od boolean iz interface
                System.out.println(person12);
            }
        }
    }

    private static void printPersons(List<Person12> person12List) { // Funkcija
        for (Person12 person12 : person12List) {
            System.out.println(person12);
        }
    }

    private static void printPersonsOlderThan(List<Person12> person12List, int age) { // Funkcija za starije od nekog upisanog broja
        for (Person12 person12 : person12List) {
            if (person12.getAge() >= age) {
                System.out.println(person12);
            }
        }
    }
    private static void printPersonsWithGender (List<Person12> person12List, Gender gender){ // Funkcija
        for(Person12 person12 : person12List){
            if(person12.getGender().equals(gender)){ // ako je neki person get gender jednak genderu kojeg je direktor rekao njega printaj u konzolu tj muske ili zenske
                System.out.println(person12);
            }
        }
    }
    private static void printPersonsWithinAge (List<Person12> person12List, int min, int max){ // Funkcija koja nam daje u program osobe izmedju datih godina
        for(Person12 person12 : person12List){
            int age = person12.getAge();
            if(age >= min && age<= max) {

                System.out.println(person12);
            }

    }
    }

}
