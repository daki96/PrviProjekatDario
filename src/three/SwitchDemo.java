package three;

import java.util.Scanner;

// kontrola toka bez if else ( SWITCH CASE BREAK ) konstrukcija
public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println("Unesi broj dana u sedmici ");
        int brojDanaUSedmici = new Scanner(System.in).nextInt();
        //if (brojDanaUSedmici >= 1 && brojDanaUSedmici <= 7){
         switch (brojDanaUSedmici) {   // u switch ide integer ili nesto sto je konvertibilno integeru.. switchali smo se na neku value(brojDanaUSedmici)
             case 1: // koja je bila povezana s ovim case (1) ili bilo koji drugi broj,
                 System.out.println("Monday");  //ako je broj dana stavljen 1 odma smo obradjivali ovaj blok koda(SOUT MONDAY)
                 break; // nakon toga nas je break vadio iz cijele switch konstrukcije i zavrsavao taj dio
             case 2:
                 System.out.println("Tuesday");
                 break;
             case 3:
                 System.out.println("Wednesday");
                 break;
             case 4:
                 System.out.println("Thursday");
                 break;
             case 5:
                 System.out.println("Friday");
                 break;
             case 6:
                 System.out.println("Saturday");
                 break;
             case 7:
                 System.out.println("Sunday");
                 break;
             default:
                 System.out.println("Netacan broj dana u sedmici");
         }

    } //else {
           // System.out.println("Vi jos ne znate ni koliko sedmica ima dana");
    //}
}