package Modul6.Brojevi;

public class Brojevi1Integer {
    public static void main(String[] args) {
        Integer myInteger1 = 1;
        Integer myInteger2 = 16;

        System.out.println(myInteger1.compareTo(myInteger2));// -1  ovo je poredjenje dva Integera, rezultat je -1 jer je 1 manje od 16
        // a kada je broj veci prvi od drugog onda je 1 rezultat, nebitno koji se broj upise ako je veci je 1 ako je manji onda -1

        System.out.println(Integer.sum(22,33));  //s ovom funkcijom .sum sabiramo brojeve
        System.out.println(Integer.max(30,20)); // metodom .max utvrdjujemo koja je vrijednost najveca tj rezultat je 30
        System.out.println(Integer.min(30,20));  // metodom .min utvrdjujemo koja je vrijednost manja


    }
}
