package five;

/**
 * Slozeni tipovi
 * niz
 */
public class BreakWithLabelDemo {
    public static void main(String[] args) {
//       - int number = 23;
//        number = 13; // ovdje vidimo da bez niza gubimo vrijednost 23 tj stavili smo novu vrijednost 13.
//       - // 1. NACIN NIZA
//        int [] numbers = new int[5]; // OVO KORISTIMO AKO NE ZNAMO UNAPRIJED VRIJEDNOSTI PA IH POSLE ODREDJUJEMO
//        numbers [0] = 23;
//        numbers [1] = 13;
//       - //2. Nacin NIZA
//        int [] = {23,12,34,55,33}; // OVO KORISTIMO KADA UNAPRIJED ZNAMO VRIJEDNOSTI
//       - String ime = "Dario";
//        String [] names = {}; //Niz stringova je omedjen viticastim zagradama,
//       - int [][] twoDimensional = { // NIZ NIZOVA
//                {23, 34},     // 1 element
//                {12, 10676, 8, 2000}, // 2 element
//                {634, 77, 99}  // 3 element
//
//        -String ime = "DARIO";
//        ime.length();
//        System.out.println(ime.length()); // ISPISAT CE SE 5 ZATO STO JE STRING NIZ KARAKTERA

//         -.lenght je indikator nizova, na nizovnim varijablama mozete staviti .lenght i saznati njihovu duzinu
//          -int number = 23;
//           number.lenght; ovo je netacno jer je lenght za niz a mi imamo gore na liniji iznad samo 23.

        int[][] numbers = {
                {23, 24, 32, 13},
                {12, 1012, 2000, 80},  // OVO JE MATRICA
                {765, 345, 2, 123}
        };
        System.out.println(numbers.length); // lenght stavljamo za nizove(indikator nizova) da vidimo duzinu tj 3 skupa viticastih zagrada
        int[] prviElement = numbers[0]; //Ovako pristupamo prvom skupu odozgo u nizu tj {23,24,32,13}
        System.out.println("Prvi element duzine: " + numbers[0].length);




    }
}
