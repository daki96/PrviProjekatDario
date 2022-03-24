package six;

public class Main {
    public static void main(String[] args) {
        // Prvi slozeni tip koji smo radili je niz
        // NIZ
        // Ovaj slozeni tip ima svoja polja   imena -> 0,1,2
        String[] imena = new String[3];
        imena[0] = "Sead";
        imena[1] = "Muamer";
        imena[2] = "Dario";

        //person ima svoja polja --> name,surname,age
        Person person = new Person();
        person.name = "Ajla";
        person.surname = "Reiz";
        person.age = 22;



    }
}