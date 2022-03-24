package seven;

import seven.human.Person;

public class Main {
    public static void main(String[] args) {
        // KLASA --> bezbroj objekata
        Person person = new Person();
        person.hashCode(); // funkcija hashcode se nalazi u paketu java.lang tj u klasi Object.java, i nestaticka je tako da treba nam objekat


        // ENUM --> nemoguce je pravit Enum objekte unutar klase a ne ENUMA
        // Gender gender = new Gender(); OVO JE NETACNO NE PISE SE OVO U KLASI IDI NA ENUM
        // VAZNO ! OVAKO PRISTUPAMO ENUM OBJEKTIMA

        Gender gender1 = Gender.MALE;
        Gender gender2 = Gender.MALE;
        System.out.println(gender1.hashCode()); // hashcode koristimo kada hocemo da se uvjerimo da su ovo dva ista objekta ili ne
        System.out.println(gender2.hashCode()); // tj hashcode nam govori memorijsku vrijednost objekta ili memorijska lokacija


    }
}
