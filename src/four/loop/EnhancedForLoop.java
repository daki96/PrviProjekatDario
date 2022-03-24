package four.loop;




// int number = 3
// number+=2; je isto kao i number = number + 2

public class EnhancedForLoop {
    public static void main(String[] args) {
       int[] numbers = {23, 13, 123 , 1234, 45, 67, 78};
//        System.out.println("Element na indeksu 0: " + numbers [0]); ako hocemo zakomentirat ovo sve onda sve oznacimo i ctrl + ( = )
//        System.out.println("Element na indeksu 1: " + numbers [1]); Da ne bi morali pisati svaki pojedinacno ovako za svaku vrijednost
//        System.out.println("Element na indeksu 2: " + numbers [2]); onda koristimo enhanced for kao sto je dole tj dodamo .lenght
//        System.out.println("Element na indeksu 3: " + numbers [3]); jer .lenght uzima sve iz niza i uvecava za jedan i tako daje
//        System.out.println("Element na indeksu 4: " + numbers [4]); laksi ispis svih vrijednosti
//        System.out.println("Element na indeksu 5: " + numbers [5]);
//        System.out.println("Element na indeksu 6: " + numbers [6]);
        for (int i = 0; i <= numbers.length; i++) {
            System.out.println("Element na indeksu " + i + ": " + numbers[i]);
                                                 // indeks ( 0 )+ vrijednost unutar indeksa (23)
        }
//        System.out.println();
//        System.out.println("Parni brojevi: ");
//        for (int i = 0; i < numbers.length; i+=2) {  // s ovim smo postigli da se ispisu samo brojevi na parnim pozicijama u zagradi od int[] numbers a ne parni brojevi
//            System.out.println();

        // SAD SU PARNI BROJEVI IPAK A NE INDEKSI ( INDEKSI SU POZICIJE UNUTAR ZAGRADE OD int [] { .... }
        System.out.println();
        System.out.println("Parni brojevi: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2==0) {      // a ako zelimo neparne samo umjesto %2==0 stavimo %2!=0 (!= - nije jednako)
                System.out.println("Paran broj na indeksu " +i+ " je " + numbers[i]);
            }

        }   // E SAD JE ENHANCED FOR PETLJA ( ovdje nas ne zanima indeks vec samo vrijednost na tom indeksu)
        System.out.println();
        System.out.println("Enhanced for loop");
        for(int number : numbers) {   // mi u enhanced for loop ne moramo voditi racuna o indeksu elementa unutar niza
            System.out.println(numbers);// vec samo definiramo neku varijablu kao npr ( int number ) vec nam java to odradi i provrti vrijednosti
            // ovo je situacija kad nas ne zanima indeks vec samo vrijednost na tom indeksu


        }
    }
}
