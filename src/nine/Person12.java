package nine;

import seven.Gender;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

// Person person = new Person();
public class Person12 implements Comparable<Person12> {
    private int id;
    private String name;
    private String surname;
    private Gender gender;
    // Localdate kao tip cuva - year,month,day
    private LocalDate birthday;


    public Person12() {
        super(); // Object.java prvo ce se uvijek izvrsavati super jer je roditeljska klasa tj u ovom slucaju od Object klase koja je Djed klasa iz java.lang
        System.out.println("evo sad dolazim ja.."); // Ovo je klasa Person a ovo gore Object mislim ovo je nepotrebno al eto da se razumije

    }

    public Person12(int id, String name, String surname, Gender gender, LocalDate birthday) { // Konstruktor sa svim parametrima
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        LocalDate now = LocalDate.now();
        Period period = birthday.until(now);
        int age = period.getYears(); // Ovdje smo inicijalizovali varijablu int age sa varijablom period.getYears; a takodjer ima i getDays itd.
        return age;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person12)){ // Ako nisi primjerak Person12 return false;
            return false;
    }              // ako jesi onda cu tebe konvertovat
        Person12 comparedPerson = (Person12) o;
    return id == comparedPerson.getId() && name.equals(comparedPerson.getName())
            && surname.equals(comparedPerson.getSurname())
            && gender.equals(comparedPerson.getGender())
            && birthday.equals(comparedPerson.getBirthday());
}

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, gender, birthday);
    }

    @Override
    public String toString() {
        return "Person12{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                '}';

        // Java u pozadini za spajanje ovih vrijednosti Stringova obavlja ovako
//        StringBuilder sb = new StringBuilder();
//        sb.append(name);
//        sb.append(" ");
        //sb.append (surname);
      //  return sb.toString();
    }

    // p1.compareTo(p2)
    @Override
    public int compareTo(Person12 comparedPerson) {
        // -1 p1 manji od p2
        // 0 p1 jednak p2
        // 1 p1 veci od p2
        int result = name.compareTo(comparedPerson.getName());
        if (result == 0){
            result = surname.compareTo(comparedPerson.getSurname());
        }
        if (result == 0){
            result = birthday.compareTo(comparedPerson.getBirthday());
        }

        return result;
    }
}
