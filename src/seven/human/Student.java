package seven.human;

import seven.Gender;
import seven.animal.Dog;

public class Student extends Person{
    private int indexNumber;

    public  Student (){
        super(); // Ovaj student poziva konstruktor klase Person, Object.java je nulti nivo nasledjivanja
        System.out.println("Student....");
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }
}
