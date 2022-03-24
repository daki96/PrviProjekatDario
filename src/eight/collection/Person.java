package eight.collection;

import seven.Gender;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String name;
    private String surname;
    private Gender gender;
    private int age;

    public Person(String name, String surname, Gender gender, int age) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
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

    @Override
    public boolean equals(Object obj) {
        if (! (obj instanceof Person)) {
            return false;
        }
        Person comparedPerson = (Person) obj;
        return name.equals(comparedPerson.getName())
                && surname.equals(comparedPerson.getSurname())
                && age == comparedPerson.getAge()
                && gender.equals(comparedPerson.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Person o) { // Uz pomoc ove komande koja nam je za Treeset ona ne samo da poredi dva objekta vec i izbacuje
        // duplikate tj ako imamo dvojicu istih godina onda jedan ce biti ispisan u prog. a drugi ne. Npr Alma i Mirnes
        if(age == o.getAge()){
            return -1;
        }
        if ((age > o.getAge())){
            return 1;
        }
        return 0;
    }
}
