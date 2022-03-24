package nine;

import eight.collection.Person;
import seven.Gender;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonReader2 {
    public List<Person12> upitNaBazu (){
        List<Person12> person12List = new ArrayList<>();
        person12List.add(new Person12(123,"Dario","Pavlicevic", Gender.MALE,LocalDate.of(1996,5,6)));
        person12List.add(new Person12(456,"Jasna","Grabovica", Gender.FEMALE,LocalDate.of(2009,1,1)));
        person12List.add(new Person12(789,"Vedad","Muratovic", Gender.MALE,LocalDate.of(1999,4,9)));
        person12List.add(new Person12(111,"Tarik","Dedic", Gender.MALE,LocalDate.of(1997,3,8)));
        person12List.add(new Person12(222,"Ajla","Reiz", Gender.FEMALE,LocalDate.of(1995,2,12)));
        person12List.add(new Person12(123,"Dario","Pavlicevic", Gender.MALE,LocalDate.of(1996,5,6)));
        person12List.add(new Person12(123,"Dario","Pavlicevic", Gender.MALE,LocalDate.of(1996,5,6)));
        person12List.add(new Person12(123,"Dario","Pavlicevic", Gender.MALE,LocalDate.of(1996,5,6)));
        person12List.add(new Person12(123,"Dario","Pavlicevic", Gender.MALE,LocalDate.of(1996,5,6)));
        person12List.add(new Person12(123,"Dario","Pavlicevic", Gender.MALE,LocalDate.of(1996,5,6)));
        person12List.add(new Person12(123,"Dario","Pavlicevic", Gender.MALE,LocalDate.of(1996,5,6)));
        person12List.add(new Person12(123,"Dario","Pavlicevic", Gender.MALE,LocalDate.of(1996,5,6)));
        person12List.add(new Person12(123,"Dario","Pavlicevic", Gender.MALE,LocalDate.of(1996,5,6)));
        person12List.add(new Person12(123,"Dario","Pavlicevic", Gender.MALE,LocalDate.of(1996,5,6)));


        return person12List;
    }
}
