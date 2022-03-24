package Modul6.Tekst;

public class Tekst4Index {
    public static void main(String[] args) {
        // Metoda INDEX  OFF - ona se koristi za utvrdjivanje ili postojanje karaktera ili grupe karaktera
        String str = "Welcome to ITA";

        System.out.println(str.indexOf('o')); // 4  - program nam izbacuje br 4 jer nam " o " se nalazi na indeksu 4
        // 0-W ; 1-e ; l-2 ; c-3 ; o-4!!!!

        System.out.println(str.indexOf('o',5));// 9 - Ovako kazemo programu da pocne pretragu od karaktera sa
        // indeksom 5



        String subStr1 = "ITA";
        System.out.println(str.indexOf(subStr1)); // 11 - to je indeks na kojem pocinje ovaj string subStr1 u Stringu str
        // kada trazimo sto nesto sto ne postoji npr ITA.com onda izbaci samo -1

        // Metoda CHAR AT - vraca karaktere koji se nalaze na proslijedjenom indeksu

        String s = "This is String";
        char result = s.charAt(8);
        System.out.println(result);// S - slovo S se nalazi na 8 indeksu

        // Metoda subString

        String str2 = "Welcome to ITAcademy";
        System.out.print("Return value: ");
        System.out.println(str2.substring(11)); // ITAcademy - prva metoda prihvata samo jedan parametar koji oznacava pocetak
        // isjecka, to znaci da ce prvi karakter isjecka biti koji se nalazi na poziciji 11 pa ce se nastavitt do kraja

        System.out.print("Return Value: ");
        System.out.println(str2.substring(11,14));// ITa - dok ovdje je slucaj da prihvata prvi karakter 11 i zavrsava na
        // karakteru pod ineksom broja 14

    }
}
