package nine;

import seven.Gender;

import java.time.LocalDate;

public class Tester1 {
    public static void main(String[] args) {
        // Moramo prvo kreirati datum rodjenja
        LocalDate p1Birthday = LocalDate.of(1996,5,6);   //.of je staticka funkcija s parametrima koja nam pomaze da odredimo datum rodjenja
        Person12 p1 = new Person12(123,"Dario","Pavlicevic", Gender.MALE,p1Birthday); // Ovdje smo ubacili varijablu koju smo kreirali uz pomoc LocalDate tj p1Birthday
        int age = p1.getAge();
        System.out.println("Godina: " + age);
    }
}
