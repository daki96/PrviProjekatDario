package six.abstraction;

public class Main {
    public static void main(String[] args) {
        // coffee kojeg je tipa ova varijabla ? pa slozenog tipa Coffee i tipa Beverage (Coffee coffee) ili (Beverage coffee)
        // VAZNO!! Polimorfizam je mogucnost da se moze naslijediti tip podatka kao sto je ovdje primjer Beverage
        // POLIMORFISTICKA VARIJABLA
        Coffee coffee = new Coffee(); // Takodjerr je tacno kada stavimo Beverage coffee = new Coffee(); POLIMORFIZAM
        consumeCoffee(coffee); // 2. SA DRUGIM NACINOM TJ STATICKOM METODOM DOLE POZVANO
        consumerBeverage(coffee); // 3. SA TRECIM NACINOM TJ METODOM POZVANO DOLE
        Tea tea = new Tea(); // Takodjerr je tacno kada stavimo Beverage tea = new Tea(); POLIMORFIZAM
        consumeTea(tea); // 2. SA DRUGIM NACINOM POZVANO
        consumerBeverage(tea); // 3. SA TRECIM NACINOM POZVANO
        CocaCola cocaCola = new CocaCola(); // Takodjerr je tacno kada stavimo Beverage cocaCola = new CocaCola(); POLIMORFIZAM
        // VAZNO Tip podatka moze bit Beverage ali ne moze bit vrijednost tj ne moze bit Beverage coffee = new Beverage();
        consumeCocaCola(cocaCola); // 2. SA DRUGIM NACINOM POZVANO TJ METODOM (private static void consumeCocaCola)
        consumerBeverage(cocaCola); // 3. SA TRECIM NACINOM POZVANO



//        1. NACIN  BeverageConsumer beverageConsumer = new BeverageConsumer(coffee);
//        beverageConsumer.consume();
//        beverageConsumer.setBeverage(tea);
//        beverageConsumer.consume();
//        beverageConsumer.setBeverage(cocaCola);
//        beverageConsumer.consume();


        //        BeverageConsumer teaConsumer = new BeverageConsumer(tea);
//        teaConsumer.consume(); ovo je vezano za dugacak tekst u BeverageConsumer klasi koji se nalazi ispod svega


        // DRUGI NAČIN !!!!
        // DRUGI PRIMJER KAKO OVO GORE MOZE BIT URADJENO TJ PREKO STATICKIH METODA
        // TJ PROGRAMIRANJE BEZ NASLEDJIVANJA, POLIFORMIZMA I APSTRAKCIJE


        }
        private static void consumeCoffee (Coffee coffee){
            System.out.println("Pijem " + coffee.getName() + " i kosta me to " + coffee.cost() + " KM");
    }
    private static void consumeCocaCola (CocaCola cocaCola){
        System.out.println("Pijem " + cocaCola.getName() + " i kosta me to " + cocaCola.cost() + " KM");
    }
    private static void consumeTea (Tea tea){
        System.out.println("Pijem " + tea.getName() + " i kosta me to " + tea.cost() + " KM");


    }
    // TRECI NACIN !!!!! NAJBOLJI NACIN S KOJIM JEDNOM FUNKCIJOM POZIVAMO SVE OBJEKTE TJ VARIJABLE NJIHOVE
    private static void consumerBeverage (Beverage beverage){
        System.out.println("Pijem " + beverage.getName() + " i kosta me to " + beverage.cost() + " KM");
    }
}
