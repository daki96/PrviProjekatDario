package Modul6.Tekst;

public class Tekst7Split2 {
    public static void main(String[] args) {
        String str = "This is a sentence.  This is a question?  Yes!  It is.";

        String[] wordArray = str.split("[ .,!?]+");// Ako uklonimo karakter " + " onda ce u nizu postojati
        // razmaci tj Stringovni space razmaci

        for (int i = 0; i < wordArray.length; i++) {
            System.out.println(wordArray[i]);

        }
    }
}
