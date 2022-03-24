package seven.human;

import seven.Gender;
import seven.animal.Dog;

// Professor nasledjuje sve iz klase Employee samim tim ne samo sto nasledjuje salary vec i sve iz Person klase jer Employee
// klasa nasledjuje iz Person
// NASLEDJIVANJE NAS POSTEDI PONAVLJANJA tj da ne moramo copy paste

public class Professor extends Employee{

    private String academicTitle;


    public String getAcademicTitle() {
        return academicTitle;
    }

    public void setAcademicTitle(String academicTitle) {
        this.academicTitle = academicTitle;
    }


    @Override // Prepisivanje tj prenosimo metodu iz roditeljske klase koja je u ovom slucaju Employee
    public void setSalaryAmount(double salaryAmount) {
        super.setSalaryAmount(salaryAmount + 500);
        //this.salaryAmount = salaryAmount +500 ; ovo je tacno i drugi nacin zbog protected
    }
}
