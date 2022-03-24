package six.abstraction;

public class BeverageConsumer {
    private Beverage beverage;

    public  BeverageConsumer(Beverage beverage){
        this.beverage = beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    public void consume(){
        System.out.println("Konzumiram: " + beverage.getName() + " i to me kosta " + beverage.cost() + " KM");
    }


    //    private Coffee coffee;  ovako je bilo prije i onda smo samo mogli dobiti preko Beverage.consume kafu
    // a nismo mogli dobiti ni tea ni Coca Cola.. zbog toga umjesto kreiranog atributa Coffee coffee kreiramo Beverage
    // koji je zajednicki za sve njih samo pogledaj razliku gore i dole
//
//    public  BeverageConsumer(Coffee coffee){
//        this.coffee = coffee;
//    }
//    public void consume(){
//        System.out.println("Konzumiram: " + coffee.getName() + " i to me kosta " + coffee.cost() + " KM");
    }

