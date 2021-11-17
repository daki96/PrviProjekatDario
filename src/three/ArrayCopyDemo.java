package three;

public class ArrayCopyDemo {
    // Kopiranje elemenata niza jedan od nacina
    public static void main(String[] args) {
        //drugi pristup
        char[] slova = {'d', 'e','c','a','f','e','t','i','n','w','o','q'}; // definirali smo elemente niza "slova"
        char[] odredisniNiz = new char[7]; // kreirali prazan niz "odredisniNiz" koji je duzine 7
        System.arraycopy(slova, 2, odredisniNiz,0,odredisniNiz.length); // pozivam sistem preko "arraycopy"
        // i kopiram iz prvog niza "slova" pocevsi od pozicije 2 kopiram u moj "odredisniNiz" (slova,srcPos2, odredisniNiz)
        // , kako ih kopiram? pa od nulte pozicije pa do duzine niza (destPos: 0, odredisniNiz.lenght)
        String text = new String(odredisniNiz); // posto "odredisniNiz" vise nije prazan onda stavljamo String(niz tekstualnih karaktera)
        System.out.println(text); // s ovim provjeravamo da li je sav niz onakav kako smo mi to napravili

    }
}
