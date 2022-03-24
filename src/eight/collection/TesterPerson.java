package eight.collection;

import seven.Gender;

import java.util.*;
// Efective Java kaze always start a program with override method hashset , equals  and .toString

public class TesterPerson {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Person p1 = new Person("Dario","Pavlicevic", Gender.MALE,26);
        persons.add(p1); // Posto nam treba varijabla tipa persons moramo i kreirat je tako sto ubacimo instancu Person p1 = new Person
        Person p2 = new Person("Adnan","Osmanlic", Gender.MALE,25);
        persons.add(p2);
        Person p3 = new Person("Marina","Tasovac", Gender.FEMALE,22);
        persons.add(p3);
        Person p4 = new Person("Alma","Jahic", Gender.FEMALE,26);
        persons.add(p4);
        Person p5 = new Person("Mirnes","Mujic", Gender.MALE,24);
        persons.add(p5);
        Person p6 = new Person("Tarik","Kikanovic", Gender.MALE,35);
        persons.add(p6);
        Person p7 = new Person("Toni","Pavlicevic", Gender.MALE,22);
        persons.add(p7);

        for(Person person : persons){ // Tip podatka stavljamo Person jer je to tip podatka koji smo mi stvorili
            System.out.println(person.toString()); // da ne bi dobili na kraju samo neke kodove u ispisu vec tekst kako zelimo
            // moramo prvo override u klasu Person - pogledaj u klasu Person
        }

        Set<Person> persons1 = new HashSet<>();
        Person o1 = new Person("Dario","Pavlicevic", Gender.MALE,26);// 123
        persons1.add(o1); // ovo su dvije iste hashcode memorijske lokacije  npr 123
        persons1.add(o1);// 123
        Person o8 = new Person("Dario","Pavlicevic", Gender.MALE,26); //345 ;  Ovo je duplikat ali sa razlicitim hashcode tj memorijskom lokacijom i zbog ovoga program ce se ispisati
        Person o2 = new Person("Adnan","Osmanlic", Gender.MALE,25);
        persons1.add(o2);
        Person o3 = new Person("Marina","Tasovac", Gender.FEMALE,22);
        persons1.add(o3);
        Person o4 = new Person("Alma","Jahic", Gender.FEMALE,26);
        persons1.add(o4);
        Person o5 = new Person("Mirnes","Mujic", Gender.MALE,24);
        persons1.add(o5);
        Person o6 = new Person("Tarik","Kikanovic", Gender.MALE,35);
        persons1.add(o6);
        Person o7 = new Person("Toni","Pavlicevic", Gender.MALE,22);
        persons1.add(o7);

        for(Person person1 : persons1){
            System.out.println(person1.toString());
        }

        // TREESET !!!!

        Set<Person> persons2 = new TreeSet<>();
        Person d1 = new Person("Dario","Pavlicevic", Gender.MALE,26);// 123
        persons2.add(d1); // ovo su dvije iste hashcode memorijske lokacije  npr 123
        persons2.add(d1);// 123
        Person d8 = new Person("Dario","Pavlicevic", Gender.MALE,26); //345 ;  Ovo je duplikat ali sa razlicitim hashcode tj memorijskom lokacijom i zbog ovoga program ce se ispisati
        Person d2 = new Person("Adnan","Osmanlic", Gender.MALE,25);
        persons2.add(d2);
        Person d3 = new Person("Marina","Tasovac", Gender.FEMALE,22);
        persons2.add(d3);
        Person d4 = new Person("Alma","Jahic", Gender.FEMALE,24);
        persons2.add(d4);
        Person d5 = new Person("Mirnes","Mujic", Gender.MALE,24);
        persons2.add(d5);
        Person d6 = new Person("Tarik","Kikanovic", Gender.MALE,35);
        persons2.add(d6);
        Person d7 = new Person("Toni","Pavlicevic", Gender.MALE,22);
        persons2.add(d7);

        for(Person person2 : persons2){
            System.out.println(person2.toString());
        }

    }
}
