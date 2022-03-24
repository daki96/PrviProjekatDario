package seven.human;

import seven.Gender;
 // Da ne bi morali pisat opet sva ista polja kao npr private String name itd. onda mi napravimo nasledjivanje
// iz klase Person jer ona je generalna klasa koja posjeduje sva neophodna polja za ostale klase a takodjer
// mozemo dodati i jos dodatnih polja

public class Employee extends Person {
    protected double salaryAmount;

    public Employee (){
        super(); // Ovo smo super stavili samo da naznacimo da se prvo pozove konstruktor roditeljske klase pa onda ovaj ispod
        System.out.println("Employee...");
    }

    public double getSalaryAmount() {

        return salaryAmount;
    }

    public void setSalaryAmount(double salaryAmount) {

        this.salaryAmount = salaryAmount;
    }
}
