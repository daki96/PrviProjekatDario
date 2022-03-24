package four;

import javax.swing.*;

public class SwitchWeekDemo {
    public static void main(String[] args) {
        String imeDana = JOptionPane.showInputDialog("Unesi ime dana na Njemackom: ");
        int brojDana = 0;
        switch(imeDana) {
            case "Montag":
                brojDana = 1;
                break;
            case "Dienstag":
                brojDana= 2;
                break;
            case "Mittwoch":
                brojDana = 3;
                break;
            case "Donnerstag":
                brojDana = 4;
                break;
            case "Freitag":
                brojDana = 5;
                break;
            case "Samstag":
                brojDana = 6;
                break;
            case "Sonntag":
                brojDana = 7;
                break;
            default:
                System.out.println("You need to learn how much a week has days");

        }
        //System.out.println(imeDana + " u sedmici je " + brojDana + " dan po redu ");
        JOptionPane.showMessageDialog(null, imeDana + " u sedmici je " + brojDana + " dan po redu ");
    }
}
