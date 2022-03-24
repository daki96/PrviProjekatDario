package six.abstraction;

public class Tea extends Beverage{

    public Tea() {             // Inace je bilo Tea(String name) pa dole samo name medjutim moze i ovaj nacin
        super("Caj");
    }

    @Override
    public void drink() {
        System.out.println("Caj se pije vruc");

    }

    @Override
    public double cost() {
        return 2.0;
    }
}
