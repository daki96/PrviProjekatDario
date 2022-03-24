package Modul6.Brojevi;

public class Brojevi2Math {
    public static void main(String[] args) {
        System.out.println(Math.abs(-17)); // ABSOLUTE koristi se za racunanje apsolutne vrijednosti nekoga broja,
        // kada joj posaljemo negativnu vrijednost(-17) ona vraca pozitivnu(17) te ako joj posaljemo pozitivnu(17) ona ispisuje tu istu (17)

        System.out.println(Math.min(17,23)); // za utvrdjivanje najmanjeg broja
        System.out.println(Math.max(17,23)); // za utvrdjivanje najveceg broja

        System.out.println(Math.sqrt(16)); // Metoda za racunanje kvadratnog korijena, kvadratni korijen od 16 je 4.0

        System.out.println(Math.pow(4,2));// Metoda podizanja za stepen i ovo ispada 4 na kvadrat i to je 16;
        // Kada bi postavili 4,3 onda bi bilo 4 na trecu tj 64.0 rezultat

        System.out.println(Math.signum(-17)); // ova metoda se koristi za utvrdjivanje znaka broja odnosno da li je
        // pozitivan ili negativan ; rezultat : -1

        System.out.println(Math.random());// ovo je metoda koja vraca nasumicnu double vrijednost vecu ili jednaku od nule
        // a manju od 1, svakim novim pokretanjem programa dobijamo neku drugu vrijednost

    }
}
