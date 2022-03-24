package eight.collection;

import java.time.LocalDate;

public class BirthdayFazon {
    private LocalDate birthday; // Mozemo ovako izracunat koliko je proslo godina

    public BirthdayFazon (LocalDate birthday){
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        LocalDate now = LocalDate.now();
       birthday.until(now).getYears();
        return birthday;
    }
}
