package eight;

import seven.animal.Flyable;
import seven.human.Person;
// LAMBDA OPERATOR SE SAMO VEZE ZA FUNKCIONALNI INTERFACE I NIZASTA DRUGO
public class EightExecutor {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Dario");
        // LAMBDA OPERATOR   (  ->  )  ovako izgleda lambda operator
        // Anonimni Inner Type 1.7 JAVA tj stari nacin

        // KADA KORISTIMO OPERATOR NEW NISTA NE SMIJE OSTATI NEDORECENO
        // PA TAKO METODA FLY NE SMIJE OSTATI BEZ SVOG BLOKA KODA
        Flyable flyable = new Flyable() { // NEKAD SE OVAKO RADILO
            @Override
            public void fly() {
                System.out.println("I am flying...");
            }
        } ;
        flyable.fly();

        // JAVA 1.8  ->    VAZNOOOOOO - ispod nema parametara u zagradi jer sama void fly; metoda nema parametara
        Flyable flyable1 = () -> { // Lambda operator se koristi kod funkcionalne apstraktne metode i ona definira blok koda
            // da ne bi morali radit ko gore 1.7 ovako je dosta jednostavnije
            System.out.println("I am flying in Java 8 style");
        };
        flyable1.fly();
        //Person person1 = () -> ; OVO JE VAZNO JER JE NETACNO LAMBDA OPERATOR SE NE VEZE ZA KLASE VEC SAMO ZA FUNKCIONALNI INTERFEJS
        }

    }
