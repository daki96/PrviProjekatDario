package Modul6.Tekst;

import java.util.Arrays;

public class Tekst6 {
    public static void main(String[] args) {

        String word = "--Hello--";
        // METODA REPLACE - ovom metodom mjenjamo karaktere unutar stringa, target oznacava koji treba zamjeniti
        // a replacement kojim cemo zamijeniti
        System.out.println(word.replace("-","*")); // **Hello**



        // METODA KOJOM JEDAN STRING PODIJELIMO NA NIZ STRINGOVA !!!! SPLIT

        String str = "Welcome-to-ITacademy";

        String[] wordArray = str.split("-",2); // Prvi parametar regex nam govori na osnovu cega je moguce obaviti
        // podjelu kao u ovom primjeru " - " tj gdje god se nalazi " - " obavit ce podjelu
        // A ovo limit 2 je broj clanova u koliko ce bit podjeljeno tj bit ce -
        //Welcome
        //to-ITacademy

        for (int i = 0; i < wordArray.length; i++) {
            String s = wordArray[i];
            System.out.println(s);
        }

        for (String s : wordArray){
            System.out.println(s);
        }



    }
}
