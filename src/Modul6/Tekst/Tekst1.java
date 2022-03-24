package Modul6.Tekst;

public class Tekst1 {
    public static void main(String[] args) {
        // Izmedju ova dva nacina kreiranja Stringa postoji znacajna razlika (IMPLICITNI I EKSPLICITNI
        // IMPLICITNI
        String message = "Hi"; // IMPLICITNI nacin kreiranja String; ovaj nacin podrazumijeva smjestanje vrijednosti
        // direktno unutar jednog posebnog odjeljka u dinamickom dijelu memorije koji se naziva STRING POOL
        // Unutar String POOL se smjestaju odredjene vrijednosti i ukoliko postoji veci broj promjenjljivih koji imaju
        // Identicnu ili istu vrijednost, sve takve promjenjljive ce da pokazuju na istu vrijednost unutar Stringa

        // EKSPLICITNI
        String word = new String("Hi");
        String word1 = new String("Hi");
        // EKSPLICITNI nacin kreiranja String - ovaj nacin smjesta vrijednost direktno unutar HEAP-a i svakim novim
        // instanciranjem klase String uvijek se kreira novi objekat bez obzira bila njegova vrijednost ista kao i
        // kod nekog drugog objekta

        System.out.println(word==word1); //FALSE - u ovom poredjenju rezultat je false tj izbacuje da vrijednosti nisu iste
        // iako jesu vizuelno unutar memorije nisu zbog referenci tj dva nezavisna objekta OVAKO SE NE POREDE STRINGOVI

        // VAZNO !! ZA PRAVILNO POREDJENJE EKSPLICITNIH METODA tj NJIHOVIH VRIJEDNOSTI SE KORISTI .equals

        System.out.println(word.equals(word1)); // TRUE

    }
}
