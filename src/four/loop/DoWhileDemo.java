package four.loop;

public class DoWhileDemo {
    public static void main(String[] args) {
    int number = 3;
    do { //razlika izmedju while i do while petlje je u tome sto kada npr br 11 stavimo u int kod while nece uopste se izvrsiti
        // dok kod do while ce se izvrsiti samo jednom i nikad vise jer je ispred uslova
        System.out.println("Broj je: " + number);
        number++;
    } while (number<=5);
    }
}
