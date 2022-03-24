package seven.human;

import seven.Gender;
import seven.animal.*;

public class Person {
    private int idNum;
    private String name;  // moguce je cak staviti dvije varijable koje su istog tipa podatka u sam tip podatka npr private String name,surname;
    private String surname;
    private Gender gender; // E sad mi dizajniramo nas Gender, tako sto ce postati jedno polje klase Person
    private int age;
    private Animal animal; // OVAKO KAZEMO PERSON HAS ANIMAL

    // VAZNO !!! Da ne bi morali pisati ovako ispod dodavati stalno novi cat ili fish te njihove get i set itd samo umjesto toga ubacimo
    // Animal abstraktnu klasu koja ce znaciti i raditi sve za njih
    // DEPEND UPON ABSTRACTION NOT UPON CONCRETE IMPLEMENTATION , tj zavisi od abstraktne klase i metoda a ne od konkretnih
    // polja ili klase tj CONCRETE IMPLEMENTATION JE ( private Cat cat; ) a apstraction je (private Animal animal;)
    //    private Dog dog; // NASLEDJIVANJEM SAD BILO KOJA KLASA KOJA IMA EXTENDS PERSON MOZE KORISTITI OVO DOG POLJE
//    private Cat cat;
//    private Fish fish;
//    private Hamster hamster;


    // GENDER - postoji mehanizam kako da kreiramo tip podatka i ograniciti broj objekata koji ce nastati ili se mogu kreirati
    // po šablonu tog tipa podatka  ENUMENIRANI TIPOVI

    public Person (){
        super(); // super poziva pretka tj Object.java tj s ovim pozivamo prvo podrazumjevani konstruktor
        System.out.println("Person...");
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal getAnimal() { // BENEFIT POLIFORMIZMA
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
