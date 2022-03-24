package seven;

import seven.animal.*;
import seven.human.Employee;
import seven.human.Professor;

public class Main1 {  // OVDJE JE NASTAVAK NAKON STO JE PUSKA SVE OBRISAO IZ MAIN KLASE
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setSalaryAmount(1500);
        System.out.println(employee.getSalaryAmount()); // bit ce ispis 1500
        employee = new Professor(); // Polimorfizmom je ovo moguce
        employee.setSalaryAmount(1400);
        System.out.println("Profesorska : " + employee.getSalaryAmount());


        Professor professor = new Professor();
        Dog dog = new Dog();
        professor.setAnimal(dog);
        Cat cat = new Cat();
        professor.setAnimal(cat);
        Fish fish = new Fish();
        fish.setFishType("Šaran");
        professor.setAnimal(fish);
        Fish fish1 = new Fish();
        fish1.setFishType("Pastrmka");
        fish1.setName("Pastrmka");
        professor.setAnimal(fish1);
        System.out.println(professor.getAnimal().getName());
        Hamster hamster = new Hamster();
        professor.setAnimal(hamster);
        Duck duck = new Duck();
        professor.setAnimal(duck);

    }
}
