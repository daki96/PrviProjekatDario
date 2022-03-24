package six.abstraction;

public class CocaCola extends Beverage{
    public CocaCola() {
        super("Coca Cola");
    }

    @Override
    public void drink() {
        System.out.println("Konzumira se da bi jetru sjebali..");

    }

    @Override
    public double cost() {
        return 3.0;
    }
}
