package four;

import javax.swing.*;
import java.util.jar.JarOutputStream;

/**
 * Kontrola toka
 *  Prosti tip podatka i njegovi omotaci
 *  int --> Integer   ( iz biblioteke java.lang )
 *  short --> Short
 *  double --> Double
 *
 */
public class SwitchDemo1 {
    public static void main(String[] args) {
        // switch-case-break
        // ime dana u sedmici na engleskom
        String brojDanaText = JOptionPane.showInputDialog("Unesi broj dana u sedmici ") ; // Ovu naredbu stavljamo kad zelimo da nam iskoci POP UP prozorcic
        // Ovo gore pamtimo kao komandu preko koje ce korisnik unijeti neki tekst i taj tekst ce biti pohranje u varijablu ( brojDanaText)
        // Zelimo sa omotacima ovu "2" --> prebaciti u integer vrijednost ( 2 )
        int brojDana = Integer.parseInt(brojDanaText); //mi cemo ovom komandom iz tekstualnog tipa formatirati u brojcani tj kad upisemo gore u pop up prozoru "2" da bude u integeru 2
        String imeDana = null; // kada samo ovu varijablu deklarisemo ona ima null vrijednost i moze bit izmjenjiva
        switch(brojDana) {
            case 1:
                imeDana = "Ponedeljak";
                break;
            case 2:
                imeDana = "Utorak";
                break;
            case 3:
                imeDana = "Srijeda";
                break;
            case 4:
                imeDana = "Cetvrtak";
                break;
            case 5:
                imeDana = "Petak";
                break;
            case 6:
                imeDana = "Subota";
                break;
            case 7:
                imeDana = "Nedelja";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Sedmica ima sedam dana, nema vise");

        }
        if (imeDana != null);
        JOptionPane.showMessageDialog(null, "Dan je :" +  imeDana );  //Ovu naredbu stavljamo da bi nam iskocio
        // prozorcic koji ce nam reci tu poruku kao npr ako upisemo preko JOption... br 6 onda cemo nakon toga dobiti ispis poruke Subota
    }
}
