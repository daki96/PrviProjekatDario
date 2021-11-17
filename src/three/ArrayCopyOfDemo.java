package three;

// Joah Block knjiga effective Java; Herbert Schildt java( the complete reference)

import java.util.Arrays;
// Drugi i laksi nacin kopiranja elemenata niza

public class ArrayCopyOfDemo {
    public static void main(String[] args) {
        char[] slova = {'d', 'e','c','a','f','e','t','i','n','w','o','q'};
        char[] odredisniNiz = Arrays.copyOfRange(slova, 2,9);
        System.out.println(new String(odredisniNiz)); // String se stavlja u sout u ovoj situaciji da bi dobili
        // ovu vrijednost odredisniNiz u tekstualnoj formi jer ako ne dodamo String bit ce samo memorijska lokacija npr(iwn4n35nk)
    }
}
