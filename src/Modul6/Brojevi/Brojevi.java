package Modul6.Brojevi;

import java.util.Arrays;

public class Brojevi {
    public static void main(String[] args) {

      int decimalnaV = 26;
      int octalniV = 032;   // broj 26 decimalni u oktalnom je 032
        int hexaD = 0x1a; // 26
        int binarniV = 0b11010;
        System.out.println(decimalnaV + " " + octalniV + " " + hexaD + " " + binarniV); // 26 26 26 26

        long creditCardNumber = 1234_5678_9123_4567L;
        System.out.println(creditCardNumber);// " _ " donja crta nam sluzi samo estetski da razdvojimo ove brojeve
        // te ona u izvrsavanju se ne pojavljuje tj samo bude ovaj broj ispisan bez razmaka

       // !!!!!!!!!//Integer myNumber = new Integer(16) // Integer je slozeni tip a takodjer i klasa ali ovako ne treba
        // vec se oni kreiraju kao standardni tipovi

      // Boxing je kada program konstruktoru prosledjuje ovu vrijednost integer Integer myNumber = new Integer(16)
      // Boxing je proces gdje se vrijednost prostog tipa konvertuje u odgovarajuci tip slozenog omotaca
        Integer myNumber = 16;

        // UNBOXING - suprotno od Boxinga - konvertovanje slozenog tipa nazad u primitivni tip

      int myPrimitiveNumber = myNumber; // posto i sami vidimo da nema problema da ovaj prosti tip ima vrijednost slozenog














        }
}
