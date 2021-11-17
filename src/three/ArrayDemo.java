package three;

import java.util.Scanner;

// NIZOVI     "int[]"
public class ArrayDemo {
    public static void main(String[] args) {
        // TIP varijabla = vrijednost
        int number1 = 23;

        // Kako od ovog prostom tipa kreirati SLOZENI
        // int[] numbers      // samo dodamo uglasne zagrade i ond je ovo indikator da ovo vise nije prost tip nego
        // slozeni i da za ovu varijablu(numbers) ne moramo vezati jednu vrijednost nego 3 ili vise vrijednosti.

        // Postoje 2 nacina konstruisanja niza
        // 1.Konstrukcije niza
        //int[] numbers = new int[3];            // " new " koristimo kad nam je potrebno memorije zargonski. Daj mi memorije!!
        // da ja u nju mogu upisat 3 integerska broja... Imamo od ova 3 broja ( 0 ; 1 ; 2 ) tj 3 pozicije

        // numbers[0] = 23;   //ovako kazemo programu da ubaci 23 vrijednost na 0 poziciju od moguce 3 ( 3 * 32bit )
        // numbers[1] = 32;    ili npr 32 ili 13 za svaki indeksni slot
        // numbers[2] = 13;
        // da bi promjenili ime varijable kao npr iz "number1" u "numbers" idemo na Shift + Fn + F6 i onda selektujemo sve

        int[] numbers = new int[3];
        System.out.println("Unesi prvi broj : "); // ovo koristimo da ne bi korisniku samo blinkalo vec da zna da treba unijeti broj

        numbers[0] = new Scanner(System.in).nextInt();   // evo primjer kada dajemo korisniku sansu da ubacuje podatke i kako
        System.out.println("Unesi drugi broj :  ");
        numbers[1] = new Scanner(System.in).nextInt();
        System.out.println("Unesi treci broj : ");
        numbers[2] = new Scanner(System.in).nextInt();
        System.out.println(numbers[0] + "," + numbers[1]+"," + numbers[2]);// ovako se ispisu sva tri broja npr 5,4,2

        // Drugi nacin
       // int[] drugiNiz = {23, 13, 133};
    }
}
