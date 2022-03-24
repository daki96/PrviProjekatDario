package seven;

import seven.animal.Animal;
import seven.animal.Cat;
import seven.animal.Dog;
import seven.animal.Fish;

// INSTANCEOF operator poredjenja - true ili false on testira da li je objekat neki datog tipa kao npr da li animal ima veze sa Dog
// Rezultat instanceof je provjera tipa varijable !!!!! veze se za nasledjivanje a posledica nasledjivanja je polimorfizam
import java.lang.reflect.Field;

public class AnimalTester {
    public static void main(String[] args) {
        // Sad cemo vidjet kako imamo polimorfisticku varijablu
        int number = 23;  // TIP podatka INTEGER
        String name = "Dario"; // Tip podatka String
        // animal - Tip podatka Object,Animal,Dog, Cat... ona moze mjenjati oblike u zavisnosti od klase koja nju nasledjuje
        Animal animal = new Dog();
        test(animal); // Ispis Pas zbog dole funkcije static void test
        animal = new Cat();
        AnimalTester.test(animal); // ispis je Macka posto je iznad kreirana instanca new Cat


    }
    static void test (Animal animal){
        if(animal instanceof Dog){
            System.out.println("Pas");
        }else if (animal instanceof Cat){
            System.out.println("Macka");
        }else if (animal instanceof Fish){
            System.out.println("Riba");
        }else {
            System.out.println("Neka zivotinja");
        }
    }
}
