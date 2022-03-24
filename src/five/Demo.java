package five;

public class Demo {
    public static void main(String[] args) {
        // nedostaci nizova
        // 1. fiksna duzina niz  npr int [] numbers = new int [3] (3 znaci da je fiksni)
        // 2. Svi unutar niza su istog tipa (samo integer, samo double...)

        Person person = new Person(); // Ovako se pravi objekat od Person
        person.name = "Dario";
        person.surname = "Pavlicevic";
        person.age = 25;

        Person person2 = new Person();
        person2.name = "Toni";
        person2.surname = "Pavlicevic";
        person2.age = 20;

        String ime1 = "Dario"; // - Preferiran nacin konzumiranja Stringova je ovaj a ne onaj dole sa new String jer
        String ime2 = "Dario"; // zauzima manje memorije tj ne pravi novu memorijsku lokaciju, pohlepan smo programer
        String ime3 = new String("Dario"); // ako stalno dodajemo "new"
        System.out.println(ime1 == ime2); // TRUE- ovaj operator " == " kod prostih tipova poredi vrijednosti
        System.out.println(ime1 == ime3); // FALSE- ovdje je false toga sto kod objektnih tipova operator " == " poredi
                                          // memorijske adrese.







    }
}
