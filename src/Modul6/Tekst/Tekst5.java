package Modul6.Tekst;

public class Tekst5 {
    public static void main(String[] args) {
        String str = "Welcome to ITacademy";
         // STARTS WITH
        System.out.print("Return value: ");
        System.out.println(str.startsWith("Welcome")); // TRUE - Pocinje sa welcome pa je true

        System.out.print("Return value: ");
        System.out.println(str.startsWith("ITacademy")); // FALSE - ne pocinje tako pa je False

        System.out.print("Return value: ");
        System.out.println(str.startsWith("ITacademy",11)); // TRUE- Ovom OFFSET metodom utvrdjujemo da li sa
        // pozicije tj indeksa br 11 pocinje dati prefix ili rijec koju smo unijeli posto pocinje onda je true

        // ENDS WITH !!!

        String str1 = "This is a String";
        boolean returnValue;

        returnValue = str1.endsWith("String");
        System.out.println("Return value: " + returnValue); // TRUE - ova metoda utvrdjuje da li se ovim karakterima
        // zavrsava vrijednost

        returnValue = str1.endsWith("This");
        System.out.println("Return value: " + returnValue); // FALSE - tekst se ne zavrsava sa ovom rjecju






    }
}
