package six.abstraction;

public class Coffee extends Beverage{


    public Coffee() {
        super("Kafa");
    }

    @Override
    public void drink() {
        System.out.println("Kafu pijemo s cejfom ");
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
